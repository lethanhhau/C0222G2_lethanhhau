import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Customer} from '../customer';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  customerCreate: Customer = {};
  customerFormReactive: FormGroup;
  @Output() submitCreateCustomer = new EventEmitter();

  constructor() {
    this.customerFormReactive = new FormGroup({
      customerId: new FormControl('',[Validators.required]),
      customerName: new FormControl('',[Validators.required, Validators.pattern("^(([A-Z][a-z0-9]+)||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+))$")]),
      customerBirthday: new FormControl('',[Validators.required]),
      customerGender: new FormControl(),
      customerIdCard: new FormControl('',[Validators.required, Validators.pattern("^([0-9]{9})||([0-9]{12})$")]),
      customerPhone: new FormControl('',[Validators.required, Validators.pattern("^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$")]),
      customerEmail: new FormControl('',[Validators.required, Validators.pattern("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")]),
      customerAddress: new FormControl(),
      customerType: new FormControl(),
    })
  }

  ngOnInit(): void {
  }

  createCustomerWithReactive(){
    if (this.customerFormReactive.valid){
      this.submitCreateCustomer.emit(this.customerFormReactive.value)
    }
  }

}
