import { Component,Input, OnChanges,SimpleChanges, ViewChild } from '@angular/core';
import {Hero} from '../model/hero';
import {OnChangesComponent} from '../on-changes/on-changes.component';


@Component({
  selector: 'fundstransfer',
  templateUrl: './fundtransferform.component.html',
  styleUrls: [ './fundtransferform.component.css' ]
})
export class FundtransferformComponent   {

  hero: Hero;
  power: string;
  title = 'OnChanges';

  @ViewChild(OnChangesComponent) childView: OnChangesComponent;

  constructor() {
    this.reset();
  }

  reset() {
    // new Hero object every time; triggers onChanges
    this.hero = new Hero('Windstorm');
    // setting power only triggers onChanges if this value is different
    this.power = 'sing';
    if (this.childView) {
      this.childView.reset();
    }
  }


}
