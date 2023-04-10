insert into flowers(f_name, f_price)
values ('Розы', 100),
       ('Лилии', 50),
       ('Ромашки', 25);

insert into clients(c_name, c_phone)
values ('Анна', '79601234567'),
       ('Вениамин', '79001234567'),
       ('Инга', '79510001122'),
       ('Николай', '79605552030'),
       ('Петр', '79085052139');

insert into orders(o_client_id, o_flower_id, o_amount, o_date)
values (1, 1, 15, '2022-09-01'),
       (2, 2, 9, '2022-09-10'),
       (4, 3, 125, '2022-09-30'),
       (3, 1, 11, '2022-10-02');