import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'forexmanagement',
  templateUrl: './forexmgmtform.component.html',
  styleUrls: [ './forexmgmtform.component.css' ]
})
export class ForexManagementformComponent  implements OnInit  {
    ngOnInit() {
        console.log("Forex Transfer......OnInit[]");
    }
}
