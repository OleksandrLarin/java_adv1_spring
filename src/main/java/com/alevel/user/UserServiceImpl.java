package com.alevel.user;

import com.alevel.dao.UserDao;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }

    @Override
    public String getEmailByName(String name) {
        return userDao.getContact(name);
    }


}
