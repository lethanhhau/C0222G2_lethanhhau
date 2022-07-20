import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {CreateCustomerComponent} from './customer/create-customer/create-customer.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {ListFacilityComponent} from './facility/list-facility/list-facility.component';
import {DetailFacilityComponent} from './facility/detail-facility/detail-facility.component';
import {CreateFacilityComponent} from './facility/create-facility/create-facility.component';
import {EditFacilityComponent} from './facility/edit-facility/edit-facility.component';
import {ListContractComponent} from './contract/list-contract/list-contract.component';
import {CreateContractComponent} from './contract/create-contract/create-contract.component';
import {ErrorComponent} from './error/error.component';


const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'home', component: HomeComponent},
  { path: 'customerList', component: ListCustomerComponent},
  { path: 'customerCreate', component: CreateCustomerComponent},
  { path: 'customerEdit', component: EditCustomerComponent},
  { path: 'facilityList', component: ListFacilityComponent},
  { path: 'facilityCreate', component: CreateFacilityComponent},
  { path: 'facilityEdit', component: EditFacilityComponent},
  { path: 'facilityDetail', component: DetailFacilityComponent},
  { path: 'contractList', component: ListContractComponent},
  { path: 'contractCreate', component: CreateContractComponent},
  { path: '**', component: ErrorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
