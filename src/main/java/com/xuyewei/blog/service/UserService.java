package com.xuyewei.blog.service;

import com.xuyewei.blog.po.User;

/**
 * ClassName:UserService
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/17 18:59
 * @Author:xuyewei
 */

public interface UserService {

    User checkUser(String username, String password);
}
