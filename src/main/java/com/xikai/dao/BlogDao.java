package com.xikai.dao;

import com.xikai.model.Blog;

import java.util.List;

/**
 * Created by xikaixiong on 3/7/17.
 */
public interface BlogDao {
    public List getAllBlog();

    public Blog getBlogById(int i);

}
