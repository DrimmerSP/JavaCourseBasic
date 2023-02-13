package homeworks.work03.chapter2;

/**
 * Тестирование.
 * 7. В методе main написать несколько тестов на реализованный функционал.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Создаём библиотеку: ");
        System.out.println("--------------------------");
        Library library = new Library();

        System.out.println("Заполняем библиотеку: ");

        Book book1 = new Book("Зловещий гном", "Джон Аскед");
        Book book2 = new Book("Морровинд", "Джон Аскед");
        Book book3 = new Book("Дыхание Азуры", "Джон Аскед");
        Book book4 = new Book("Пернатые говоруны", "Анжелика Графикская");
        Book book5 = new Book("Кошки саванны", "Анжелика Графикская");
        Book book6 = new Book("Принципы тяготения", "Владимр Донской");
        Book book7 = new Book("Бозоны", "Ричард Хикс");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        System.out.println("--------------------------");

        System.out.println("Размер библиотеки должен быть 7 книг: %s".formatted(library.getBooks().size()));
        System.out.println("--------------------------");
        System.out.println("Проверяем, что книги могут удаляться: ");
        System.out.println("--------------------------");

        library.deleteBookByName("book");
        System.out.println("Размер заполненной библиотеки измениться не должен:" + library.getBooks().size());
        System.out.println();
        System.out.println("Теперь с явным удалением книги из списка: ");
        library.deleteBookByName(book6.getBookName());
        System.out.println("Размер изменённой библиотеки должен теперь быть равен шести: " + library.getBooks().size());
        System.out.println("--------------------------");

        System.out.println("Проверка поиска книги по названию: ");
        System.out.println(library.getBookByName(book3.getBookName()));
        System.out.println("--------------------------");

        System.out.println("Возвращение списка книг по автору: ");
        System.out.println(library.getBooksByAuthor(book1.getBookAuthor()).size());
        System.out.println("--------------------------");

        System.out.println("Создаём нового пользователя:");
        User user = new User("Василий Ложкин");
        System.out.println("Его имя: %s ".formatted(user.getNameUser()));
        System.out.println("--------------------------");

        System.out.println("Выдадим книгу пользователю: ");
        library.giveBookToUser(book4.getBookName(), user);
        System.out.println();
        System.out.println("Книга 4 должна быть выдана: %s".formatted(book4.isTaken()));
        System.out.println("Пользователь %s получил книгу %s: %s".formatted(user.getNameUser(), book4.getBookName(),
                user.getNameBookFromLib()));
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Вернём книгу от пользователя: ");
        library.returnBookFromUser(book5.getBookName(), user, 8);
        System.out.println("Пользователь: %s должен веруть книгу - %s".formatted(user.getNameUser(), user.getNameBookFromLib()));
        library.returnBookFromUser(book4.getBookName(), user, 9);
        System.out.println("Теперь %s вернул взятую книуг.".formatted(user.getNameUser()));
        System.out.println("Книгу \"%s\", автора \"%s\" читают или нет?: (%s)".formatted(book4.getBookName(), book4.getBookAuthor(), book4.isTaken()));
        System.out.println("--------------------------");

        System.out.println("Средняя оценка книги \"%s\" теперь: %s".formatted(book4.getBookName(), library.getBookRateByName(book4.getBookName())));

    }
}
