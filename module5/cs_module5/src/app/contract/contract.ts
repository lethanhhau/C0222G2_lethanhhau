// @ts-ignore
import {Facility} from '../facility/facility';
import {Customer} from '../customer/customer';

export interface Contract {
  contractId?: number;
  customer?: Customer;
  facility?: Facility;
  startDate?: string;
  endDate?: string;
  deposits?: number;

}
