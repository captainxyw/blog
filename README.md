

# Spring Boot开发小而美的个人博客
[课程地址](https://edu.51cto.com/course/11433.html)

## 项目介绍
使用Spring Boot框架开发的一个个人博客

## 功能模块

### 1. 分类管理
博客中的博文有具体类型，该模块负责对分类进行管理
### 2. 标签管理
博客中的博文可以有多个标签，标签管理模块负责夫案例标签
### 3. 博客管理
主要模块，博客编辑采用markdown编辑器
### 4. 评论管理
对博文进行评论
### 5. 博客归档
可以将博客中的博客依据时间进行归档

## 技术架构

### 后端：
* Spring Boot
* JPA
### 前端：
* thymeleaf
* Semantic UI
### 工具与环境
*  IDEA
*  Maven 3
*  JDK 8

## 系统效果图
* 博文页面，分页展示所有博文。并且在右侧分类和标签栏点击不同分类和标签可以看到对应博文。
![alt 博文页面](https://raw.githubusercontent.com/captainxyw/blog/master/img/article.png "博文页面")
* 分类页面，可以根据分类展示对应的博文，标签页面与之类似。
![alt 分类页面](https://raw.githubusercontent.com/captainxyw/blog/master/img/category.png "分类页面")
* 个人信息页面，展示博客主人信息，有GitHub、微信等信息。
![alt 个人信息页面](https://raw.githubusercontent.com/captainxyw/blog/master/img/intro.png "个人信息页面")
* 归档页面，根据时间对所有博文进行归档。
![alt 归档页面](https://raw.githubusercontent.com/captainxyw/blog/master/img/archive.png "归档页面")
* 后台管理页面，可以对博客、分类、标签等信息进行统一管理。
![alt 后台管理页面](https://raw.githubusercontent.com/captainxyw/blog/master/img/manage.png "后台管理页面")


## 插件集成

* [编辑器 Markdown](https://pandao.github.io/editor.md/)

* [内容排版 typo.css](https://github.com/sofish/typo.css)

* [动画 animate.css](https://daneden.github.io/animate.css/)

* [代码高亮 prism](https://github.com/PrismJS/prism)

* [目录生成 Tocbot](https://tscanlin.github.io/tocbot/)

* [滚动侦测 waypoints](http://imakewebthings.com/waypoints/)

* [平滑滚动 jquery.scrollTo](https://github.com/flesler/jquery.scrollTo)

* [二维码生成 qrcode.js](https://davidshimjs.github.io/qrcodejs/)

