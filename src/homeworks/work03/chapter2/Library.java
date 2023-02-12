package homeworks.work03.chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Должен быть реализован класс Библиотека со следующим функционалом:
 * <p>
 * Работа со списком существующих книг в библиотеке.
 * Сюда входят все добавленные книги, в том числе и одолженные.
 * Название книги считается уникальным, и в библиотеке не может быть двух книг с одинаковым названием.
 */
public class Library {
    private HashMap<String, Book> books;
    private ArrayList<User> users;
    private ArrayList<Book> booksTaken;
    private static long userID;

    public Library(){
        books = new HashMap<>();
        users = new ArrayList<>();
        booksTaken = new ArrayList<>();
        userID = 1L;
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void addBook(Book newBook){
        books.put(newBook.getBookName(), newBook);
    }

    public void giveBookToUser(String nameBook, User user){
        if(!books.containsKey(nameBook)){
            System.out.println("Книги с названием %s нет в библиотеке".formatted(nameBook));
            return;
        }
        if (!(user.getNameBookFromLib() == null || user.getNameBookFromLib().equals(""))){
            System.out.println("Пользователь %s уже читает книгу %s".formatted(user.getNameUser(), user.getNameBookFromLib()));
            return;
        }
        if (books.get(nameBook).isTaken()){
            System.out.println("Книгу %s уже кто-то читает.".formatted(nameBook));
            return;
        }
        if (user.getId() == null){
            user.setId(userID++);
        }
        user.setNameBookFromLib(nameBook);
        books.get(nameBook).setTaken(true);
    }

    public void returnBookFromUser(String nameBook, User user){
        if(!books.containsKey(nameBook)){
            System.out.println("Книга %s взята не в этой библиотеке".formatted(nameBook));
            return;
        }
        if (!user.getNameBookFromLib().equals(nameBook)){
            System.out.println("Пользователь %s не брал книгу %s ".formatted(user.getNameUser(), nameBook));
            return;
        }
        user.setNameBookFromLib("");
        books.get(nameBook).setTaken(false);
    }

    public void deleteBookByName(String naBook){
        if (books.containsKey(naBook) && !books.get(naBook).isTaken()){
            books.remove(naBook);
        }
    }

    public Book getBookByName(String nBook){
        return books.get(nBook);
    }
    public List<Book> getBooksByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for (Book value : books.values()) {
            if (value.getBookAuthor().equals(author)){
                result.add(value);
            }
        }
        return result;
    }
}
