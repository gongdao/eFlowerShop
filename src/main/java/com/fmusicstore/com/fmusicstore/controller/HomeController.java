package com.fmusicstore.com.fmusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaobin on 3/26/2016.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
