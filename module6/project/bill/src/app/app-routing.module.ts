import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListBillComponent} from './list-bill/list-bill.component';
import {DetailBillComponent} from './detail-bill/detail-bill.component';


const routes: Routes = [
  {path: 'list-bill', component: ListBillComponent},
  {path: 'detail-bill', component: DetailBillComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
