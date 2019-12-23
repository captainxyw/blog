package com.xuyewei.blog.dao;

import com.xuyewei.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName:CommentRepository
 * Package:com.xuyewei.blog.dao
 * Description:
 *
 * @Date:2019/12/23 15:33
 * @Author:xuyewei
 */

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

}
