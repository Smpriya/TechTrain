import { Injectable } from '@angular/core';
import { Auth } from './auth';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { retry, catchError,map } from 'rxjs/operators';
import { Authresponse } from './authresponse';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private httpc:HttpClient) { }

  authurl = "http://localhost:8080/authenticate";

  doAuth(a:Auth) : Observable<Authresponse> {
    return this.httpc.post<Authresponse>(this.authurl,a).pipe(
      //retry(5), // retry a failed request up to 3 times
    )
  }

  refreshToken() {

    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    let headers:HttpHeaders = new  HttpHeaders();
    headers.set("authorization", "Bearer " + token);
    headers.set("isrefreshtoken", "true");

    return this.httpc.post<any>("http://localhost:8080/refreshtoken", {headers}, { withCredentials: true })
        .pipe(map((res:any) => {
            //this.userSubject.next(user);headers
            //this.startRefreshTokenTimer();
            //return user;
        }));
  }
}
