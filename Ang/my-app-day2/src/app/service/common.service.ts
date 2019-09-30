import { UUID } from "angular2-uuid";
import { Injectable } from "@angular/core";

import { ErrorPayload } from "../uimodel/error";

@Injectable({
  providedIn: "root"
})
export class CommonService {
  public prepareErrorPayload(error: Error): ErrorPayload {
    let modulename = "undefined";
    let data = "";
    let message = error.message;

    console.log(error.message + "," + error.message.indexOf("-"));
    if (error.message.indexOf("-") > -1) {
      modulename = error.message.split("-")[1];
      message = error.message.split("-")[0];
      if (error.message.split("-").length > 2) {
        data = error.message.split("-")[2];
      }
    }

    let ePayload: ErrorPayload = new ErrorPayload();
    ePayload.corrid = UUID.UUID();
    ePayload.name = error.name;
    ePayload.ts = new Date();
    ePayload.errormessage = message;
    ePayload.modulename = modulename;
    ePayload.data = data;
    ePayload.stacttrace = error.stack;
    return ePayload;
  }
}
