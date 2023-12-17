package lesson37.service.impl;

import lesson37.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserServiceImpl implements UserService {
    private List<String> users = new ArrayList<>();
    @Override
    public void addUser(String username) {
        users.add(username);
    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(users);
    }
}
