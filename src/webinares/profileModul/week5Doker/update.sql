--Обновление данных
update books
set date_added = '2020-02-02'
where id in (select id from books where trim(author) ilike '%пастернак');

select *
from books;