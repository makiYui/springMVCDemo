package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hp on 2018/4/9.
 */
@Controller
@RequestMapping(value = "/index")
public class WelcomeController {

    @RequestMapping(value = "/toWelcome")
    public ModelAndView toWelcome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello, Welcome to SpringMVC!");
        mv.setViewName("welcome");
        return mv;
    }
}
