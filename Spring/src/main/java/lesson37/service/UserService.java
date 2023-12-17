package lesson37.service;

import java.util.List;

public interface UserService {
    void addUser(String username);
    List<String> getUsers();
}
