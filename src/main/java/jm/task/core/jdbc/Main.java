package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();
        userService.saveUser("Nikolay", "Rasputin", (byte)45);
        userService.saveUser("Mike", "Mouse", (byte)5);
        userService.saveUser("Arnold", "Schwarzenegger", (byte)57);
        userService.saveUser("Vladimir", "Katina", (byte)14);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
