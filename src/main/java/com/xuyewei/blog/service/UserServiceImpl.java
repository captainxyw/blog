package com.xuyewei.blog.service;

import com.xuyewei.blog.dao.UserRepository;
import com.xuyewei.blog.po.User;
import com.xuyewei.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/17 19:00
 * @Author:xuyewei
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
