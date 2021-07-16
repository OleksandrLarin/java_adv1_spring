package com.alevel.user;

public class UserBuilder {
    public User buildUser() {
        User user = new User();
        user.setName("John");
        user.setAge(22);

        return user;
    }
}
