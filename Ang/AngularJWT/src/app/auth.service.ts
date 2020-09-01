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
      //this.startRefreshTokenTimer();
      map((auth:Authresponse)=>{
        console.log("#1 Service.." + auth.token);
        sessionStorage.setItem("token",auth.token);
        //this.startRefreshTokenTimer();
        return auth;
      })
    );
  }

  refreshToken(): Observable<Rt>{
    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    //let headers = new Headers();
    //headers.append('authorization', 'Basic ' +token);
    //headers.append('isrefreshtoken', "true");
    //let headers:HttpHeaders = new  HttpHeaders();
    //headers.append("authorization", "Bearer " + token);
    //headers.append("isrefreshtoken", "true");
    const httpHeaders: HttpHeaders = new HttpHeaders({
      authorization: `Bearer ${token}`,
      isrefreshtoken: 'true'
    });
    
    console.log("..#5...Heades" + JSON.stringify(httpHeaders));
    return this.httpc.get<Rt>("http://localhost:8080/refreshtoken" ,{headers:httpHeaders}).pipe(
      map((res:Rt)=>{
        //this.startRefreshTokenTimer();
        return res;
      }
        
      )
    );
  }

  private startRefreshTokenTimer() {
    let token = sessionStorage.getItem("token");
    console.log("#1..." + token);
    const jwtToken = JSON.parse(atob(token.split('.')[1]))
    console.log("#2..." + JSON.stringify(jwtToken));
    const expires = new Date(jwtToken.exp * 1000);
    console.log("#3..." + JSON.stringify(expires));
    
    const timeout = expires.getTime() - Date.now() - (60 * 1000);
    console.log("#4..." + timeout);
    this.refreshTokenTimeout = setTimeout(() => this.refreshToken().subscribe(
      (res:Rt)=>{
        console.log("# NNGetting Refresj token..." + res.token);
        sessionStorage.setItem("token",res.token);
      }
    ), timeout);
  }

}
