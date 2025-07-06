package pl.coderslab;

import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();
//        User user = new User();
////        user.setUserName("Polina");
////        user.setEmail("Polina@gmail.com");
////        user.setPassword("222333");
////        userDao.createUser(user);


//        User read = userDao.readUser(1);
//        System.out.println(read);
//
//        User readCheck = userDao.readUser(3);
//        System.out.println(readCheck);

//        User userForUpdate = userDao.readUser(1);
//        userForUpdate.setUserName("Anton");
//        userForUpdate.setPassword("123456");
//        userForUpdate.setEmail("Anton@gmail.com");
//        userDao.updateUser(userForUpdate);

//
//        User[] all = userDao.readAllUsers();
//        for (User u : all) {
//            System.out.println(u);
//        }
//        userDao.deleteUser(3);

        User[] all = userDao.readAllUsers();
        for (User user : all) {
            System.out.println(user);
        }



        



    }
}