import { Component, OnInit } from '@angular/core';
import {Consignment} from '../../model/consignment';
import {FormControl, FormGroup} from '@angular/forms';
import {ConsignmentService} from '../../service/consignment.service';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-list-consignment',
  templateUrl: './list-consignment.component.html',
  styleUrls: ['./list-consignment.component.css']
})
export class ListConsignmentComponent implements OnInit {
  consignments: Consignment[] = [];
  totalPages: number;
  number: number;
  countTotalPages: number[];
  searchForm: FormGroup;

  constructor(private consignmentService: ConsignmentService,
              private router: Router,
              private toastrService: ToastrService) { }

  ngOnInit(): void {
    this.getAllConsignment('', 0);

  }

  getAllConsignment(searchProductName: string, page: number) {

    this.consignmentService.getAllConsignment(searchProductName, page).subscribe((data: Consignment[]) => {
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
      this.getAllConsignment('', numberPages);
    }
  }

  goNext() {
    let numberPages: number = this.number;
    if (numberPages < this.totalPages - 1) {
      numberPages++;
      this.getAllConsignment('', numberPages);
    }
  }

  goItem(i: number) {
    this.getAllConsignment('', i);
  }

  deleteConsignment(id: number) {
    this.consignmentService.deleteConsignment(id).subscribe(data => {
      console.log(id);
    }, error => {
    }, () => {
      this.ngOnInit();
      this.router.navigateByUrl('/list').then();
    });
  }

  showDelete() {
    this.toastrService.success('Delete successful!');
  }

  showCancel() {
    this.toastrService.warning('you didn\'t delete!');
  }

  formSearch() {
    this.searchForm = new FormGroup({
      searchParam: new FormControl()
    });
  }

  getFormSearch() {

    let searchName = this.searchForm.value.searchParam;
    if (searchName == null){
      searchName = '';
    }
    this.getAllConsignment(searchName, 0);
  }
}
