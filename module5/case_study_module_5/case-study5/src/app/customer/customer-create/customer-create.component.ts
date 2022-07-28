import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../model/customer';
import {CustomerType} from '../../model/customerType';
import {CustomerService} from '../../service/customer.service';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerForm: FormGroup;
  customer: Customer = {};
  customerTypes: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private toastrService: ToastrService) { }

  ngOnInit(): void {
    this.customerService.getAllCustomerType().subscribe(value => {
      this.customerTypes = value;
    }, error => {
    }, () => {
      this.customerForm = new FormGroup({
        customerName: new FormControl('', [Validators.required, Validators.pattern("^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+))$")]),
        customerBirthday: new FormControl('', [Validators.required]),
        customerGender: new FormControl('', [Validators.required]),
        customerIdCard: new FormControl('', [Validators.required, Validators.pattern("^([0-9]{9})|([0-9]{12})$")]),
        customerPhone: new FormControl('', [Validators.required, Validators.pattern("^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$")]),
        customerEmail: new FormControl('', [Validators.required, Validators.pattern("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")]),
        customerAddress: new FormControl('', [Validators.required, Validators.pattern("^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+))$")]),
        customerType: new FormControl(''),

      });
    })
  }

  get customerName() {
    return this.customerForm.get('customerName')
  }

  get customerBirthday() {
    return this.customerForm.get('customerBirthday')
  }

  get customerGender() {
    return this.customerForm.get('customerGender')
  }

  get customerIdCard() {
    return this.customerForm.get('customerIdCard')
  }

  get customerPhone() {
    return this.customerForm.get('customerPhone')
  }

  get customerEmail() {
    return this.customerForm.get('customerEmail')
  }

  get customerAddress() {
    return this.customerForm.get('customerAddress')
  }

  createCustomer() {
    if (this.customerForm.valid) {
      this.customerForm.value.id = parseInt(this.customerForm.value.id)
      this.customerService.saveCustomer(this.customerForm.value).subscribe( data => {
      }, error => {
      }, () => {
        this.router.navigate(['/customer-list']);
      })
      this.customerForm.reset()
    }
  }
  showCreate() {
    this.toastrService.success("Create successful!", );
  }
}
