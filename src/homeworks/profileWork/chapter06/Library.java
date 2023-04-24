package homeworks.profileWork.chapter06;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Client> clientList;
    private List<String> bookList;
    // Конструктор
    public Library() {
        this.clientList = new ArrayList<>();
        this.bookList = new ArrayList<>();
    }
    // Метод для поиска клиента по фамилии
    public Client findClientByLastName(String lastName) {
        for (Client client : clientList) {
            if (client.getLastName().equals(lastName)) {
                return client;
            }
        }
        return null;
    }
    // Метод для поиска клиента по телефону
    public Client findClientByPhone(String phone) {
        for (Client client : clientList) {
            if (client.getPhone().equals(phone)) {
                return client;
            }
        }
        return null;
    }
    // Метод для поиска клиента по почте
    public Client findClientByEmail(String email) {
        for (Client client : clientList) {
            if (client.getEmail().equals(email)) {
                return client;
            }
        }
        return null;
    }
}
