import {CreateComponent} from './create/create.component';
import {EditComponent} from './edit/edit.component';
import {DetailComponent} from './detail/detail.component';
import {PhoneComponent} from './phone/phone.component';
import {TiviComponent} from './tivi/tivi.component';
import {LaptopComponent} from './laptop/laptop.component';
import {CommonModule} from '@angular/common';
import {ProductRoutingModule} from './product-routing.module';
import {NgModule} from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import {ConditioningComponent} from './conditioning/conditioning.component';
import {FanComponent} from './fan/fan.component';
import {FridgeComponent} from './fridge/fridge.component';
import {HomeComponent} from './home/home.component';

@NgModule({
  declarations: [CreateComponent, EditComponent, DetailComponent, PhoneComponent, TiviComponent, LaptopComponent,
  ConditioningComponent, FanComponent, FridgeComponent, HomeComponent],
  imports: [
    CommonModule,
    ProductRoutingModule,
    ReactiveFormsModule,
    // CKEditorModule
  ]
  , exports: [
    CreateComponent,
    EditComponent,
    DetailComponent,
    PhoneComponent,
    TiviComponent,
    LaptopComponent,
    ConditioningComponent,
    FanComponent,
    FridgeComponent,
    HomeComponent
  ]
})
export class ProductModule {
}
