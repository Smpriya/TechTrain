import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppRoutingModule }     from './app-routing.module';

import { PaymentmoduleModule } from './paymentmodule/paymentmodule.module';
import { ForexmoduleModule } from './forexmodule/forexmodule.module';
import { LoginComponent } from './login/login.component';
//import { OnChangesComponent } from './on-changes/on-changes.component';

import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ForexmoduleModule,
    PaymentmoduleModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
