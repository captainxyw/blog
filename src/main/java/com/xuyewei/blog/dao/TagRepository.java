package com.xuyewei.blog.dao;

import com.xuyewei.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName:TagRepository
 * Package:com.xuyewei.blog.dao
 * Description:
 *
 * @Date:2019/12/18 17:21
 * @Author:xuyewei
 */

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
