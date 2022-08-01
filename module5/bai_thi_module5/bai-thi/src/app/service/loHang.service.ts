import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoHang} from '../model/loHang';
import {SanPham} from '../model/sanPham';


@Injectable({
  providedIn: 'root'
})
export class LoHangService {
  private URL_LO_HANG = 'http://localhost:8080/rest/loHang';
  private URL_SAN_PHAM = 'http://localhost:8080/rest/sanPham';

  constructor(private httpClient: HttpClient) {
  }

  getAll(searchName: string, page: number): Observable<LoHang[]> {
    return this.httpClient.get<LoHang[]>(this.URL_LO_HANG + '/page?page='+ page + "&keyWord=" + searchName);
  }

  getAllSanPham(): Observable<SanPham[]>{
    return this.httpClient.get<SanPham[]>(this.URL_SAN_PHAM);
  }

  saveLoHang(loHang: LoHang) {
    return this.httpClient.post(this.URL_LO_HANG + '/create', loHang);
  }

  findById(id: number): Observable<LoHang> {
    return this.httpClient.get<LoHang>(this.URL_LO_HANG + '/find/' + id);
  }


  deleteLOHang(id) {
    return this.httpClient.delete(this.URL_LO_HANG + '/delete' + id);
  }

  editLoHang(loHang: LoHang): Observable<LoHang> {
    return this.httpClient.patch(this.URL_LO_HANG + '/update' , loHang)
  }

  // loHangListBySearch(searchTenSanPham: string): Observable<LoHang[]>{
  //   return this.httpClient.get<LoHang[]>("http://localhost:3000/loHang?tenSanPham_like=" + searchTenSanPham );
  // }
}

// + "&customerAddress_like=" + searchAddress
