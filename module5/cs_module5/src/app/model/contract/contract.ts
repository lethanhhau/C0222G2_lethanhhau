import { Employee } from '../employee/employee';
import {Facility} from '../facility/facility';
import {Customer} from '../customer/customer';

export interface Contract {
  id?: number,
  startDate?: string,
  endDate?: string,
  deposit?: number,
  total?: number,
  employee?: Employee,
  customer?: Customer
  facility?: Facility
}
