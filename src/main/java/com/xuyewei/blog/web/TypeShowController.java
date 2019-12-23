package com.xuyewei.blog.web;

import com.xuyewei.blog.po.Type;
import com.xuyewei.blog.service.BlogService;
import com.xuyewei.blog.service.TypeService;
import com.xuyewei.blog.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName:TypeShowController
 * Package:com.xuyewei.blog.web
 * Description:
 *
 * @Date:2019/12/23 19:34
 * @Author:xuyewei
 */
@Controller
public class TypeShowController {
  @Autowired
  private TypeService typeService;
  @Autowired
  private BlogService blogService;

  @GetMapping("/types/{id}")
  public String types(@PageableDefault(size = 2, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                      @PathVariable Long id, Model model) {
    List<Type> types = typeService.listTypeTop(10000);
    if (id == -1) {
      id = types.get(0).getId();
    }
    model.addAttribute("types", types);
    BlogQuery blogQuery = new BlogQuery();
    blogQuery.setTypeId(id);
    model.addAttribute("page", blogService.listBlog(pageable, blogQuery));
    model.addAttribute("activeTypeId", id);
    return "types";
  }
}
