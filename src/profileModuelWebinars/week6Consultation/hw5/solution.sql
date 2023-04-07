-- Ирина, подруга Пети, решила создать свой бизнес по продаже цветов. Начать
-- она решила с самых основ: создать соответствующую базу данных для своего
-- бизнеса. Она точно знает, что будет продавать Розы по 100 золотых монет за
-- единицу, Лилии по 50 и Ромашки по 25.

create table if not exists flowers
(
    id      serial primary key,
    title   varchar(100) UNIQUE check ( title <> '') not null,
    price   integer not null
);

insert into flowers (title, price)
values ('Розы', 100);
insert into flowers (title, price)
values ('Лилии', 50);

insert into flowers
values (nextval('flowers_id_seq'), 'Ромашки', 25);

-- Помимо этого, ей хочется хранить данные своих покупателей (естественно они
-- дали согласие на хранение персональной информации). Сохранять нужно Имя
-- и Номер телефона.
create table if not exists clients
(
    id    serial primary key,
    name  varchar(50) not null,
    phone varchar(30) not null
);


insert into clients (name, phone)
values ('Анна', '79601234567'),
       ('Вениамин', '79001234567'),
       ('Инга', '79510001122'),
       ('Николай', '79605552030'),
       ('Петр', '79085052139');

select * from flowers;
select * from clients;

-- И, конечно, данные самого заказа тоже нужно как-то хранить! Ирина пока не
-- продумала поля, но она точно хочет следовать следующим правилам:
-- ● в рамках одного заказа будет продавать только один вид цветов
-- (например, только розы)
-- ● в рамках одного заказа можно купить от 1 до 1000 единиц цветов.

create table if not exists orders
(
    id              serial primary key,
    client_id       integer references clients (id)                     not null,
    flower_id        integer references flowers (id)                       not null,
    amount          integer check ( amount >= 1 and amount <= 1000 )    not null,
    date            timestamp                                           not null
);

insert into orders (client_id, flower_id, amount, date)
values (2, 2, 10, '2022-09-01'),
       (2, 2, 5, '2022-09-10'),
       (3, 1, 3, '2022-09-30'),
       (3, 1, 6, '2022-10-02');

select * from orders;

-- 1. По идентификатору заказа получить данные заказа и данные клиента,
-- создавшего этот заказ
select o.id, f.title, o.amount, c.name, c.phone
from orders o
        inner join clients c on c.id = o.client_id
        inner join flowers f on f.id = o.flower_id;

-- 4. Вывести общую выручку (сумму золотых монет по всем заказам) за все
-- время
select sum(o.amount * f.price) as total
from orders o inner join flowers f on f.id = o.flower_id;

drop table flowers;