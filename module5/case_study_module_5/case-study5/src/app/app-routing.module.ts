import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './common/home/home.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';
import {CustomerCreateComponent} from './customer/customer-create/customer-create.component';
import {CustomerEditComponent} from './customer/customer-edit/customer-edit.component';
import {FacilityListComponent} from './facility/facility-list/facility-list.component';
import {FacilityCreateComponent} from './facility/facility-create/facility-create.component';
import {FacilityEditComponent} from './facility/facility-edit/facility-edit.component';
import {FacilityDetailComponent} from './facility/facility-detail/facility-detail.component';
import {ErrorComponent} from './error/error/error.component';


const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'home', component: HomeComponent},
  { path: 'customer-list', component: CustomerListComponent},
  { path: 'customer-create', component: CustomerCreateComponent},
  { path: 'customer-edit/:id', component: CustomerEditComponent},
  { path: 'facility-list', component: FacilityListComponent},
  { path: 'facility-create', component: FacilityCreateComponent},
  { path: 'facility-edit', component: FacilityEditComponent},
  { path: 'facility-detail', component: FacilityDetailComponent},
  { path: '**', component: ErrorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
