import {Injectable} from '@angular/core';
import {Customer} from '../model/customer';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CustomerType} from '../model/customerType';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
// customers: Customer[] = [];
  private URL_CUSTOMERS = 'http://localhost:3000/customers';
  private URL_CUSTOMER_TYPES = 'http://localhost:3000/customerType';

  constructor(private httpClient: HttpClient) {
    // this.customers.push({});
  }

  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.URL_CUSTOMERS);
  }

  getAllCustomerType(): Observable<CustomerType[]>{
    return this.httpClient.get<CustomerType[]>(this.URL_CUSTOMER_TYPES);
  }

  saveCustomer(customer: Customer) {
    return this.httpClient.post(this.URL_CUSTOMERS, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.URL_CUSTOMERS + '/' + id);
  }

  updateCustomer(customer) {
    return this.httpClient.patch(this.URL_CUSTOMERS + '/' + customer.id, customer);
  }

  deleteCustomer(id) {
    return this.httpClient.delete(this.URL_CUSTOMERS + '/' + id)
  }
}
