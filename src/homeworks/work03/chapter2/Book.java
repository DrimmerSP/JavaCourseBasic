package homeworks.work03.chapter2;

/**
 * Должен быть реализован класс Книга, содержащий название и автора
 */
public class Book {
    private final String bookName;
    private final String bookAuthor;
    private Boolean taken;  // Взята книга или нет.


    public String getBookName() {
        return bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }

    public Boolean isTaken() {
        return taken;
    }

    public void setTaken(Boolean taken) {
        this.taken = taken;
    }

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        taken = false;
    }

    @Override
    public String toString() {
        return bookName + ", Автор: " + bookAuthor;
    }
}
