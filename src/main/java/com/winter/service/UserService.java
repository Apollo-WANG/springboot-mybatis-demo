package com.winter.service;

import com.winter.model.User;

import java.util.List;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 20:59 2018/10/2
 * @Modified By:
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}