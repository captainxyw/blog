package com.xuyewei.blog.service;

import com.xuyewei.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * ClassName:TypeService
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/18 13:58
 * @Author:xuyewei
 */

public interface TypeService {
    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    Type updateType(Long id, Type type);

    void deleteType(Long id);


}
