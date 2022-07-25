import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionaryPageComponent} from './ lookup-dictionary/dictionary-page/dictionary-page.component';
import {DictionaryDetailComponent} from './ lookup-dictionary/dictionary-detail/dictionary-detail.component';
import {ProductListComponent} from './product-management/product/product-list/product-list.component';
import {ProductCreateComponent} from './product-management/product/product-create/product-create.component';


const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'page'
  },
  {
    path: 'page',
    component: DictionaryPageComponent
  },
  {
    path: 'detail/:word',
    component: DictionaryDetailComponent
  },
  {
    path: 'product/list',
    component: ProductListComponent
  },
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/edit/:idEdit',
    component: ProductCreateComponent
  },
  {
    path: 'product/delete/:idDelete',
    component: ProductListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
