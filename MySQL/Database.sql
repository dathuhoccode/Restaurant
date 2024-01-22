create database restaurant;
create table acc
(
    acc_name   varchar(20) not null
        primary key,
    acc_pass   varchar(20) not null,
    acc_access varchar(45) not null
);
insert into acc values('Phap','1234','ADMIN_1'),('Test','1234','CUSTOMER_1');
create table food
(
    food     varchar(30) not null
        primary key,
    quantity int         not null,
    price    int         not null,
    picture varchar(40) not null
);
insert into food values ('Chicken',1111,1111,'..\\Picture\\Chicken.jpg'),('noodle',1111,111,'..\\Picture\\noodle.jpg');
create table f_order
(
    ID       varchar(25) not null
        primary key,
    food     varchar(50) not null,
    quantity int         not null,
    total    bigint      not null
);