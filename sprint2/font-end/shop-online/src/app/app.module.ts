import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './common/header/header.component';
import {FooterComponent} from './common/footer/footer.component';
import {HomeComponent} from './common/home/home.component';
import {HomeLoginComponent} from './login/home-login/home-login.component';
import {CartComponent} from './cart/cart.component';
import {DetailComponent} from './detail/detail.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import { ChangePasswordLoginComponent } from './login/change-password-login/change-password-login.component';
import { Error401PageComponent } from './login/error401-page/error401-page.component';
import { Error403PageComponent } from './login/error403-page/error403-page.component';
import { Error404PageComponent } from './login/error404-page/error404-page.component';
import { ForgotPasswordLoginComponent } from './login/forgot-password-login/forgot-password-login.component';
import { LoadingComponent } from './login/loading/loading.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    HomeLoginComponent,
    CartComponent,
    DetailComponent,
    ChangePasswordLoginComponent,
    Error401PageComponent,
    Error403PageComponent,
    Error404PageComponent,
    ForgotPasswordLoginComponent,
    LoadingComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
