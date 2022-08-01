import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListConsignmentComponent} from './consignment/list-consignment/list-consignment.component';
import {CretaeConsignmentComponent} from './consignment/cretae-consignment/cretae-consignment.component';
import {EditConsignmentComponent} from './consignment/edit-consignment/edit-consignment.component';


const routes: Routes = [
  {path: 'list-consignment', component: ListConsignmentComponent},
  {path: 'create-consignment', component: CretaeConsignmentComponent},
  {path: 'edit-consignment', component: EditConsignmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
