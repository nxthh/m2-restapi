package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {

        users = new ArrayList<>();

        User usrAdmin = new User(UUID.randomUUID(), "Administrator", "admin", "admin123", true);
        User usrEditor = new User(UUID.randomUUID(), "Editor", "editor", "editor123", false);
        User usrCustomer = new User(UUID.randomUUID(), "John Doe", "JohnDoe", "john123", true);
        users.add(usrAdmin);
        users.add(usrEditor);
        users.add(usrCustomer);
    }

    public List<User> selectAll() {
        return users;
    }

    public Optional<User> selectById(UUID id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public void insert(User user) {
        users.add(user);
    }

    public boolean deleteById(UUID id) {
        return users.removeIf(user -> user.getId().equals(id));
    }

}
