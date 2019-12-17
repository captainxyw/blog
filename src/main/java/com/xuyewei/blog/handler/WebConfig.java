package com.xuyewei.blog.handler;

import com.xuyewei.blog.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ClassName:WebConfig
 * Package:com.xuyewei.blog.handler
 * Description:
 *
 * @Date:2019/12/17 20:05
 * @Author:xuyewei
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
        .excludePathPatterns("/admin")
        .excludePathPatterns("/admin/login");
    }
}
