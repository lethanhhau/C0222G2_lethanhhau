import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import { Router } from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  p: number = 1;
  searchForm: FormGroup;
  customerName: string;
  customerAddress: string;


  constructor(private customerService: CustomerService,
              private router: Router,
              private toastrService: ToastrService) { }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(data => {
      this.customers = data
    }, error => {
    });
    this.formSearch();
  }
  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe(data => {
      console.log(id)
    }, error => {
    }, () => {
      this.ngOnInit()
      this.router.navigateByUrl('/customer-list').then()
    })
  }

  formSearch(){
    this.searchForm = new FormGroup({
      searchCustomerName: new FormControl(""),
      searchCustomerAddress: new FormControl("")
    });
  }

  getFormSearch() {
    this.customerService.customerListBySearch(this.searchForm.value.searchCustomerName,
      this.searchForm.value.searchCustomerAddress).subscribe(data => {
      this.customers = data;
      console.log(data);
    }, error => {
    }, () => {
    })
  }

  showDelete() {
    this.toastrService.success("Delete successful!", );
  }

  showCancel() {
    this.toastrService. warning("you didn't delete!", );
  }
}
