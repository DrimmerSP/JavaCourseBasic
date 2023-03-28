--связи таблиц
--Foreign key - внешний/вторичный ключ
/*
виды связей:
 1 - 1,
 1 - M, M - 1
 M - M - делится на две M:1 (1:M) - то есть, добавляется третья таблица
книги           авторы          авторы_книг
id              id              id  id_книги  id_автора
1               4               1   1         4
2               5               2   1         6
3               6               3   2         5
 */
CREATE TABLE IF NOT EXISTS reviews
(
    id       bigserial primary key,
    book_id  integer REFERENCES books (id),
    reviewer varchar(100) NOT NULL,
    rating   integer      NOT NULL,
    comment  text         NULL
);

--Попробуем добавить отзыв к книге, айдишника которого не существует (foreign key не даст)
INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (777, 'Петя', 9, 'отличная книга');


select * from books;

INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (1, 'Петя', 10, 'отличная книга');

INSERT INTO reviews(book_id, reviewer, rating)
VALUES (1, 'Кирилл', 9);
INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (3, 'Петя', 7, 'ок');
INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (4, 'Иннокентий', 2, 'не понравилась');

select * from reviews;

--Достать только те записи reviews, у которых comment != null
select *
from reviews
where comment is not null;


--Посчитать сколько всего записей в reviews. Назвать столбец Количество отзывов (Элиас)
select count(*) as "Количество отзывов"
from reviews;

--Узнать количество уникальных id книг, по которым были оставлены отзывы:
select count(distinct book_id)
from reviews;

--Вывести сколько review по каждой id книги
select book_id, count(*)
from reviews
group by book_id
order by 1;


--Вывести все значения по books и по reviews (объединение столбцов результатов)
select *
from books,
     reviews
where books.id = reviews.book_id;

--inner join
select *
from books b
         join reviews r on b.id = r.book_id;

--left/right joins
select *
from books b
         left join reviews r on b.id = r.book_id;
-- from reviews r left join books b on r.book_id = b.id;

--Вычислить среднюю оценку по каждой книге. Вывести столбцы Оценка, Название книги.
select b.title, avg(r.rating)
from books b
         join reviews r on b.id = r.book_id
group by b.title;






