import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public title:string = 'i18nDemoV8';
  public newMessages:number = 5;

  languageList = [ // <--- add this
    { code: 'en', label: 'English' },
    { code: 'ta', label: 'தமிழ்' },
    { code: 'hd', label: 'हिन्दी' }
  ];
}
