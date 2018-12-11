import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule,ReactiveFormsModule }    from '@angular/forms';

import { RichUInRoutingModule } from './richui-routing.module';
import { BootStrapformComponent }  from './bootstrapform.component';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RichUInRoutingModule,
    ReactiveFormsModule
  ],
  declarations: [BootStrapformComponent]
})
export class RichUIModule { }
