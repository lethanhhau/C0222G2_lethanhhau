import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {ToastrService} from 'ngx-toastr';
import {Title} from '@angular/platform-browser';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  product: Product;

  constructor(private productService: ProductService,
              private toast: ToastrService,
              private title: Title,
              private active: ActivatedRoute,
              private router: Router) {
    this.title.setTitle('Chi Tiết Sản Phẩm');
  }

  ngOnInit(): void {
    this.getParamId();
  }

  getParamId() {
    this.active.paramMap.subscribe((paraMap: ParamMap) => {
      const id = paraMap.get('id');
      // tslint:disable-next-line:radix
      this.productService.findById(parseInt(id)).subscribe(data => {
        console.log(data);
        // @ts-ignore
        this.product = data;
        if (data == null) {
          this.toast.error('Không có dữ liệu hoặc bạn đang nhập quá dữ liệu hiện có', 'Thông Báo');
          this.router.navigateByUrl('/home').then();
        }
      });
    });
  }

}
