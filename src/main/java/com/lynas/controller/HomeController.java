package com.lynas.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lynas on 11/7/2016
 */
@Controller
public class HomeController {

    @Autowired
    private Logger logger;
    @RequestMapping("/")
    public String home(){
        logger.debug("debug message");
        logger.info("info message changed");
        return "home";
    }
}
