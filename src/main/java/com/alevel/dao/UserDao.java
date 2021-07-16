package com.alevel.dao;

import com.alevel.user.User;

import java.util.Map;
import java.util.Properties;

public class UserDao {
    private final Map<Integer, User> users;

    private Properties contacts;

    public UserDao(Map<Integer, User> users) {
        this.users = users;
    }

    public User getById(int id) {
        return users.get(id);
    }

    public String getContact(String name) {
        return contacts.getProperty(name);
    }

    public void setContacts(Properties contacts) {
        this.contacts = contacts;
    }
}
