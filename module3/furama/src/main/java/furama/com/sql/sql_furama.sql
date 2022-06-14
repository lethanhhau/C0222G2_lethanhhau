drop database furama;
create database if not exists furama;
use furama;

create table if not exists furama.position(
position_id int,
position_name varchar(45),
`status` int default 0,
PRIMARY KEY(position_id)
);

create table if not exists furama.education_degree(
education_degree_id int,
education_degree_name varchar(45),
`status` int default 0,
PRIMARY KEY(education_degree_id)
);

create table if not exists furama.division(
division_id int,
division_name varchar(45),
`status` int default 0,
PRIMARY KEY(division_id)
);

create table if not exists furama.user(
username varchar(255),
password varchar(255),
`status` int default 0,
PRIMARY KEY(username)
);

create table if not exists furama.role(
role_id int,
role_name varchar(255),
`status` int default 0,
PRIMARY KEY(role_id)
);

create table if not exists furama.user_role(
role_id int,
username varchar(255),
`status` int default 0,
FOREIGN KEY (role_id) REFERENCES role(role_id),
FOREIGN KEY (username) REFERENCES user(username)
);

create table if not exists furama.employee(
employee_id int auto_increment,
employee_name varchar(45),
employee_birthday varchar(45),
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
division_id int,
education_degree_id int,
position_id int,
username varchar(45),
`status` int default 0,
PRIMARY KEY(employee_id),
FOREIGN KEY (division_id) REFERENCES division(division_id),
FOREIGN KEY (education_degree_id) REFERENCES education_degree(education_degree_id),
FOREIGN KEY (position_id) REFERENCES `position`(position_id),
FOREIGN KEY (username) REFERENCES user(username)
);

create table if not exists furama.customer_type(
customer_type_id int,
customer_type_name varchar(45),
`status` int default 0,
PRIMARY KEY(customer_type_id)
);

create table if not exists furama.customer(
customer_id int auto_increment,
customer_type_id int,
customer_name varchar(45),
customer_birthday varchar(45),
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
`status` int default 0,
PRIMARY KEY(customer_id),
FOREIGN KEY (customer_type_id) REFERENCES customer_type(customer_type_id)
);

create table if not exists furama.service_type(
service_type_id int,
service_type_name varchar(45),
`status` int default 0,
PRIMARY KEY(service_type_id)
);

create table if not exists furama.rent_type(
rent_type_id int,
rent_type_namr varchar(45),
rent_type_cost double,
`status` int default 0,
PRIMARY KEY(rent_type_id)
);

create table if not exists furama.service(
service_id int,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int,
service_type_id int,
standard_room varchar(45),
description_other_convenience varchar(45),
poll_area double,
number_of_floors int,
`status` int default 0,
PRIMARY KEY(service_id),
FOREIGN KEY (rent_type_id) REFERENCES rent_type(rent_type_id),
FOREIGN KEY (service_type_id) REFERENCES service_type(service_type_id)
);

create table if not exists furama.contract(
contract_id int,
contract_star_date varchar(45),
contract_end_date varchar(45),
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
`status` int default 0,
PRIMARY KEY(contract_id),
FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
FOREIGN KEY (service_id) REFERENCES service(service_id)
);

create table if not exists furama.attach_service(
attach_service_id int,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45),
`status` int default 0,
PRIMARY KEY(attach_service_id)
);

create table if not exists furama.contrac_detail(
contrac_detail_id int,
contract_id int,
attach_service_id int,
quantity int,
`status` int default 0,
PRIMARY KEY(contrac_detail_id),
FOREIGN KEY (contract_id) REFERENCES contract(contract_id),
FOREIGN KEY (attach_service_id) REFERENCES attach_service(attach_service_id)
);



