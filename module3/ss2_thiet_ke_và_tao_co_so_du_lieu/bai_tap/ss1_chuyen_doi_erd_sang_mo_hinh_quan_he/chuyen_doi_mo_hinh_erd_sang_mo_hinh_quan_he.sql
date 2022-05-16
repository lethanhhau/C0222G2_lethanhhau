drop database quan_ly;
create database quan_ly;
use quan_ly;

create table nha_cung_cap(
ma_nha_cung_cap varchar(45),
ten_nha_cung_cap varchar(45),
dia_chi varchar(45),
so_dien_thoai varchar(10),
primary key(ma_nha_cung_cap)
);

create table so_dien_thoai(
ma_nha_cung_cap varchar(45),
value_so_dien_thoai varchar(10),
primary key(value_so_dien_thoai),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table don_dat_hang(
so_don_hang varchar(45),
ngay_dat_hang datetime,
ma_nha_cung_cap varchar(45),
primary key(so_don_hang),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table phieu_xuat(
so_phieu_xuat varchar(45),
ngay_xuat datetime,
primary key(so_phieu_xuat)
);

create table vat_tu(
ma_vat_tu varchar(45),
ten_vat_tu varchar(45),
primary key(ma_vat_tu)
);

create table phieu_nhap(
so_phieu_nhap varchar(45),
ngay_nhap datetime,
primary key(so_phieu_nhap)
);

create table chi_tiet_phieu_xuat(
don_gia_xuat varchar(45),
so_luong_xuat int,
so_phieu_xuat varchar(45),
ma_vat_tu varchar(45),
primary key(so_phieu_xuat,ma_vat_tu),
foreign key(so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table chi_tiet_phieu_nha(
don_gia_nhap double,
so_luong_nhap int,
ma_vat_tu varchar(45),
so_phieu_nhap varchar(45),
primary key(ma_vat_tu,so_phieu_nhap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);

create table chi_tiet_don_dat_hang(
ma_vat_tu varchar(45),
ma_nha_cung_cap varchar(45),
primary key(ma_vat_tu,ma_nha_cung_cap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);


