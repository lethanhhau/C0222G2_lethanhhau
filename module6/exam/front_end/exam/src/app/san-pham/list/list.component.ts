import {Component, OnInit} from '@angular/core';
import {SanPham} from '../../model/sanPham';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';
import {SanPhamService} from '../../service/sanPham.service';
import {FormGroup} from '@angular/forms';


// @ts-ignore
@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  sanPhams: SanPham[] = [];
  p: number;
  totalPages: number;
  number: number;
  countTotalPages: number[];
  searchForm: FormGroup;


  constructor(private sanPhamService: SanPhamService,
              private router: Router,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.getAllSanPham(0, '');
  }


  getAllSanPham(page: number, searchName: string) {

    this.sanPhamService.getAllSanPham(page, searchName).subscribe((data: SanPham[]) => {
      // @ts-ignore
      this.totalPages = data.totalPages;
      // @ts-ignore
      this.countTotalPages = new Array(data.totalPages);
      // @ts-ignore
      this.number = data.number;
      // @ts-ignore
      this.sanPhams = data.content;
    });
  }

  deleteSanPham(id: number) {
    this.sanPhamService.deleteSanPham(id).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      this.router.navigateByUrl('/list').then();
    });
  }


  showDelete() {
    this.toastrService.success('xoa thanh cong!', "Thong bao");
  }

  showCancel() {
    this.toastrService.warning('Ban da khong xoa!',);
  }

  goPrevious() {
    let numberPages: number = this.number;
    if (numberPages > 0) {
      numberPages--;
      this.getAllSanPham(numberPages, "");
    }
  }

  goNext() {
    let numberPages: number = this.number;
    if (numberPages < this.totalPages - 1) {
      numberPages++;
      this.getAllSanPham(numberPages, "");
    }
  }

  goItem(i: number) {
    this.getAllSanPham(i, "");
  }
}
