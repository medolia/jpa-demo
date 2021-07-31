package com.que.demo.h2AndJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lbli@trip.com
 * @date 2021-07-31
 */
@RestController
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/data/user")
    public String userInfo() {
        StringBuilder builder = new StringBuilder();

        List<UserInfo> userInfoList = userDao.findAll();
        userInfoList.forEach(p -> builder.append(p.toString()));

        return builder.toString();
    }
}
