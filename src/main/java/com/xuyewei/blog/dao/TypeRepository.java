package com.xuyewei.blog.dao;

import com.xuyewei.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * ClassName:TypeRepository
 * Package:com.xuyewei.blog.dao
 * Description:
 *
 * @Date:2019/12/18 14:01
 * @Author:xuyewei
 */

public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);

}
