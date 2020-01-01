package com.xikai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xikaixiong on 3/7/17.
 */

@Controller
public class BlogController {

    @RequestMapping(value="/api/blog" ,method= RequestMethod.GET)
    public ModelAndView helloWorld()  {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
}
