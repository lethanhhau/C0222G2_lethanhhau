import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {CookieService} from '../../login/service/cookie.service';
import {ToastrService} from 'ngx-toastr';
import {LogoutService} from '../../login/service/logout.service';
import {Router} from '@angular/router';
import {CommonService} from '../../login/service/common.service';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit, OnDestroy {
  products: Product[] = [];
  role: string = '';
  username: string = '';
  token: string = '';
  messageReceived: any;
  searchForm: FormGroup;
  searchName: string;
  private subscriptionName: Subscription;

  constructor(private cookieService: CookieService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private commonService: CommonService,
              private productService: ProductService) {
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
    // subscribe to sender component messages
    this.subscriptionName = this.commonService.getUpdate().subscribe(message => {
      this.messageReceived = message;
      this.role = this.readCookieService('role');
      this.username = this.readCookieService('username');
      this.token = this.readCookieService('jwToken');
    });
  }

  ngOnInit(): void {
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  onLogout() {
    setTimeout(() => {
      if (this.cookieService.getCookie('jwToken') != null) {
        this.logoutService.onLogout(this.cookieService.getCookie('jwToken')).subscribe(() => {
          this.cookieService.deleteAllCookies();
          this.cookieService.removeAllCookies();
        }, error => {
          switch (error.error) {
            case 'isLogout':
              this.toastrService.warning('Bạn chưa đăng nhập!');
              break;
            case 'LoginExpired':
              this.cookieService.deleteAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
              break;
            default:
              this.cookieService.deleteAllCookies();
              this.cookieService.removeAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
              break;
          }
        }, () => {
          this.router.navigateByUrl('/login').then(() => {
            this.toastrService.success('Đăng xuất thành công!');
            this.sendMessage();
          });
        });
      } else {
        this.toastrService.warning('Bạn chưa đăng nhập!');
      }
    }, 1000);
    this.router.navigateByUrl('/loading').then(() => {
    });
  }

  ngOnDestroy(): void {
    this.subscriptionName.unsubscribe();
  }

  sendMessage(): void {
    // send message to subscribers via observable subject
    this.commonService.sendUpdate('Đăng Xuất thành công!');
  }

  formSearch(){
    this.searchForm = new FormGroup({
      productName: new FormControl(""),
    });
  }

  getFormSearch() {
    let search = this.searchForm.value.searchName
    if (search = null){
      search = " "
    }
    this.router.navigate(['/home/',search])
    // this.productService.getAll(0, this.searchForm.value.productName).subscribe(data => {
    //   this.products = data;
    //   console.log(data);
    // }, error => {
    // }, () => {
    // })
  }
}
