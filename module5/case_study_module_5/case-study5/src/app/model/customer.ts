import {CustomerType} from './customerType';

export interface Customer {
  id?: number;
  customerName?: string;
  customerBirthday?: string;
  customerGender?: number;
  customerIdCard?: number;
  customerPhone?: number;
  customerEmail?: string;
  customerAddress?: string;
  customerType?: CustomerType;
}
