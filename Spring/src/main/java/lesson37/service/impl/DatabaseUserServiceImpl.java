package lesson37.service.impl;

import lesson37.service.UserService;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUserServiceImpl implements UserService {
    private List<String> users = new ArrayList<>();
    @Override
    public void addUser(String username) {
        System.out.println("Adding user to the database: " + username);
        users.add(username);
    }

    @Override
    public List<String> getUsers() {
        System.out.println("Fetching users from the database");
        return new ArrayList<>(users);
    }
}
