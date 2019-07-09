import { Injectable } from "@angular/core";
import {
  HttpEvent,
  HttpInterceptor,
  HttpHandler,
  HttpRequest,
  HttpErrorResponse
} from "@angular/common/http";
import { Observable } from "rxjs";
import "rxjs/add/operator/do";
//import { environment } from "path to environment/environments/environment";

@Injectable()
export class ResponseInterceptor implements HttpInterceptor {
  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return next.handle(request).do(
      (event: HttpEvent<any>) => {
        console.log("#####In Sucess Interceptors........");
      },
      (err: any) => {
        if (err instanceof HttpErrorResponse) {
          //this.errorHandler.handleError(err);
          console.log("#####In Error Interceptors.......");
          console.log("err.status", err);
        }
      }
    );
  }
}
