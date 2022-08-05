import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoHang} from '../model/loHang';

@Injectable({
  providedIn: 'root'
})
export class PDFService {
  private URL_PDF = 'http://localhost:8080/rest/pdf';

  constructor(private httpClient: HttpClient) {
  }

  getAllPDF(): Observable<LoHang[]>{
    return this.httpClient.get<LoHang[]>(this.URL_PDF)
  }
}
