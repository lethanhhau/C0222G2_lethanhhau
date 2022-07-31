import { Component, OnInit } from '@angular/core';
import {Consignment} from "../../model/consignment";
import {ConsignmentService} from "../../service/consignment.service";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-consignment-list',
  templateUrl: './consignment-list.component.html',
  styleUrls: ['./consignment-list.component.css']
})
export class ConsignmentListComponent implements OnInit {

  consignments: Consignment[] = [];
  p: number;

  constructor(private consignmentService: ConsignmentService,
              private router: Router,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.consignmentService.getAllConsignment().subscribe(data => {
      this.consignments = data;
      console.log(this.consignments);
    }, error => {
    });
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
    this.toastrService.success('Delete successful!',);
  }

  showCancel() {
    this.toastrService.warning('you didn\'t delete!',);
  }

}
