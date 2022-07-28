import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customerType';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customerForm: FormGroup;
  customerTypes: CustomerType[] = [];
  customer: Customer = {};

  constructor(private customerService: CustomerService,
              private router: Router,
              private activeRoute: ActivatedRoute,
              private toastrService: ToastrService) { }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.customerService.findById(parseInt(id)).subscribe(data => {
        this.customerService.getAllCustomerType().subscribe(value => {
          this.customerTypes = value;
        }, error => {
        }, () => {
          this.customer = data,
            this.customerForm = new FormGroup({
              id: new FormControl(this.customer.id),
              customerName: new FormControl(this.customer.customerName, [Validators.required, Validators.pattern("^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+))$")]),
              customerBirthday: new FormControl(this.customer.customerBirthday, [Validators.required]),
              customerGender: new FormControl(this.customer.customerGender, [Validators.required]),
              customerIdCard: new FormControl(this.customer.customerIdCard, [Validators.required, Validators.pattern("^([0-9]{9})|([0-9]{12})$")]),
              customerPhone: new FormControl(this.customer.customerPhone, [Validators.required, Validators.pattern("^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$")]),
              customerEmail: new FormControl(this.customer.customerEmail, [Validators.required, Validators.pattern("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")]),
              customerAddress: new FormControl(this.customer.customerAddress, [Validators.required, Validators.pattern("^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+))$")]),
              customerType: new FormControl(this.customer.customerType.name),
            })
        })
      })
    }, error => {
      console.log(error);
    });
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
  updateCustomer() {
    const customerEdit = this.customerForm.value;
    this.customerService.updateCustomer(customerEdit).subscribe(data => {}, error => {
    }, () => {
      this.router.navigateByUrl("/customer-list");
    });
  }

  compareCustomerType(c1: CustomerType, c2: CustomerType):boolean {
    return c1.id === c2.id;
  }

  showEdit() {
    this.toastrService.success("Edit successful!", );
  }
}
