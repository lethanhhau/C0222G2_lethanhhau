import {Component, OnInit} from '@angular/core';
import {Title} from "@angular/platform-browser";
import {Customer} from '../../../model/customer';
import {CookieService} from '../../../login/service/cookie.service';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-user-customer',
  templateUrl: './user-customer.component.html',
  styleUrls: ['./user-customer.component.css']
})
export class UserCustomerComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  customer: Customer;

  constructor(private title: Title,
              private cookieService: CookieService,
              private customerService: CustomerService
  ) {
    this.title.setTitle("Thông tin tài khoản")
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  ngOnInit(): void {
    this.getInfo();
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  getInfo() {
    this.customerService.getCustomerByUserName(this.username).subscribe((value: Customer) => {
      this.customer = value;
    })
  }


}
