import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListBillComponent } from './list-bill/list-bill.component';
import { DetailBillComponent } from './detail-bill/detail-bill.component';

@NgModule({
  declarations: [
    AppComponent,
    ListBillComponent,
    DetailBillComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
