import { Component, OnDestroy } from "@angular/core";
import { MyMessageService } from "../service/mymessage.service";
import { Subscription } from "rxjs";

@Component({
  selector: "app-subject-child",
  template: `
    <h2>Child Subject</h2>

    <div *ngFor="let val of messages">
      {{ val }}
    </div>
  `
})
export class AppSubjectChild implements OnDestroy {
  messages: string[] = [];
  subscription: Subscription;

  constructor(private messageService: MyMessageService) {
    // subscribe to home component messages
    this.subscription = this.messageService.getMessage().subscribe(message => {
      console.log("child==" + message);
      if (message) {
        this.messages.push(JSON.stringify(message));
      } else {
        // clear messages when empty message received
        this.messages = [];
      }
    });
  }

  ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.subscription.unsubscribe();
  }
}
