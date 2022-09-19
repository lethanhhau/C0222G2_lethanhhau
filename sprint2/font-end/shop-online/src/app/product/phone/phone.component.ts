import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../../login/service/cookie.service';
import {ProductService} from '../../service/product.service';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';

@Component({
  selector: 'app-phone',
  templateUrl: './phone.component.html',
  styleUrls: ['./phone.component.css']
})
export class PhoneComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  totalPages: number;
  number: number;
  countTotalPages: number[];

  phoneProduct: Product[] = [];

  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private router: Router) {
    this.title.setTitle('Điện Thoại');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getPhone(0);
  }

  getPhone(page: number) {
    this.productService.getPhone(page).subscribe(data => {
      console.log(data)
      if (data != null) {
        // @ts-ignore
        this.phoneProduct = data.content;
      } else {
        this.phoneProduct = [];
      }
      if (this.phoneProduct.length !== 0) {
        // @ts-ignore
        this.totalPages = data.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(data.totalPages);
        // @ts-ignore
        this.number = data.number;
      }
    });
  }

  deleteProduct(id: number) {
    // @ts-ignore
    this.productService.deleteProduct(id).subscribe(value => {
    }, error => {
    }, () => {
      // @ts-ignore
      $('#staticBackdropDelete' + id).modal('hide');
      this.toastrService.error('deleted', 'SOS!!!');
      this.ngOnInit();
      this.router.navigateByUrl('/home').then();
    });
  }


  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getPhone(numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getPhone(numberPage);
    }
  }

  goItem(i: number) {
    this.getPhone(i);
  }

}

