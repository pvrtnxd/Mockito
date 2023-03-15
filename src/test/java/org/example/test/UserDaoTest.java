package org.example.test;

import org.example.model.Impl.UserDaoImpl;
import org.example.model.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserDaoTest {

    private final UserDaoImpl userDao = new UserDaoImpl();

    @Test
    public void returner() {
        User user = new User("Anna");
        Assertions.assertEquals(user, userDao.getUsersByName(user.getName()));
    }

    @Test
    public void nullReturner() {
        User user = new User("Anton");
        Assertions.assertNull(userDao.getUsersByName(user.getName()));
    }
}
