package com.yuluofancheng.skywalking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluofancheng
 * @date 2021-12-25 15:50
 */
@RestController
public class DemoController {


    @GetMapping("/")
    public Object index(){
        return "index";
    }

    @GetMapping("/test")
    public Object test1(){
        return "test1";
    }

    @GetMapping("/test2")
    public Object test2(){
        return "test2";
    }



}
