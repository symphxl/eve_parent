package com.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
public class IndexController {

   /* @GetMapping("/index")
    public String index(){
        return "xxxxxL";
    }*/

    @GetMapping(value = "/index",produces = "text/html;charset=UTF-8")
    public String index(){

        return "传智健康";
    }
}
