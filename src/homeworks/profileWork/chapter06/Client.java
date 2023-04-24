package homeworks.profileWork.chapter06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String phone;
    private String email;
    private List<String> bookList;

    public Client(String lastName, String firstName, LocalDate birthDate, String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.bookList = new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void addBook(String bookName) {
        bookList.add(bookName);
    }
    public void removeBook(String bookName) {
        bookList.remove(bookName);
    }
}
