import { Injectable } from '@angular/core';
import {Product} from "../model/product";
import {AbstractControl} from "@angular/forms";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() {
    this.products.push( {id: 1, name: 'hao hao', price: 3.5 , description: 'chua cay'},
      {id: 2, name: 'omo', price: 30, description: 'trang sang'})

  }
  products: Product[] = [];

  getAll(){
    return this.products;
  }

  saveProduct(product){
    this.products.push(product)
  }

  findById(id: number) {
    return this.products.filter(product => product.id === id);
  }

  updateProduct(productEdit) {
    for (let i = 0; i < this.products.length ; i++) {
      if(this.products[i].id === productEdit.id){
        this.products[i] = productEdit;
      }
    }
  }

  deleteProduct(id) {
    this.products = this.products.filter(product => product.id !== id);
  }

}
