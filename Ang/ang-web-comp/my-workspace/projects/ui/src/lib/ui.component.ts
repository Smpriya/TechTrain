import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'lib-ui',
  templateUrl: './ui.component.html',
  styleUrls: ['./ui.component.css']
})
export class UiComponent implements OnInit {

  public hour:number = 23;

  constructor() { }

  ngOnInit(): void {
  }

}