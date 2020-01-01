package com.xikai.application;

import org.springframework.boot.SpringApplication;

/**
 * Created by xikaixiong on 3/7/17.
 */
public class BlogApplication {

    public static void main(String[] args) {

//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Query query = session.createQuery("from Blog ");
//        List list = query.list();
//        System.out.println(list.size());
//        Blog blog = (Blog) list.get(0);
//        String body = blog.getBody();
//        System.out.println(body);
//        session.close();
//        BlogImpl blogImpl = new BlogImpl();
//        Blog blog = blogImpl.getBlogById(2);
//
//        System.out.println(blog.getId());
//        System.out.println(blog.getTitle());
//        System.out.println(blog.getBody());
        SpringApplication.run(BlogApplication.class, args);
    }
}
