import {Component, OnInit} from '@angular/core';
import {LoHang} from '../../model/loHang';
import {LoHangService} from '../../service/loHang.service';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  loHangs: LoHang[] = [];
  p: number;

  constructor(private loHangService: LoHangService,
              private router: Router,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.loHangService.getAll().subscribe(data => {
      this.loHangs = data;
      console.log(this.loHangs);
    }, error => {
    });
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

}
