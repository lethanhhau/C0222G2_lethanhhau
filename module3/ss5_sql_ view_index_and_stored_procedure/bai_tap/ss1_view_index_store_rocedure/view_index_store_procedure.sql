drop database demo;
create database demo;

use demo;

create table if not exists demo.products(
id INT AUTO_INCREMENT,
product_Code int not null,
product_Name varchar(45),
product_Price double,
product_Amount int,
product_Description varchar(45),
product_Status bit default 0,
primary key (id)
);

insert into demo.products (product_Code,product_Name,product_Price,product_Amount,product_Description)
value(1,2,'hau',210.5,'12''duoc'),
(2,3,'phuong',2.5,'2''on'),
(3,4,'luan',4.5,'12''tam'),
(4,5,'tai',1.5,'9''tot');


explain select * from products
where product_code = 2;

CREATE UNIQUE INDEX uniue_index
ON demo.products (product_code);

CREATE INDEX composite_index
ON demo.products(product_name, product_price);

explain select * from products
where product_code = 2;

create view view_product as
select product_name, product_code, product_price, product_status from products;

SET SQL_SAFE_UPDATES = 0;
update view_product
set product_name = 'phuc'
where product_code = 4;
SET SQL_SAFE_UPDATES = 1;

drop view if exists view_product;

delimiter //
create procedure get_all_product()
  begin
    select * from products
    where product_status = 0;
  end //
delimiter ;

call get_all_product();

delimiter //
create procedure add_new_products(product_code int, product_name varchar(45),product_price double,product_amount int, product_description text)
  begin
    INSERT INTO demo.products (product_code, product_name, product_price,product_amount,product_description)
    VALUES (product_code,product_name,product_price,product_amount,product_description);
  end //
delimiter ;

call add_new_products(45,12,'toan',8.5,'3''tot');

delimiter //
create procedure edit_product_by_id(product_id int, product_name varchar(45))
  begin
    update products
    set product_name = product_name
    where id = product_id;
  end //
delimiter ;

call edit_product_by_id(3,"hoan");

delimiter //
create procedure delete_product_by_id(product_id int)
  begin
    update products
    set product_status = 1
    where id = product_id;
  end //
delimiter ;

call delete_product_by_id(1);










