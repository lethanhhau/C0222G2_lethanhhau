import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConsignmentListComponent } from './consignment/consignment-list/consignment-list.component';
import { ConsignmentCreateComponent } from './consignment/consignment-create/consignment-create.component';
import { ConsignmentEditComponent } from './consignment/consignment-edit/consignment-edit.component';
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";

@NgModule({
  declarations: [
    AppComponent,
    ConsignmentListComponent,
    ConsignmentCreateComponent,
    ConsignmentEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
