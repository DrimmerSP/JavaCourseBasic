drop TABLE clients CASCADE;
drop TABLE flowers CASCADE;
drop TABLE orders CASCADE;

create table if not exists flowers
(
    f_id    serial primary key,
    f_name  varchar(100) unique check ( f_name <> '') not null,
    f_price integer                                   not null
);

create table if not exists clients
(
    c_id    serial primary key,
    c_name  varchar(50)        not null,
    c_phone varchar(30) unique not null
);

create table if not exists orders
(
    o_id        serial primary key,
    o_client_id integer references clients (c_id)                   not null,
    o_flower_id integer references flowers (f_id)                   not null,
    o_amount    integer check ( o_amount >= 1 and o_amount <= 1000) not null,
    o_date      timestamp default (now())
);

