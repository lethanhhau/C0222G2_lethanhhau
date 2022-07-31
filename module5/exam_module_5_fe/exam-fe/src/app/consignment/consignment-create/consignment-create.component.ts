import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Product} from "../../model/product";
import {Consignment} from "../../model/consignment";
import {ConsignmentService} from "../../service/consignment.service";
import {ActivatedRoute, Router} from "@angular/router";
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consignment-create',
  templateUrl: './consignment-create.component.html',
  styleUrls: ['./consignment-create.component.css']
})
export class ConsignmentCreateComponent implements OnInit {

  consignmentForm: FormGroup;
  products: Product[] = [];
  consignment: {} = {};

  constructor(private consignmentService: ConsignmentService,
              private router: Router,
              private activeRoute: ActivatedRoute,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.consignmentService.getAllProduct().subscribe(value => {
      this.products = value;
    }, error => {
    }, () => {
      this.consignmentForm = new FormGroup({
        id: new FormControl(this.consignment.id),
        code: new FormControl('', [Validators.required,
          Validators.pattern('^(LH-)[0-9]{4}$')]),
        product: new FormControl('', [Validators.required]),
        soLuong: new FormControl('', [Validators.required,
          Validators.pattern('^(([1-9]+)|([1-9][0-9]+))$')]),
        ngayNhapHang: new FormControl('', [Validators.required]),
        ngaySanXuat: new FormControl('', [Validators.required]),
        ngayHetHan: new FormControl('', [Validators.required]),

      });
    });
  }

  get code() {
    return this.consignmentForm.get('code');
  }

  get product() {
    return this.consignmentForm.get('product');
  }

  get soLuong() {
    return this.consignmentForm.get('soLuong');
  }

  get ngayNhapHang() {
    return this.consignmentForm.get('ngayNhapHang');
  }

  get ngaySanXuat() {
    return this.consignmentForm.get('ngaySanXuat');
  }

  get ngayHetHan() {
    return this.consignmentForm.get('ngayHetHan');
  }

  saveConsignment() {
    if (this.consignmentForm.valid) {
      this.consignmentForm.value.id = parseInt(this.consignmentForm.value.id);
      this.consignmentForm.(this.consignmentForm.value).subscribe(data => {
      }, error => {
      }, () => {
        this.router.navigate(['/list']);
      });
      this.loHangForm.reset();
    }
  }

  showCreate() {
    this.toastrService.success('Create successful!',);
  }
}
