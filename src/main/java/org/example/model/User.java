package org.example.model;
import org.apache.commons.lang3.StringUtils;

public class User {

    private String login;

    private String email;

    public User() {
    }


    public User(String login, String email) {

        if (!StringUtils.containsAny("@", email) || !StringUtils.containsAny(".", email)) {
            throw new RuntimeException("Некорректный email");
        } else if (login.equals(email)) {
            throw new RuntimeException("Логин и email одинаковые");
        }
        this.login = login;
        this.email = email;

    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

}
