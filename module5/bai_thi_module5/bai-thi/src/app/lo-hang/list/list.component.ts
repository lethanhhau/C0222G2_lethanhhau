import {Component, OnInit} from '@angular/core';
import {LoHang} from '../../model/loHang';
import {LoHangService} from '../../service/loHang.service';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  loHangs: LoHang[] = [];
  p: number;
  totalPages: number;
  number: number;
  countTotalPages: number[];
  searchForm: FormGroup;

  constructor(private loHangService: LoHangService,
              private router: Router,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.getAllLoHang("",0);
    this.formSearch();
  }

  getAllLoHang(searchName:string, page: number) {

    this.loHangService.getAllLoHang(searchName, page).subscribe((data: LoHang[]) => {
      // @ts-ignore
      this.totalPages = data.totalPages;
      // @ts-ignore
      this.countTotalPages = new Array(data.totalPages);
      // @ts-ignore
      this.number = data.number;
      // @ts-ignore
      this.loHangs = data.content;
    });
  }


  goPrevious() {
    let numberPages: number = this.number;
    if (numberPages > 0) {
      numberPages--;
      this.getAllLoHang("",numberPages);
    }
  }

  goNext() {
    let numberPages: number = this.number;
    if (numberPages < this.totalPages - 1) {
      numberPages++;
      this.getAllLoHang("",numberPages);
    }
  }

  goItem(i: number) {
    this.getAllLoHang("",i);
  }

  deleteLoHang(id: number) {
    this.loHangService.deleteLOHang(id).subscribe(data => {
      console.log(id);
    }, error => {
    }, () => {
      this.ngOnInit();
      this.router.navigateByUrl('/list').then();

    });
  }

  showDelete() {
    this.toastrService.success('Delete successful!',);
  }

  showCancel() {
    this.toastrService.warning('you didn\'t delete!',);
  }

  formSearch() {
    this.searchForm = new FormGroup({
      searchParam: new FormControl()
    });
  }

  getFormSearch() {

     let searchName = this.searchForm.value.searchParam;
     if (searchName== null){
       searchName="";
     }this.getAllLoHang(searchName,0)
  }
}
