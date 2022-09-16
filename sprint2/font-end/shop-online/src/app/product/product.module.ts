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
import {HomeComponent} from './home/home.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {CKEditorModule} from '@ckeditor/ckeditor5-angular';
import { CartComponent } from './cart/cart.component';

@NgModule({
  declarations: [CreateComponent, EditComponent, DetailComponent, PhoneComponent, TiviComponent, LaptopComponent,
    HomeComponent, CartComponent],
    imports: [
        CommonModule,
        ProductRoutingModule,
        ReactiveFormsModule,
        NgxPaginationModule,
        CKEditorModule,
    ]
    , exports: [
    CreateComponent,
    EditComponent,
    DetailComponent,
    PhoneComponent,
    TiviComponent,
    LaptopComponent,
    HomeComponent
  ]
})
export class ProductModule {
}
