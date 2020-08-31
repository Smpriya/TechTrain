import { Injectable } from '@angular/core';
import { Auth } from './auth';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { retry, catchError,map } from 'rxjs/operators';
import { Authresponse } from './authresponse';
import { Rt } from './rt';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private refreshTokenTimeout;

  constructor(private httpc:HttpClient) { }

  authurl = "http://localhost:8080/authenticate";

  doAuth(a:Auth) : Observable<Authresponse> {
    return this.httpc.post<Authresponse>(this.authurl,a).pipe(
      //retry(5), // retry a failed request up to 3 times
    )
  }

  refreshToken(): Observable<Rt>{
    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    let headers:HttpHeaders = new  HttpHeaders();
    headers.set("authorization", "Bearer " + token);
    headers.set("isrefreshtoken", "true");

    return this.httpc.post<Rt>("http://localhost:8080/refreshtoken", {headers}).pipe(
      map((res:Rt)=>{
        this.startRefreshTokenTimer();
        return res;
      }
        
      )
    );
  }

  private startRefreshTokenTimer() {
    let token = sessionStorage.getItem("token");
    const jwtToken = JSON.parse(atob(token.split('.')[1]))
    const expires = new Date(jwtToken.exp * 1000);
    const timeout = expires.getTime() - Date.now() - (60 * 1000);
    this.refreshTokenTimeout = setTimeout(() => this.refreshToken().subscribe(
      (res:Rt)=>{
        console.log("Getting Refresj token..." + res.token);
        sessionStorage.setItem("token",res.token);
      }
    ), timeout);
  }

}
