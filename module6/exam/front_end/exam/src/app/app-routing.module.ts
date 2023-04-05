import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './common/home/home.component';
import {ErrorComponent} from './common/error/error.component';
import {ListComponent} from './san-pham/list/list.component';
import {CreateComponent} from './san-pham/create/create.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  { path: 'home', component: HomeComponent},
  {path: 'list', component: ListComponent},
  {path: 'create', component: CreateComponent},
  {path: '**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
