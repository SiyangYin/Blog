package com.xikai.service;

import com.xikai.dao.BlogDao;
import com.xikai.daoImpl.BlogImpl;
import com.xikai.model.Blog;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by xikaixiong on 3/7/17.
 */
@WebService
public class BlogService {
    BlogDao blogDao = new BlogImpl();
    Blog blog = new Blog();


    public List<Blog> getAllBlogs(){
        return blogDao.getAllBlog();
    }

    public Blog getBlogById(int id){
        blog = blogDao.getBlogById(id);
        return blog;
    }
}
