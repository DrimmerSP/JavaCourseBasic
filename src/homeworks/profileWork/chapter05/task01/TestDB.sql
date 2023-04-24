SELECT *
FROM flowers;

SELECT *
FROM clients;
-- drop TABLE clients CASCADE;
-- drop TABLE flowers CASCADE;
-- drop TABLE orders CASCADE;

SELECT c.c_name, c.c_phone, f.f_name, o_amount, f.f_price, o_date
FROM orders
         JOIN clients c ON orders.o_client_id = c.c_id
         JOIN flowers f ON f.f_id = orders.o_flower_id
WHERE f.f_name = 'Розы';

SELECT c.c_name, c.c_phone, f.f_name, o_amount, (o_amount * f.f_price) AS o_cost, o_date
FROM orders
         JOIN clients c ON orders.o_client_id = c.c_id
         JOIN flowers f ON f.f_id = orders.o_flower_id
WHERE (o_amount * f.f_price) > 500;



