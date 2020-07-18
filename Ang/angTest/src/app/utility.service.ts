import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UtilityService {

  public users:Array<object> = [
    {
      id:"1",
      name:"Abd"
    }
  ]

  constructor() { }
}
