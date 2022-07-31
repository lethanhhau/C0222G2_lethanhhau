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

  getAll(): Observable<LoHang[]> {
    return this.httpClient.get<LoHang[]>(this.URL_LO_HANG);
  }

  getAllSanPham(): Observable<SanPham[]>{
    return this.httpClient.get<SanPham[]>(this.URL_SAN_PHAM);
  }

  saveLoHang(loHang: LoHang) {
    return this.httpClient.post(this.URL_LO_HANG, loHang);
  }

  findById(id: number): Observable<LoHang> {
    return this.httpClient.get<LoHang>(this.URL_LO_HANG + '/' + id);
  }


  deleteLOHang(id) {
    return this.httpClient.delete(this.URL_LO_HANG + '/' + id);
  }

  editLoHang(loHang: LoHang): Observable<LoHang> {
    return this.httpClient.patch(this.URL_LO_HANG + '/update', loHang)
  }

  // loHangListBySearch(searchCustomerName: string, searchAddress: string): Observable<LoHang[]>{
  //   return this.httpClient.get<LoHang[]>("http://localhost:3000/loHang?customerName_like=" + searchCustomerName + "&customerAddress_like=" + searchAddress);
  // }
}
