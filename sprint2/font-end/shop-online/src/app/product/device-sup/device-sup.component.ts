import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../../login/service/cookie.service';
import {ProductService} from '../../service/product.service';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';

@Component({
  selector: 'app-device-sup',
  templateUrl: './device-sup.component.html',
  styleUrls: ['./device-sup.component.css']
})
export class DeviceSupComponent implements OnInit {

  role: string = '';
  username: string = '';
  token: string = '';
  totalPages: number;
  number: number;
  countTotalPages: number[];

  deviceSupProduct: Product[] = [];

  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private router: Router) {
    this.title.setTitle('Phụ Kiện');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getDevice(0);
  }

  getDevice(page: number) {
    this.productService.getDevice(page).subscribe(data => {
      console.log(data)
      if (data != null) {
        // @ts-ignore
        this.deviceSupProduct = data.content;
      } else {
        this.deviceSupProduct = [];
      }
      if (this.deviceSupProduct.length !== 0) {
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
      this.getDevice(numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getDevice(numberPage);
    }
  }

  goItem(i: number) {
    this.getDevice(i);
  }

}
