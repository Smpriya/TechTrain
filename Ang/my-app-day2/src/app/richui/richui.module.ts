import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";

import { RichUInRoutingModule } from "./richui-routing.module";
import { BootStrapformComponent } from "./bootstrapform.component";
import { ComponentInteractionComponent } from "./componentinteraction.component";

import { AppBookParentComponent } from "./app-book-parent.component";
import { AppBookChildComponent } from "./app-book-child.component";

import { AppNameChildComponent } from "./app-name-child.component";
import { AppNameParentComponent } from "./app-name-parent.component";
import { BooksViewComponent } from "./booksview.component";
import { EmitViewComponent } from "./emitview.component";
import { MyDirectivesComponent } from "./mydirectives.component";

import { BooksService } from "./books.service";
import { StockStatusComponent } from "./stockstatus.component";

import { EmojiDirective } from "../directives/emoji.directive";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RichUInRoutingModule,
    ReactiveFormsModule
  ],
  declarations: [
    BootStrapformComponent,
    ComponentInteractionComponent,
    AppBookParentComponent,
    AppBookChildComponent,
    AppNameChildComponent,
    AppNameParentComponent,
    BooksViewComponent,
    EmitViewComponent,
    StockStatusComponent,
    MyDirectivesComponent,
    EmojiDirective
  ],
  providers: [BooksService]
})
export class RichUIModule {}
