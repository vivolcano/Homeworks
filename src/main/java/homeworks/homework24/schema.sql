create table product
(
    id serial primary key,
    title varchar(99),
    price integer check (price > 0),
    number integer check (number > 0)
);

insert into product(title, price, number)
values ('Чайник', 1000, 10);
insert into product(title, price, number)
values ('Скатерть', 99, 1000);
insert into product(title, price, number)
values ('Холодильник', 12000, 4);
insert into product(title, price, number)
values ('Стол', 3500, 20);
insert into product(title, price, number)
values ('Наушники', 6500, 5);
insert into product(title, price, number)
values ('Нокиа 3310', 990, 1);
insert into product(title, price, number)
values ('Самовар', 16500, 5);

create table client
(
    id serial primary key,
    name varchar(99)
);

insert into client(name)
values ('Олег Олегов');
insert into client(name)
values ('Петр Петров');
insert into client(name)
values ('Семен Семенов');
insert into client(name)
values ('Курмак Ускм');
insert into client(name)
values ('Елена Воробей');

create table orders
(
    id serial primary key,
    date date,
    number integer check (number > 0),
    product_id integer,
    client_id integer,
    foreign key (product_id) references product (id),
    foreign key (client_id) references client (id)
);

insert into orders (date, number, product_id, client_id)
values ('01-02-2021', 1, 1, 4);
insert into orders (date, number, product_id, client_id)
values ('09-06-2021', 3, 1, 4);
insert into orders (date, number, product_id, client_id)
values ('12-04-2021', 100, 2, 3);
insert into orders (date, number, product_id, client_id)
values ('09-09-2021', 2, 2, 1);
insert into orders (date, number, product_id, client_id)
values ('02-05-2021', 100, 2, 2);
insert into orders (date, number, product_id, client_id)
values ('09-08-2005', 8, 5, 3);

-- получить клиента, кол-во заказов

select name, (select count(*) from orders where client_id = client.id) as order_count
from client;

-- получить товар с датой заказа до 2006 года
select title
from product
where product.id in (select product_id from orders where date < '01-01-2006');

-- объединение таблиц заказ и
select *
from client a
    full join orders o on a.id = o.client_id
    full join orders o2 on a.id = o2.client_id

schema.sql