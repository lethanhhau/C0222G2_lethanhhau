import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ErrorComponent} from './error/error/error.component';
import {ListComponent} from './lo-hang/list/list.component';
import {CreateComponent} from './lo-hang/create/create.component';
import {EditComponent} from './lo-hang/edit/edit.component';


const routes: Routes = [
  {path: 'list',component: ListComponent},
  {path: 'create',component: CreateComponent},
  {path: 'edit/:id',component: EditComponent},
  {path: '**', component: ErrorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
