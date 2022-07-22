import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoComponent } from './todo/todo.component';
import {ReactiveFormsModule} from '@angular/forms';
import { CreateRegistrationFormComponent } from './create-registration-form/create-registration-form.component';
import { CreateLoginFormComponent } from './create-login-form/create-login-form.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoComponent,
    CreateRegistrationFormComponent,
    CreateLoginFormComponent
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
