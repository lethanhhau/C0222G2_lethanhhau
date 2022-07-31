import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {SanPham} from '../../model/sanPham';
import {LoHang} from '../../model/loHang';
import {LoHangService} from '../../service/loHang.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  loHangForm: FormGroup;
  sanPhams: SanPham[] = [];
  lohang: LoHang = {};

  constructor(private loHangService: LoHangService,
              private router: Router,
              private activeRoute: ActivatedRoute,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.loHangService.getAllSanPham().subscribe(value => {
      this.sanPhams = value;
    }, error => {
    }, () => {
      this.loHangForm = new FormGroup({
        id: new FormControl(this.lohang.id),
        maLoHang: new FormControl('', [Validators.required,
          Validators.pattern('^(LH-)[0-9]{4}$')]),
        sanPham: new FormControl('', [Validators.required]),
        soLuong: new FormControl('', [Validators.required,
          Validators.pattern('^(([1-9]+)|([1-9][0-9]+))$')]),
        ngayNhapHang: new FormControl('', [Validators.required]),
        ngaySanXuat: new FormControl('', [Validators.required]),
        ngayHetHan: new FormControl('', [Validators.required]),

      });
    });
  }

  get maLoHang() {
    return this.loHangForm.get('maLoHang');
  }

  get sanPham() {
    return this.loHangForm.get('sanPham');
  }

  get soLuong() {
    return this.loHangForm.get('soLuong');
  }

  get ngayNhapHang() {
    return this.loHangForm.get('ngayNhapHang');
  }

  get ngaySanXuat() {
    return this.loHangForm.get('ngaySanXuat');
  }

  get ngayHetHan() {
    return this.loHangForm.get('ngayHetHan');
  }

  createLoHang() {
    if (this.loHangForm.valid) {
      this.loHangForm.value.id = parseInt(this.loHangForm.value.id);
      this.loHangService.saveLoHang(this.loHangForm.value).subscribe(data => {
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
