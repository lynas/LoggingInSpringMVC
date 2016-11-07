package com.lynas.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lynas on 11/7/2016
 */
@Controller
public class AnotherController {

    @Autowired
    private Logger logger;


    @RequestMapping("/aaa")
    public String home() {
        logger.info("info from another controller");
        return "home";
    }
}
