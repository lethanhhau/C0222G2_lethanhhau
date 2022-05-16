drop database if exists student;
create database if not exists student;

create table student.class(
id int primary key,
name varchar(100) not null
);
create table student.teacher(
id int  primary key,
name varchar(100) not null,
age int(3),
country varchar(100)
);

insert into student.class(id,name)
values(1,'luan'),(2,'hau');

insert into student.teacher(id,name,age,country)
values(1,'phuong',10,'danang') , (2,'tai',20,'thanh hoa') ;