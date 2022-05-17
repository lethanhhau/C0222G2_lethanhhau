drop database sales_manager;
create database sales_manager;
use sales_manager;

create table customer(
customer_id varchar(45),
customer_name varchar(45),
customer_age int(3),
primary key(customer_id)
);

create table product(
product_id varchar(45),
product_name varchar(45),
product_price double,
primary key (product_id)
);

create table orders(
orders_id varchar(45),
customer_id varchar(45),
orders_date datetime,
orders_total_price double,
primary key(orders_id),
foreign key(customer_id)references customer(customer_id)
);

create table orders_detail(
orders_id varchar(45),
product_id varchar(45),
orders_detail_QTY int,
primary key(orders_id,product_id),
foreign key(orders_id) references orders(orders_id),
foreign key(product_id) references product(product_id)
);

insert into customer 
value(1,'Minh Quan',10),(2,'Ngoc Oanh',20),(3,'Hong Ha',50);

insert into orders 
value(1,1,'2006-3-21',null),(2,2,'2006-3-23',null),(3,1,'2006-3-16',null);

insert into product
value(1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);

insert into orders_detail
value(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

select orders.orders_id,orders.orders_date, product.product_price from orders
join orders_detail on orders.orders_id = orders_detail.orders_id
join product on orders_detail.product_id = product.product_id;

select customer.customer_name,product.product_name from customer
join orders on customer.customer_id = orders.customer_id
join orders_detail on orders.orders_id = orders_detail.orders_id
join product on orders_detail.product_id = product.product_id;

select customer.* from customer
where customer_name not in(
select customer.customer_name from customer
join orders on customer.customer_id = orders.customer_id
join orders_detail on orders.orders_id = orders_detail.orders_id
join product on orders_detail.product_id = product.product_id
group by customer_name
);

select orders.orders_id,orders.orders_date,sum(orders_detail_QTY * product_price) as total from orders
join orders_detail on orders.orders_id = orders_detail.orders_id
join product on orders_detail.product_id = product.product_id
group by orders_id;









