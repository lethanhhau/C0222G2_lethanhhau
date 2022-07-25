import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DictionaryPageComponent } from './ lookup-dictionary/dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './ lookup-dictionary/dictionary-detail/dictionary-detail.component';
import { ProductListComponent } from './product-management/product/product-list/product-list.component';
// @ts-ignore
import { ProductCreateComponent } from './product-management/product-create/product-create.component';
import { ProductEditComponent } from './product-management/product/product-edit/product-edit.component';
import { ProductDeleteComponent } from './product-management/product/product-delete/product-delete.component';
import {ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    DictionaryPageComponent,
    DictionaryDetailComponent,
    ProductListComponent,
    ProductCreateComponent,
    ProductEditComponent,
    ProductDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
