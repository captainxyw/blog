package com.xuyewei.blog.service;

import com.xuyewei.blog.dao.CommentRepository;
import com.xuyewei.blog.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * ClassName:CommentServiceImpl
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/23 15:28
 * @Author:xuyewei
 */
@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  private CommentRepository commentRepository;

  @Override
  public List<Comment> listCommentByBlogId(Long blogId) {
    Sort sort = new Sort(Sort.Direction.DESC, "createTime");
    return commentRepository.findByBlogId(blogId, sort);
  }

  @Transactional
  @Override
  public Comment saveComment(Comment comment) {
    Long parentCommentId = comment.getParentComment().getId();
    if(parentCommentId != -1) {
      comment.setParentComment(commentRepository.findOne(parentCommentId));
    } else {
      comment.setParentComment(null);
    }
    comment.setCreateTime(new Date());
    return commentRepository.save(comment);
  }
}
