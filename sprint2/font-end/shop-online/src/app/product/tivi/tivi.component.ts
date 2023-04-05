import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../../login/service/cookie.service';
import {ProductService} from '../../service/product.service';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';

@Component({
  selector: 'app-tivi',
  templateUrl: './tivi.component.html',
  styleUrls: ['./tivi.component.css']
})
export class TiviComponent implements OnInit {

  role: string = '';
  username: string = '';
  token: string = '';
  totalPages: number;
  number: number;
  countTotalPages: number[];

  tiviProduct: Product[] = [];

  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private router: Router) {
    this.title.setTitle('Tivi');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getTivi(0);
  }

  getTivi(page: number) {
    this.productService.getTivi(page).subscribe(data => {
      console.log(data)
      if (data != null) {
        // @ts-ignore
        this.tiviProduct = data.content;
      } else {
        this.tiviProduct = [];
      }
      if (this.tiviProduct.length !== 0) {
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
      this.getTivi(numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getTivi(numberPage);
    }
  }

  goItem(i: number) {
    this.getTivi(i);
  }

}
