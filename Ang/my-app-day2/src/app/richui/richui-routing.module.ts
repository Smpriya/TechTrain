import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { BootStrapformComponent }    from './bootstrapform.component';
import {ComponentInteractionComponent} from './componentinteraction.component';
import {BooksViewComponent} from './booksview.component';

const richuiValRoutes: Routes = [
  { path: 'mybootstrap',  component: BootStrapformComponent },
  { path: 'component-interaction', component:ComponentInteractionComponent},
  { path: 'books-view', component:BooksViewComponent}
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
