package com.xikai.daoImpl;

import com.xikai.dao.BlogDao;
import com.xikai.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by xikaixiong on 3/7/17.
 */

public class BlogImpl implements BlogDao {

    private List<Blog> list = null;
    private static SessionFactory sessionFactory = null;
    private Blog blog = null;
    private static Session session;
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
    }

    @Override
    public List<Blog> getAllBlog() {
        Query query = session.createQuery("from Blog ");
        list = query.list();
        return list;
    }

    @Override
    public Blog getBlogById(int id) {
        list = getAllBlog();
        blog = list.get(id);
        return blog;
    }


    public List<Blog> getList() {
        return list;
    }

    public void setList(List<Blog> list) {
        this.list = list;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

}
