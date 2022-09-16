import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {ToastrService} from 'ngx-toastr';
import {Title} from '@angular/platform-browser';
import {Order} from '../../model/order';
import {OrderService} from '../../service/order.service';
import {CommonService} from '../../login/service/common.service';
import {Customer} from '../../model/customer';
import {CookieService} from '../../login/service/cookie.service';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  product: Product;
  customer: Customer;
  public infoStatus: boolean = false;


  constructor(private productService: ProductService,
              private cookieService: CookieService,
              private customerService: CustomerService,
              private commonService: CommonService,
              private toastrService: ToastrService,
              private title: Title,
              private active: ActivatedRoute,
              private router: Router,
              private orderService: OrderService) {
    this.title.setTitle('Chi Tiết Sản Phẩm');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getParamId();
    this.getCustomerByUsername(this.username);
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
  getParamId() {
    this.active.paramMap.subscribe((paraMap: ParamMap) => {
      const id = paraMap.get('id');
      // tslint:disable-next-line:radix
      this.productService.findById(parseInt(id)).subscribe(data => {
        console.log(data);
        // @ts-ignore
        this.product = data;
        if (data == null) {
          this.toastrService.error('Không có dữ liệu hoặc bạn đang nhập quá dữ liệu hiện có', 'Thông Báo');
          this.router.navigateByUrl('/home').then();
        }
      });
    });
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

  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }

  addToCartMessage() {
    this.toastrService.warning('Vui lòng đăng nhập thành viên để thực hiện chức năng này!');
  }
}
