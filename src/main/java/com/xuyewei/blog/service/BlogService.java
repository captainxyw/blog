package com.xuyewei.blog.service;

import com.xuyewei.blog.po.Blog;
import com.xuyewei.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * ClassName:BlogService
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/18 19:27
 * @Author:xuyewei
 */

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
