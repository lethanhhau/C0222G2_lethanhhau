drop database sales_manager;
create database sales_manager;
use sales_manager;

create table customer(
customer_id varchar(45),
customer_name varchar(45),
customer_age int(3),
primary key(customer_id)
);

create table pruduct(
pruduct_id varchar(45),
pruduct_name varchar(45),
pruduct_price double,
primary key (pruduct_id)
);

create table `order`(
order_id varchar(45),
customer_id varchar(45),
order_date datetime,
order_total_price double,
primary key(order_id),
foreign key(customer_id)references customer(customer_id)
);

create table order_detail(
order_id varchar(45),
pruduct_id varchar(45),
order_detail_QTY varchar(255),
primary key(order_id,pruduct_id),
foreign key(order_id) references `order`(order_id),
foreign key(pruduct_id) references pruduct(pruduct_id)
);
