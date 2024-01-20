package dao;

import entity.User;

public class UserDAO {

    private User[] users;

    public UserDAO() {
        users = new User[]{
                new User("user1", "user1@email.com", "password1"),
                new User("user2", "user2@email.com", "password2"),
                new User("user3", "user3@email.com", "password3"),
                new User("user4", "user4@email.com", "password4"),
                new User("user5", "user5@email.com", "password5")
        };
    }

    public User[] findAllUsers() {
        return users;
    }
}
