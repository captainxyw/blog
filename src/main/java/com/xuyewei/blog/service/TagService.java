package com.xuyewei.blog.service;

import com.xuyewei.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * ClassName:TagService
 * Package:com.xuyewei.blog.service
 * Description:
 *
 * @Date:2019/12/18 17:26
 * @Author:xuyewei
 */

public interface TagService {

    Tag saveTag(Tag tag);

    Page<Tag> listTag(Pageable pageable);

    Tag getTagByName(String name);

    Tag getTag(Long id);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);
}
