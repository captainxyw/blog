package com.xuyewei.blog.web;

import com.xuyewei.blog.NotFoundException;
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
    public String inddex() {
//        int i = 9/0;
        String blog = null;
        if(blog == null) {
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
