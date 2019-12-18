package com.xuyewei.blog.vo;

/**
 * ClassName:BlogQuery
 * Package:com.xuyewei.blog.vo
 * Description:
 *
 * @Date:2019/12/18 20:56
 * @Author:xuyewei
 */

public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
