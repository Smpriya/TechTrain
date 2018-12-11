import { Injectable } from '@angular/core';
import { Headers } from '@angular/http';
import { Observable }        from 'rxjs/Observable';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { ErrorObservable } from 'rxjs/observable/ErrorObservable';
import { catchError, retry } from 'rxjs/operators';

import { User } from './uimodel/user';

import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map'

@Injectable()
export class AuthService {
  private usersUrl = 'api/users';  // URL to web api
  private headers = new Headers({'Content-Type': 'application/json'});
  isLoggedIn = false;

  constructor(private http: HttpClient) { }


  fetchUser(id: string): Observable<User> {
    const url = `${this.usersUrl}/${id}`;
    console.log("=========" + url);
    return this.http.get<User>(url).pipe(
        retry(3),
        catchError(this.handleError));
  }

  getUserResponse(): Observable<HttpResponse<User>> {
    return this.http.get<User>(
      this.usersUrl, { observe: 'response' });
  }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
        // The backend returned an unsuccessful response code.
        // The response body may contain clues as to what went wrong,
        console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
      }
      // return an ErrorObservable with a user-facing error message
      return new ErrorObservable(
        'Something bad happened; please try again later.');
  };


}
