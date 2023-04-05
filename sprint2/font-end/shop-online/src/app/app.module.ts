import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './common/header/header.component';
import {FooterComponent} from './common/footer/footer.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {LoginModule} from './login/login.module';
import {ProductModule} from './product/product.module';
import {AngularFireStorageModule} from '@angular/fire/storage';
import {environment} from '../environments/environment';
import {AngularFireModule} from '@angular/fire';
import {NgxPaginationModule} from 'ngx-pagination';
import { BarChartComponent } from './chart-js/bar-chart/bar-chart.component';
import { DoughnutChartComponent } from './chart-js/doughnut-chart/doughnut-chart.component';
import { PieChartComponent } from './chart-js/pie-chart/pie-chart.component';
import { RadarChartComponent } from './chart-js/radar-chart/radar-chart.component';
import {ChartsModule} from 'ng2-charts';
import { AddInfoUserComponent } from './customer/add-info-user/add-info-user/add-info-user.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    BarChartComponent,
    DoughnutChartComponent,
    PieChartComponent,
    RadarChartComponent,
    AddInfoUserComponent,  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ProductModule,
    LoginModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    ReactiveFormsModule,
    AngularFireStorageModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    NgxPaginationModule,
    ChartsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule {
}
