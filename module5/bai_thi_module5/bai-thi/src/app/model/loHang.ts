import {SanPham} from './sanPham';

export interface LoHang {
  id?: number;
  maLoHang?: string;
  sanPham?: SanPham;
  soLuong?: number;
  ngayNhapHang?: string;
  ngaySanXuat?: string;
  ngayHetHan?: string;
}
