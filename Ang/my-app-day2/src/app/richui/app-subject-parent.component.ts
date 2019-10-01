import { Component } from "@angular/core";
import { MyMessageService } from "../service/mymessage.service";

@Component({
  selector: "app-subject-parent",
  template: `
    <h2>Parent Subject</h2>
    <input
      #box
      (change)="sendmessage(box.value)"
      placeholder="Enter Text Here.."
    />
    <button (click)="clearMessages()" value="clear"></button>
  `
})
export class AppSubjectParent {
  constructor(private messageService: MyMessageService) {}

  public sendmessage(value: string): void {
    console.log("value==" + value);
    this.messageService.sendMessage("Message from Parent..." + value);
  }

  clearMessages(): void {
    // clear messages
    this.messageService.clearMessages();
  }
}
