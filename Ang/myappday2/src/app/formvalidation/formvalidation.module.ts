import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule,ReactiveFormsModule }    from '@angular/forms';

import { FormValidationRoutingModule } from './formval-routing.module';

import { SimpleformComponent }  from './simpleform.component';
import { ReactiveformComponent }  from './reactiveform.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    FormValidationRoutingModule,
    ReactiveFormsModule
  ],
  declarations: [SimpleformComponent,ReactiveformComponent]
})
export class FormvalidationModule { }
