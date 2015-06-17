package com.self.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Administrator on 2015/6/17.
 */
@Controller("homeController")
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
