package jdbcexample;

import jdbcexample.db.SingletonExample;
import jdbcexample.db.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        try {
            User user = new User("poxos","poxosyan","poxos@mail.ru","poxos");
            userManager.addUser(user);
            List<User> allUsers = userManager.getAllUsers();
            for (User user1 : allUsers) {
                System.out.println(user1);
            }

            userManager.deleteUserByID(4);
            allUsers = userManager.getAllUsers();
            for (User user1 : allUsers) {
                System.out.println(user1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
