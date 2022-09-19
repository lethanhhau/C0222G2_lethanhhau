import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../../login/service/cookie.service';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  totalPages: number;
  number: number;
  countTotalPages: number[];

  laptopProduct: Product[] = [];

  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private router: Router) {
    this.title.setTitle('LapTop');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getLaptop(0);
  }

  getLaptop(page: number) {
    this.productService.getLaptop(page).subscribe(data => {
      console.log(data)
      if (data != null) {
        // @ts-ignore
        this.laptopProduct = data.content;
      } else {
        this.laptopProduct = [];
      }
      if (this.laptopProduct.length !== 0) {
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
    this.productService.deleteProduct(id).subscribe(value => {
    }, error => {
    }, () => {
      // @ts-ignore
      $('#staticBackdropDelete' + id).modal('hide');
      this.toastrService.error('deleted', 'SOS!!!');
      this.ngOnInit();
      this.router.navigateByUrl('/laptop').then();
    });
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getLaptop(numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getLaptop(numberPage);
    }
  }

  goItem(i: number) {
    this.getLaptop(i);
  }

}
