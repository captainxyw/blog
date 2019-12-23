package com.xuyewei.blog.web;

/**
 * ClassName:AboutShowController
 * Package:com.xuyewei.blog.web
 * Description:
 *
 * @Date:2019/12/23 21:37
 * @Author:xuyewei
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutShowController {

  @GetMapping("/about")
  public String about() {
    return "about";
  }
}
