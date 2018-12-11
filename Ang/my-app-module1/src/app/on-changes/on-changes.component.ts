import {Component, Input, OnChanges,SimpleChanges, ViewChild} from '@angular/core';

import {Hero} from '../model/hero';

@Component({
  selector: 'on-changes',
  templateUrl: './on-changes.component.html',
  styleUrls: ['./on-changes.component.css']
})
export class OnChangesComponent implements OnChanges {

  @Input() hero: Hero;
  @Input() power: string;

  changeLog: string[] = [];

  ngOnChanges(changes: SimpleChanges) {
    for (let propName in changes) {
      let chng = changes[propName];
      let cur  = JSON.stringify(chng.currentValue);
      let prev = JSON.stringify(chng.previousValue);
      console.log(`${propName}: currentValue = ${cur}, previousValue = ${prev}` );
      this.changeLog.push(`${propName}: currentValue = ${cur}, previousValue = ${prev}`);
    }
  }

  reset() {
    this.changeLog = [];
  }

}
