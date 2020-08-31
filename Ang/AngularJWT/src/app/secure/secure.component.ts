import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';
import { Country } from '../country';
import { ResolveStart } from '@angular/router';
import { HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-secure',
  templateUrl: './secure.component.html',
  styleUrls: ['./secure.component.css']
})
export class SecureComponent implements OnInit {

  public countries: Country[] = null;

  constructor(private common: CommonService) { }

  ngOnInit(): void {
    this.common.getCountries().subscribe((res: Country[]) => {
      this.countries = res;
      console.log("====Country=====" + JSON.stringify(this.countries));
    },
      err => {
        console.error("Error in Observable==" + JSON.stringify(err));
      },
      () => console.log("Processing Complte."));
  
  //    this.common.doRegister("user1" + new Date(),"test").subscribe(
  //      ()=>{
  //        console.log("==============data creasted")
  //      }
  //    )


   //   this.common.getTestData().subscribe((res: any) => {
   //     console.log("====testdt====" + res);
   //   },
   //     err => {
   //       console.error("Error in Observable==" + JSON.stringify(err));
   //     },
   //     () => console.log("Processing Complete."));
  }

  public getc(){
    this.common.getCountries().subscribe((res: Country[]) => {
      this.countries = res;
      console.log("====Country=====" + JSON.stringify(this.countries));
    },
      err => {
        console.error("Error in Observable==" + JSON.stringify(err));
      },
      () => console.log("Processing Complte."));
  }
    

}
