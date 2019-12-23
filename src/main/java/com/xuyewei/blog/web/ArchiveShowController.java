package com.xuyewei.blog.web;

import com.xuyewei.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:ArchiveShowController
 * Package:com.xuyewei.blog.web
 * Description:
 *
 * @Date:2019/12/23 20:55
 * @Author:xuyewei
 */
@Controller
public class ArchiveShowController {
  @Autowired
  private BlogService blogService;

  @GetMapping("/archives")
  public String archives(Model model) {
    model.addAttribute("archiveMap", blogService.archiveBlog());
    model.addAttribute("blogCount", blogService.countBlog());
    return "archives";
  }
}
