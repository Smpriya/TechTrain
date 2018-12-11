import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { BootStrapformComponent }    from './bootstrapform.component';

const richuiValRoutes: Routes = [
  { path: 'mybootstrap',  component: BootStrapformComponent }
];

@NgModule({
  imports: [
    RouterModule.forChild(richuiValRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class RichUInRoutingModule { }
