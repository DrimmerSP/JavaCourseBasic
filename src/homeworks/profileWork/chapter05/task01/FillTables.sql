INSERT INTO flowers(f_name, f_price)
VALUES ('Розы', 100),
       ('Лилии', 50),
       ('Ромашки', 25);

INSERT INTO clients(c_name, c_phone)
VALUES ('Анна', '79601234567'),
       ('Вениамин', '79001234567'),
       ('Инга', '79510001122'),
       ('Николай', '79605552030'),
       ('Петр', '79085052139');

INSERT INTO orders(o_client_id, o_flower_id, o_amount, o_date)
VALUES (1, 1, 15, '2022-09-01'),
       (2, 2, 9, '2022-09-10'),
       (4, 3, 125, '2022-09-30'),
       (3, 1, 11, '2022-10-02');