package homeworks.basicWorks.work03.chapter2;

/**
 * Должен быть реализован класс Посетитель, содержащий имя посетителя и идентификатор
 * (null до тех пор, пока не возьмет книгу)
 */
public class User {
    private final String nameUser;
    private Long id;
    private String nameBookFromLib;

    /**
     * Механизм одалживания книги посетителю. Каждый посетитель в один момент времени может читать только одну книгу.
     * Одолжить книгу посетителю по названию, если выполнены все условия:
     * 5
     * Она есть в библиотеке.
     * У посетителя сейчас нет книги.
     * Она не одолжена.
     * <p>
     * Также если посетитель в первый раз обращается за книгой — дополнительно выдать ему идентификатор читателя.
     */


    public User(String nameUser) {
        this.nameUser = nameUser;
        id = null;
    }

    public String getNameUser() {
        return nameUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBookFromLib() {
        return nameBookFromLib;
    }

    public void setNameBookFromLib(String nameBookFromLib) {
        this.nameBookFromLib = nameBookFromLib;
    }
}
