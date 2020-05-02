package com.zuohc.test.dao;

import com.zuohc.test.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select user_id userId,user_name userName from pl_user")
    List<User> getUserList();

    @Select("select user_id userId,user_name userName from pl_user where user_id=#{id}")
    User getUserById(@Param("id") Integer id);
}
