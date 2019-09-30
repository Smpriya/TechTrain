import { ErrorHandler, Injectable, Injector } from "@angular/core";
import { HttpErrorResponse } from "@angular/common/http";
import { LoggingService } from "../service/logging.service";
import { ErrorService } from "../service/error.service";
import { NotificationService } from "../service/notification.service";
import { CommonService } from "../service/common.service";

@Injectable()
export class GlobalErrorHandler implements ErrorHandler {
  constructor(private injector: Injector) {}

  handleError(error: Error | HttpErrorResponse) {
    const errorService = this.injector.get(ErrorService);
    const logger = this.injector.get(LoggingService);
    const notifier = this.injector.get(NotificationService);
    const commonService = this.injector.get(CommonService);

    let message;
    let stackTrace;
    if (error instanceof HttpErrorResponse) {
      // Server error
      message = errorService.getServerErrorMessage(error);
      //stackTrace = errorService.getServerErrorStackTrace(error);
      notifier.showError(message);
    } else {
      // Client Error
      message = errorService.getClientErrorMessage(error);
      notifier.showError(message);
    }
    logger.logError(JSON.stringify(commonService.prepareErrorPayload(error)));
    // Always log errors
    //logger.logError(message, stackTrace);
    //console.error(error);
  }
}
