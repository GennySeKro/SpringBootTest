package rich.springbootdemo.service;

import rich.springbootdemo.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> list();
}
