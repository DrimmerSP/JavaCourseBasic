--  По идентификатору заказа получить данные заказа
--  и данные клиента,  создавшего этот заказ.
SELECT *
FROM orders
         JOIN clients c ON c.c_id = orders.o_client_id
WHERE o_id = 2;

-- Получить данные всех заказов одного клиента по идентификатору клиента
-- за последний месяц.
SELECT *
FROM orders
         JOIN clients c ON c.c_id = orders.o_client_id
WHERE c_id = 3
  AND o_date BETWEEN CURRENT_TIMESTAMP - INTERVAL '1 MONTH'
    AND CURRENT_TIMESTAMP;

-- Найти заказ с максимальным количеством купленных цветов, вывести их название и количество
SELECT f.f_name, o_amount
FROM orders
         JOIN flowers f ON f.f_id = orders.o_flower_id
WHERE o_amount = (SELECT MAX(o_amount) FROM orders);

-- Вывести общую выручку (сумму золотых монет по всем заказам) за все время
SELECT SUM(o_amount * f_price) AS total
FROM orders o
         INNER JOIN flowers f ON f.f_id = o.o_flower_id;