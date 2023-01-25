package week7.task7;

/*
Реализовать класс Аккаунт с помощью паттерна проектирования Builder
Паттерн проектирования Builder разработан для обеспечения гибкого решения различных задач
создания объектов в объектно-ориентированном программировании.
Паттерн проектирования Builder позволяет отделить построение сложного объекта от его представления.

Паттерн Builder — это паттерн проектирования, который позволяет поэтапно создавать сложные объекты с
помощью четко определенной последовательности действий.
Паттерн предоставляет один из лучших способов создания сложных объектов.
 */

public class Account {
    private String token;
    private String userId;

    private Account() {}

    public String getToken() {
        return token;
    }

    public String getUserId() {
        return userId;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    public class Builder {
        private Builder() {}

        public Builder setUserId(String userId) {
            Account.this.userId = userId;
            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
