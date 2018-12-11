import { ErrorHandler ,Injectable} from '@angular/core';
import { ErrorLogService } from '../service/log.service';

@Injectable()
export class GlobalErrorHandler extends  ErrorHandler {
   constructor(private errorLogService: ErrorLogService) {
     super();
   }

   handleError(error) {
     //super.handleError(error);
     console.log('Hio')
     alert(`Error occurred:${error.message}`);
     // IMPORTANT: Rethrow the error otherwise it gets swallowed
     this.errorLogService.logError(error);
     //throw error;
   }
    // empty comment


}
