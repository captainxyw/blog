package com.xuyewei.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
////        int i = 9/0;
//        String blog = null;
//        if(blog == null) {
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("--------------index-------------");
        return "index";
    }
}
