package fr.franck.givemeacartest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView hello = new ModelAndView();
        hello.setViewName("index");
        return hello;
    }

    @GetMapping("/stock")
    public ModelAndView stock() {
        ModelAndView yo = new ModelAndView();
        yo.setViewName("stock");
        return yo;
    }
}

