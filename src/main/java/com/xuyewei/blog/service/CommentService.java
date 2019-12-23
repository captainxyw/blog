package com.xuyewei.blog.service;

import com.xuyewei.blog.po.Comment;

import java.util.List;

/**
 * ClassName:CommentService
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/23 15:27
 * @Author:xuyewei
 */

public interface CommentService {
  List<Comment>  listCommentByBlogId(Long blogId);

  Comment saveComment(Comment comment);
}
