import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {SanPham} from '../../model/sanPham';
import {SanPhamService} from '../../service/sanPham.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  sanPhamForm: FormGroup;
  sanPham: SanPham = {};
//
  constructor(private sanPhamService: SanPhamService,
              private router: Router,
              private activeRoute: ActivatedRoute,
              private toastrService: ToastrService) { }
//
  ngOnInit(): void {
    this.sanPhamForm = new FormGroup({
      id: new FormControl(this.sanPham.idSanPham),
      maSanPham: new FormControl(this.sanPham.maSanPham),
      tenSanPham: new FormControl(this.sanPham.tenSanPham),
      donGia: new FormControl(this.sanPham.donGia),
      tinhTrang: new FormControl(this.sanPham.tinhTrang),
      ngayNhapHang: new FormControl(this.sanPham.ngayNhapHang),
      xuatXu: new FormControl(this.sanPham.xuatXu),
      loaiDoUong: new FormControl(this.sanPham.loaiDoUong),
      loaiDoAn: new FormControl(this.sanPham.loaiDoAn),
      tacGia: new FormControl(this.sanPham.tacGia),
      theLoai: new FormControl(this.sanPham.theLoai),
      ngayXuatBan: new FormControl(this.sanPham.ngayXuatBan)

    })
  }

  get maSanPham() {
    return this.sanPhamForm.get('maSanPham');
  }

  get tenSanPham() {
    return this.sanPhamForm.get('tenSanPham');
  }
  get donGia() {
    return this.sanPhamForm.get('donGia');
  }
  get tinhTrang() {
    return this.sanPhamForm.get('tinhTrang');
  }
  get ngayNhapHang() {
    return this.sanPhamForm.get('ngayNhapHang');
  }
  get xuatXu() {
    return this.sanPhamForm.get('xuatXu');
  }
  get loaiDoUong() {
    return this.sanPhamForm.get('loaiDoUong');
  }
  get loaiDoAn() {
    return this.sanPhamForm.get('loaiDoAn');
  }
  get tacGia() {
    return this.sanPhamForm.get('tacGia');
  }

  get theLoai() {
    return this.sanPhamForm.get('theLoai');
  }

  get ngayXuatBan() {
    return this.sanPhamForm.get('ngayXuatBan');
  }

  createSanPham() {
    if (this.sanPhamForm.valid) {
      this.sanPhamForm.value.id = parseInt(this.sanPhamForm.value.id);
      this.sanPhamService.saveSanPham(this.sanPhamForm.value).subscribe(data => {
      }, error => {
      }, () => {
        this.router.navigate(['/list']);
      });
      this.sanPhamForm.reset();
    }
  }

  showCreate() {
    this.toastrService.success('Create successful!',);
  }
}
