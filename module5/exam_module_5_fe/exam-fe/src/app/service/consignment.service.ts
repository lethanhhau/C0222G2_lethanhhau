import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Consignment} from "../model/consignment";
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ConsignmentService {
  private URL_CONSIGNMENT = "http://localhost:8080/rest/consignment";
  private URL_PRODUCT = "http://localhost:8080/rest/product";

  constructor(private httpClient: HttpClient) { }

  getAllConsignment(): Observable<Consignment[]> {
    return this.httpClient.get<Consignment[]>(this.URL_CONSIGNMENT);
  }

  getAllProduct(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCT)
  }

  saveConsignment(consignment: Consignment) {
    return this.httpClient.post(this.URL_CONSIGNMENT + "create", consignment);
  }

  findById(id: number): Observable<Consignment> {
    return this.httpClient.get<Consignment>(this.URL_CONSIGNMENT + 'find/' + id);
  }

  deleteConsignment(id) {
    return this.httpClient.delete(this.URL_CONSIGNMENT + 'delete' + id);
  }


  updateCustomer(consignment) {
    return this.httpClient.patch(this.URL_CONSIGNMENT + '/' + consignment.id, consignment);
  }
}
