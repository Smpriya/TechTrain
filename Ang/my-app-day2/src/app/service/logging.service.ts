import { Injectable } from "@angular/core";
import { ErrorPayload } from "../uimodel/error";

@Injectable({
  providedIn: "root"
})
export class LoggingService {
  logError(message: string, stack: string) {
    // Send errors to server here
    console.log("LoggingService: " + message);
  }

  logError(message: ErrorPayload) {
    // Send errors to server here
    console.log("LoggingService: " + message);
  }
}
