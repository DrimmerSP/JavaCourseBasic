select *
FROM flowers;

select *
FROM clients;
-- drop TABLE clients CASCADE;
-- drop TABLE flowers CASCADE;
-- drop TABLE orders CASCADE;

select c.c_name, c.c_phone, f.f_name, o_amount, f.f_price, o_date
FROM orders
         join clients c on orders.o_client_id = c.c_id
         join flowers f on f.f_id = orders.o_flower_id
where f.f_name = 'Розы';

select c.c_name, c.c_phone, f.f_name, o_amount, (o_amount * f.f_price) as o_cost, o_date
FROM orders
         join clients c on orders.o_client_id = c.c_id
         join flowers f on f.f_id = orders.o_flower_id
where (o_amount * f.f_price) > 500;



