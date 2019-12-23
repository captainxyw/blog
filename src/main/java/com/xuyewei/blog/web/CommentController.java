package com.xuyewei.blog.web;

import com.xuyewei.blog.po.Comment;
import com.xuyewei.blog.service.BlogService;
import com.xuyewei.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName:CommentController
 * Package:com.xuyewei.blog.web
 * Description:
 *
 * @Date:2019/12/23 15:20
 * @Author:xuyewei
 */
@Controller
public class CommentController {

  @Autowired
  private CommentService commentService;
  @Autowired
  private BlogService blogService;
  @Value("${comment.avatar}")
  private String avatar;

  @GetMapping("comments/{blogId}")
  public String comments(@PathVariable Long blogId, Model model) {
    model.addAttribute("comments", commentService.listCommentByBlogId(blogId));
    return "blog :: commentList";
  }

  @PostMapping("/comments")
  public String post(Comment comment) {
    Long blogId = comment.getBlog().getId();
    comment.setBlog(blogService.getBlog(blogId));
    comment.setAvatar(avatar);
    commentService.saveComment(comment);
    return "redirect:/comments/" + comment.getBlog().getId();
  }
}
