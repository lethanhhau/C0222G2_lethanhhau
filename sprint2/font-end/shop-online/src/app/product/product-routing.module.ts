import {RouterModule, Routes} from '@angular/router';
import {CreateComponent} from './create/create.component';
import {EditComponent} from './edit/edit.component';
import {DetailComponent} from './detail/detail.component';
import {HomeComponent} from './home/home.component';
import {NgModule} from '@angular/core';
import {FanComponent} from './fan/fan.component';
import {FridgeComponent} from './fridge/fridge.component';
import {LaptopComponent} from './laptop/laptop.component';
import {PhoneComponent} from './phone/phone.component';
import {TiviComponent} from './tivi/tivi.component';

const routes: Routes = [
  {path: 'create-product', component: CreateComponent},
  {path: 'edit-product/:id', component: EditComponent},
  {path: 'detail-product/:id', component: DetailComponent},
  {path: 'home', component: HomeComponent},
  {path: 'fan', component: FanComponent},
  {path: 'fridge', component: FridgeComponent},
  {path: 'laptop', component: LaptopComponent},
  {path: 'phone', component: PhoneComponent},
  {path: 'tivi', component: TiviComponent},
  {path: 'detail', component: DetailComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule {
}
