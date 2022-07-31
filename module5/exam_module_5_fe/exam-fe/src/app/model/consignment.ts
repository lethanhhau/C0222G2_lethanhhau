import {Product} from "./product";

export interface Consignment {
  id: number;
  code: string;
  product: Product;
  quantity: number;
  dateIn: string;
  dateCheckIn: string;
  dateCheckOut: string;
}
