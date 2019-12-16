package com.xuyewei.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:IndexController
 * Package:com.xuyewei.blog.web
 * Description:
 *
 * @Date:2019/12/15 19:07
 * @Author:xuyewei
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
