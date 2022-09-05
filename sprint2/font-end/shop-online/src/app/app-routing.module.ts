import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './common/home/home.component';
import {CartComponent} from './cart/cart.component';
import {HomeLoginComponent} from './login/home-login/home-login.component';
import {DetailComponent} from './detail/detail.component';


const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'cart', component: CartComponent},
  { path: 'login', component: HomeLoginComponent},
  { path: 'detail', component: DetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
