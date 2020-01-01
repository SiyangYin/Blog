package com.xikai.resource;

import com.xikai.model.Blog;
import com.xikai.service.BlogService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by xikaixiong on 3/7/17.
 */

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestMapping(value="blogs")
public class BlogResource {
    BlogService blogService = new BlogService();


    @RequestMapping(method = RequestMethod.GET)
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }


    @RequestMapping(value="/{blogId}",method = RequestMethod.GET)
    public Blog getBlogById(@PathVariable("blogId") int id) {
        return blogService.getBlogById(id);
    }
}
