import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {LoHang} from '../../model/loHang';
import {SanPham} from '../../model/sanPham';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {LoHangService} from '../../service/loHang.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  loHangForm: FormGroup;
  sanPhams: SanPham[] = [];
  loHang: LoHang = {};

  constructor(private loHangService: LoHangService,
              private router: Router,
              private activeRoute: ActivatedRoute,
              private toastrService: ToastrService) { }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.loHangService.findById(parseInt(id)).subscribe(data => {
        this.loHangService.getAllSanPham().subscribe(value => {
          console.log(value);
          this.sanPhams = value;
        }, error => {
        }, () => {
          this.loHang = data,
            this.loHangForm = new FormGroup({
              id: new FormControl(this.loHang.id),
              maLoHang: new FormControl(this.loHang.maLoHang, [Validators.required,
                Validators.pattern('^(LH-)[0-9]{4}$')]),
              sanPham: new FormControl(this.loHang.sanPham, [Validators.required]),
              soLuong: new FormControl(this.loHang.soLuong, [Validators.required,
                Validators.pattern('^(([1-9]+)|([1-9][0-9]+))$')]),
              ngayNhapHang: new FormControl(this.loHang.ngayNhapHang, [Validators.required]),
              ngaySanXuat: new FormControl(this.loHang.ngaySanXuat, [Validators.required]),
              ngayHetHan: new FormControl(this.loHang.ngayHetHan, [Validators.required]),
            })
        })
      })
    }, error => {
      console.log(error);
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

  updateLoHang() {
    console.log(this.loHangForm.value);
    const loHangEdit = this.loHangForm.value;
    this.loHangService.editLoHang(loHangEdit).subscribe(data => {}, error => {
    }, () => {
      this.router.navigateByUrl("/list");
    });
  }

  compareSanPham(c1: SanPham, c2: SanPham):boolean {
    return c1.id === c2.id;
  }

  showEdit() {
    this.toastrService.success("Edit successful!", );
  }

}
