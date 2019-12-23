package com.xuyewei.blog.service;

import com.xuyewei.blog.po.Blog;
import com.xuyewei.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

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

  Blog getAndConvert(Long id);


  Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

  Page<Blog> listBlog(Pageable pageable);

  Page<Blog> listBlog(Long tagId, Pageable pageable);

  Page<Blog> listBlog(String query, Pageable pageable);

  Blog saveBlog(Blog blog);

  Blog updateBlog(Long id, Blog blog);

  void deleteBlog(Long id);

  List<Blog> listRecommendBlogTop(Integer size);

  Map<String, List<Blog>> archiveBlog();

  Long countBlog();
}


