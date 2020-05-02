package com.zuohc.test.service;

import com.zuohc.test.dao.UserDao;
import com.zuohc.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getUserList(){
        return userDao.getUserList();
    }

    @Transactional(readOnly = true)
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
