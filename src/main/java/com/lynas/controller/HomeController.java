package com.lynas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;


/**
 * Created by lynas on 11/7/2016
 */
@Controller
public class HomeController {

    @Autowired
    Logger logger;

    @RequestMapping("/")
    public String home(){
        logger.warning("warning" );
        return "home";
    }
}
