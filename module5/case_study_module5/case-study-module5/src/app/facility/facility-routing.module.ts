import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {ListFacilityComponent} from "./list-facility/list-facility.component";
import {CreateFacilityComponent} from "./create-facility/create-facility.component";
import {EditFacilityComponent} from "./edit-facility/edit-facility.component";
import {DetailFacilityComponent} from "./detail-facility/detail-facility.component";

const routes: Routes = [
  {path: 'facility-list', component: ListFacilityComponent},
  {path: 'facility-create', component: CreateFacilityComponent},
  {path: 'facility-edit', component: EditFacilityComponent},
  {path: 'facility-detail', component: DetailFacilityComponent}
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class FacilityRoutingModule { }
