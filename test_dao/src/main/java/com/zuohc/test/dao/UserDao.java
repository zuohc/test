package com.zuohc.test.dao;

import com.zuohc.test.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select user_id userId,user_name userName from pl_user")
    public List<User> getUserList();
}
