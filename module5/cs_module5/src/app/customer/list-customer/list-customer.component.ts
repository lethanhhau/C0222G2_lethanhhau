import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer/customer';
import {CustomerType} from '../../model/customer/customerType';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';
import {$} from 'protractor';


@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
customers: Customer[] = [];
customerTypes: CustomerType[] = [];
customerFormCreate: FormGroup;

constructor(private customerService: CustomerService) {
  this.customerFormCreate = new FormGroup({
    customerId: new FormControl(),
    customerName: new FormControl(),
    customerBirthday: new FormControl(),
    customerGender: new FormControl(),
    customerIdCard: new FormControl(),
    customerPhone: new FormControl(),
    customerEmail: new FormControl(),
    customerAddress: new FormControl(),
    customerType: new FormControl(),
  })
  // this.getAllCustomer();
}

  ngOnInit(): void {
  }

  // private getAllCustomer() {
  //   this.customerService.findAll(0,'').subscribe(data =>{
  //     data.content.map(value =>{
  //       this.customers.push(value)
  //     })
  //   })
  // }

  createCustomer() {
    // console.log(this.customerFormCreate.value.customerType);
    if (this.customerFormCreate.valid) {
      let max = 0;
      for (const e of this.customers) {
        if (e.customerId > max) {
          max = e.customerId;
        }
      }
      this.customerFormCreate.value.id = (max + 1);
      this.customers.push(this.customerFormCreate.value);
      this.customerFormCreate.reset();
      $('#staticBackdrop').modal('hide');
    }
  }
}
