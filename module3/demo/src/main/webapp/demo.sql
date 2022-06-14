drop database if exists `demo_c02`;
create database if not exists `demo_c02`;
use `demo_c02`;

create table if not exists `student` (
`id` int auto_increment,
`name` varchar(255),
`point` double,
primary key (`id`)
);

INSERT INTO `student` (`name`, `point`) 
VALUES ('tai ngu', 10),
('tai ngu 1', 11),
('tai ngu 2', 12),
('tai ngu 3', 13),
('tai ngu 4', 14),
('tai ngu 5', 15);
