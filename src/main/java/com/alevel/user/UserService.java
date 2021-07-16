package com.alevel.user;

public interface UserService {
    User getUserById(int id);

    String getEmailByName(String name);
}
