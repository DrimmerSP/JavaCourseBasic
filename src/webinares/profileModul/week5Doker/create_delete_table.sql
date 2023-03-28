/*
Создать таблицу книг со следующими полями
- id ключ
- title- наименование книги
- author - автор книги
- date_added - дата добавления книги
 */
--DDL - Data Definition Language (создание таблиц/сиквенсов и тп)

create table public.books
(
    id          serial primary key, --первичный ключ, делает значение уникальным
    title       varchar(30) not null,
    author      varchar(30) not null,
    date_added  timestamp   not null

);

--sequence - последовательность, например от 1 до 9999999999999999999, шаг = 1 (автоинкремент)
--insert int books (...) values (sequence.next(),...)

select *
from books;


--DML - Data Manipulation Language (манипуляции с данными, создание/обновление/удаление ДАННЫХ)!
--CRUD - Create/Read/Update/Delete

insert into books(title, author, date_added)
values ('Недоросль', 'Д. И. Фонвизин', now());

--Если не указываем поля в insert, нужно вставлять все данные
insert into books
values (nextval('books_id_seq'), 'Недоросль', 'Д. И. Фонвизин', now());

insert into books(title, author, date_added)
values ('Путешествие из Петербурга в Москву', 'А. Н. Радищев', now() - interval '24h');
insert into books(title, author, date_added)
values ('Доктор Живаго', 'Б. Л. Пастернак', now() - interval '24h');
insert into books(title, author, date_added)
values ('Сестра моя - жизнь', 'Б. Л. Пастернак', now() - interval '24h');


--Изменение полей/типов данных в таблице
alter table books
    alter column title type varchar(100);

alter table books
    alter column author type varchar(100);

alter table public.books
    alter column author type varchar(100) using author::varchar(100);

---------удаление---------
--удаление конкретной строки

delete
from books
where id = 3;

delete
from books
where id in (select id from books limit 8);

--удаление всех строк
truncate table books;
-- delete from books -- можно писать условия

--удалить таблицу целиком
drop table books;
