package com.xuyewei.blog.dao;

import com.xuyewei.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName:UserRepository
 * Package:com.xuyewei.blog.dao
 * Description:
 *
 * @Date:2019/12/17 19:01
 * @Author:xuyewei
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
