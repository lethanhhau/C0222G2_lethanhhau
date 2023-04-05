import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import {ReactiveFormsModule} from "@angular/forms";
import {AddInfoUserComponent} from './add-info-user/add-info-user/add-info-user.component';
import { UserCustomerComponent } from './user-customer/user-customer/user-customer.component';
import { ListCustomerComponent } from './list-customer/list-customer/list-customer.component';



@NgModule({
  declarations: [AddInfoUserComponent, UserCustomerComponent, ListCustomerComponent],
  imports: [
    CommonModule,
    CustomerRoutingModule,
    ReactiveFormsModule
  ],
  exports: [
    AddInfoUserComponent,
    UserCustomerComponent
  ]
})
export class CustomerModule { }
