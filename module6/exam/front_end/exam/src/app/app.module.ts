import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import { HomeComponent } from './common/home/home.component';
import {FooterComponent} from './common/footer/footer.component';
import {NavBarComponent} from './common/nav-bar/nav-bar.component';
import {ErrorComponent} from './common/error/error.component';
import { CreateComponent } from './san-pham/create/create.component';
import { ListComponent } from './san-pham/list/list.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    NavBarComponent,
    ErrorComponent,
    HomeComponent,
    CreateComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(
      {
        timeOut: 2000,
        closeButton: true,
        progressBar: true,
        positionClass: 'toast-top-right',
        preventDuplicates: true,
      }
    ),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
