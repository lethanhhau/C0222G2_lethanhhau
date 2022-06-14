
create database demo;
use demo;

create table users(
id int(3) not null auto_increment,
name varchar(255) not null,
email varchar(255) not null,
country varchar(255) not null,
primary key (id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam'), ('Kante','kante@che.uk','Kenia');

