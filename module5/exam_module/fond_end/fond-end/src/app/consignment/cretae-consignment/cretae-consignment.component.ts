import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Product} from '../../model/product';
import {Consignment} from '../../model/consignment';
import {ConsignmentService} from '../../service/consignment.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-cretae-consignment',
  templateUrl: './cretae-consignment.component.html',
  styleUrls: ['./cretae-consignment.component.css']
})
export class CretaeConsignmentComponent implements OnInit {
  consignmentForm: FormGroup;
  products: Product[] = [];
  consignment: Consignment = {};

  constructor(private productService: ProductService,
              private consignmentService: ConsignmentService,
              private router: Router,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.productService.findAllProduct().subscribe(value => {
      this.products = value;
    }, error => {
    }, () => {
      this.createForm();
    });
  }

  createForm() {
    this.consignmentForm = new FormGroup({
      code: new FormControl('', [Validators.required, Validators.pattern('^LH-[0-9]{4}$')]),
      product: new FormControl('', Validators.required),
      quantity: new FormControl('', [Validators.required, Validators.min(0)]),
      dateIn: new FormControl('', Validators.required),
      dateOut: new FormControl('', Validators.required),
      dateEnd: new FormControl('', Validators.required)
    });
  }


  get code() {
    return this.consignmentForm.get('code');
  }

  get product() {
    return this.consignmentForm.get('product');
  }

  get amount() {
    return this.consignmentForm.get('amount');
  }

  get importDate() {
    return this.consignmentForm.get('importDate');
  }

  get dateOfManufacture() {
    return this.consignmentForm.get('dateOfManufacture');
  }

  get expirationDate() {
    return this.expirationDate.get('expirationDate');
  }


  createConsignment() {
    if (this.consignmentForm.valid) {
      this.consignmentService.saveConsignment(this.consignmentForm.value).subscribe(value => {

      }, error => {}, () => {
        this.consignmentForm.reset();
        this.router.navigateByUrl('/list-consignment').then(value => {
          this.toastrService.success('Create success!');
        });
      });
    } else {
      this.toastrService.error('Something Wrong! enter data please!');
    }
  }

  // createConsignment() {
  //   if (this.consignmentForm.valid) {
  //     this.consignmentForm.value.id = parseInt(this.consignmentForm.value.id);
  //     this.consignmentService.saveConsignment(this.consignmentForm.value).subscribe(data => {
  //     }, error => {
  //     }, () => {
  //       this.router.navigate(['/list']);
  //     });
  //     this.loHangForm.reset();
  //   }
  // }
}
