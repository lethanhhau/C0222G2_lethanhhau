import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './common/home/home.component';
import {BarChartComponent} from './chart-js/bar-chart/bar-chart.component';
import {DoughnutChartComponent} from './chart-js/doughnut-chart/doughnut-chart.component';
import {RadarChartComponent} from './chart-js/radar-chart/radar-chart.component';
import {PieChartComponent} from './chart-js/pie-chart/pie-chart.component';


const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'home'},
  {path: 'home', component: HomeComponent},
  {path: 'home/:name', component: HomeComponent},
  {path: 'bar-chart', component: BarChartComponent},
  {path: 'doughnut-chart', component: DoughnutChartComponent},
  {path: 'radar-chart', component: RadarChartComponent},
  {path: 'pie-chart', component: PieChartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
