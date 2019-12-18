package com.xuyewei.blog.dao;

import com.xuyewei.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ClassName:BlogRepository
 * Package:com.xuyewei.blog.dao
 * Description:
 *
 * @Date:2019/12/18 19:30
 * @Author:xuyewei
 */

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {


}
