package org.example.service.Impl;

import org.example.model.User;
import org.example.model.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return user.equals(user.equals(userDao.getUsersByName(user.getName())));
    }
}
