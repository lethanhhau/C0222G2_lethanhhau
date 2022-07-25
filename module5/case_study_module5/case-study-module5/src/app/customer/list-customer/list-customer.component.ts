import { Component, OnInit } from '@angular/core';
import {Customer} from '../customer';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
customers: Customer[] = [];
  constructor() {
    this.customers.push({customerId: 1, customerName: 'Tài', customerBirthday: '2000-12-01', customerGender: 'nữ', customerIdCard: 123456789,
      customerPhone: 912345678, customerEmail: 'tai@123.com', customerAddress: 'thanh hóa', customerType: {customerTypeId: 1, customerTypeName: 'gold'}});

    this.customers.push({customerId: 2, customerName: 'Phương', customerBirthday: '2001-01-01', customerGender: 'nam', customerIdCard: 123456789012,
      customerPhone: 84912345678, customerEmail: 'phuong@123.com', customerAddress: 'quãng trị', customerType: {customerTypeId: 2, customerTypeName: 'Diamond'}});

    this.customers.push({customerId: 3, customerName: 'Hậu', customerBirthday: '2002-02-20', customerGender: 'nam', customerIdCard: 789012,
      customerPhone: 84987654321, customerEmail: 'hau@123.com', customerAddress: 'quãng nam', customerType: {customerTypeId: 2, customerTypeName: 'Diamond'}});
  }

  ngOnInit(): void {
  }

}
