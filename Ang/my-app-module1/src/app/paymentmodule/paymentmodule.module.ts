import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { FundtransferformComponent }  from './fundtransferform.component';

import {OnChangesComponent} from '../on-changes/on-changes.component';

@NgModule({
  imports: [
    CommonModule,FormsModule
  ],
  declarations: [FundtransferformComponent,OnChangesComponent]
})
export class PaymentmoduleModule { }
