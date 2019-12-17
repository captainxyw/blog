package com.xuyewei.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:BlogController
 * Package:com.xuyewei.blog.web.admin
 * Description:
 *
 * @Date:2019/12/17 19:51
 * @Author:xuyewei
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("blogs")
    public String list() {
        return "admin/blogs";
    }
}
