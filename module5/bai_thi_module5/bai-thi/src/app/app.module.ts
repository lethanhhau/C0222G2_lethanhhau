import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './common/footer/footer.component';
import { NavBarComponent } from './common/nav-bar/nav-bar.component';
import { ErrorComponent } from './error/error/error.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import { CreateComponent } from './lo-hang/create/create.component';
import { ListComponent } from './lo-hang/list/list.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import { EditComponent } from './lo-hang/edit/edit.component';
// import { PdfComponent } from './lo-hang/pdf/pdf.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    NavBarComponent,
    ErrorComponent,
    CreateComponent,
    ListComponent,
    EditComponent,
    // PdfComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    HttpClientModule,
    ReactiveFormsModule,
    NgxPaginationModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
