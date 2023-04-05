import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../../login/service/cookie.service';
import {ProductService} from '../../service/product.service';
import {ToastrService} from 'ngx-toastr';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {Category} from '../../model/category';
import {LogoutService} from '../../login/service/logout.service';
import {CommonService} from '../../login/service/common.service';
import {Customer} from '../../model/customer';
import {OrderService} from '../../service/order.service';
import {CustomerService} from '../../service/customer.service';
import {Order} from '../../model/order';

declare var $: any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  product: Product[] = [];
  searchForm: FormGroup;
  totalPages: number;
  number: number;
  countTotalPages: number[];
  customer: Customer;
  category: Category;
  sort: string = '';
  categoryId: string = '';
  public infoStatus: boolean = false;
  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private orderService: OrderService,
              private activatedRoute: ActivatedRoute,
              private customerService: CustomerService,
              private commonService: CommonService) {
    this.title.setTitle("Trang chủ")
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
    this.activatedRoute.paramMap.subscribe(paramMap => {
      const search = paramMap.get('name');
      this.getAll(0, search);
    })
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getCategory();
    this.getAll(0, "");
    this.getCustomerByUsername(this.username);


  }

  getAll(page: number, searchName: String) {
    this.productService.getAll(page, searchName).subscribe((data: Product[]) => {
      console.log(data)
      if (data != null) {
        // @ts-ignore
        this.product = data.content;
      } else {
        this.product = [];
      }
      if (this.product.length !== 0) {
        // @ts-ignore
        this.totalPages = data.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(data.totalPages);
        // @ts-ignore
        this.number = data.number;
      }
    });
  }

  getCategory(){
    this.productService.getAllCategory().subscribe( data => {
      console.log(data)
      // @ts-ignore
      this.category = data;
    })
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getAll(numberPage, '');
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getAll(numberPage,'');
    }
  }

  goItem(i: number) {
    this.getAll(i, '');
  }

  deleteProduct(id: number) {
    // @ts-ignore
    this.productService.deleteProduct(id).subscribe(value => {
      // @ts-ignore
      $('#exampleModal' + id).modal('hide');
      this.toastrService.success('Xóa thành công !!!', 'SOS!!!');
      this.ngOnInit();
      this.router.navigateByUrl('/home').then();
    }, error => {
    }, () => {
    })
  }


  addToCart(product: Product) {
    let order: Order = {
      customer: this.customer,
      product: product,
      quantity: 1
    };
    this.orderService.addOrder(order).subscribe((po: Order) => {
      this.toastrService.success('Thêm thành công sản phẩm ' + po.product.name);
      this.sendMessage();
    }, error => {
      if (error.error.message == 'quantity') {
        this.toastrService.warning('Bạn đã thêm vượt quá số lượng sản phẩm!');
      }
    });
  }

  getCustomerByUsername(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      this.customer = value;
      if (value == null) {
        this.infoStatus = true;
      } else {
        this.infoStatus = value.appUser.isDeleted;
      }
    });
  }
  addToCartMessage() {
    this.toastrService.warning('Vui lòng đăng nhập thành viên để thực hiện chức năng này!');
  }

  updateInfoMessage() {
    this.router.navigateByUrl('/info').then(value => {
      this.toastrService.warning('Vui lòng cập nhật thông tin để mua hàng!');
    });
  }
  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }



}
