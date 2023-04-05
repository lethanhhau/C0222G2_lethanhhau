import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SanPham} from '../model/sanPham';

@Injectable({
  providedIn: 'root'
})
export class SanPhamService {
  private URL_SAN_PHAM = 'http://localhost:8080/rest/sanPham';

  constructor(private httpClient: HttpClient) {
  }

  getAllSanPham(page: number, searchName: string): Observable<SanPham[]> {
    return this.httpClient.get<SanPham[]>(this.URL_SAN_PHAM + '?page=' + page + "&keyword" + searchName);
  }

  findById(id: number): Observable<SanPham> {
    return this.httpClient.get<SanPham>(this.URL_SAN_PHAM + '/find/' + id);
  }

  saveSanPham(sanPham: SanPham) {
    return this.httpClient.post(this.URL_SAN_PHAM + '/create', sanPham);
  }

  deleteSanPham(id: number) {
    return this.httpClient.delete(this.URL_SAN_PHAM + '/delete/' + id);
  }


}

