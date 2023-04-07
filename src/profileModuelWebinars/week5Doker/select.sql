create table books
(
    id         serial primary key,
    title      varchar(100) NOT NULL,
    author     varchar(100) NOT NULL,
    date_added timestamp    NOT NULL
);
INSERT INTO books(title, author, date_added)
VALUES ('Недоросль', 'Д. И. Фонвизин', now());
INSERT INTO books(title, author, date_added)
VALUES ('Путешествие из Петербурга в Москву', 'А. Н. Радищев', now() - interval '24h');
INSERT INTO books(title, author, date_added)
VALUES ('Доктор Живаго', 'Б. Л. Пастернак', now() - interval '24h');
INSERT INTO books(title, author, date_added)
VALUES ('Сестра моя - жизнь', 'Б. Л. Пастернак', now());

select *
from books;

--1. Достать запись под id = 4
select *
from books
where id = 4;

select *
from books
order by date_added desc --asc (по-умолчанию)
limit 2;

--2. Найти автора книги по названию ‘Недоросль’
select *
from books
where title = 'Недоросль';

--3. Найти все книги Пастернака
select *
from books
where trim(author) ilike '%пастернак';

--4. Вывести максимальный id в таблице
select max(id)
from books;

--общее количество записей(строк) в таблице
select count(*) as count_books
from books;
--avg, min, sum, count, mod, power....

--5. Найти все книги Радищева или Пастернака отсортированные по дате в обратном порядке
select *
from books
where trim(author) ilike '%пастернак'
    or trim(author) ilike '%Радищев'
order by date_added desc;

select *
from books
where trim(author) ilike '%пастернак'
--union
union all
select *
from books
where trim(author) ilike '%радищев'
order by date_added desc;


--1 2 3 4 5
--2 3 4 6 7

--union = 1 2 3 4 5 6 7
--union all = 1 2 2 3 3 4 4 6 7

--6. Найти все книги Пастернака добавленные вчера
select *
from books
where trim(author) ilike '%пастернак'
    and date_added <= now() - interval '24h';






