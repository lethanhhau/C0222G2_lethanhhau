import {Customer} from '../model/customer/customer';
import {Facility} from '../model/facility/facility';


export interface Contract {
  contractId?: number;
  customer?: Customer;
  facility?: Facility;
  startDate?: string;
  endDate?: string;
  deposits?: number;

}
