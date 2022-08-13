package com.app.services;

import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
//        List<User> users = new ArrayList<>();
//        users.add(new User("test1", "test1", "test1@test.ua", "01"));
//        users.add(new User("test2", "test2", "tes2t@test.ua", "02"));
//        users.add(new User("test3", "test3", "test3@test.ua", "03"));
//        users.add(new User("test4", "test4", "test4@test.ua", "04"));
//        users.add(new User("test5", "test5", "test5@test.ua", "05"));
//        users.add(new User("test6", "test6", "test6@test.ua", "06"));
//        users.add(new User("test7", "test7", "test7@test.ua", "07"));
//        users.add(new User("test8", "test8", "test8@test.ua", "08"));
//        users.add(new User("test9", "test9", "test9@test.ua", "09"));
//        users.add(new User("test10", "test10", "test10@test.ua", "10"));
//        return users;
    }



    public User validateUser(User user) {
        if (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
                !user.getEmail().isEmpty() && !user.getPhone().isEmpty()) {

            String phone = user.getPhone().trim().replaceAll("\\(", "")
                    .replaceAll("\\)", "");
            user.setPhone(phone);
            userDao.storeUser(user);
            return user;
        }

        return null;
    }

}
