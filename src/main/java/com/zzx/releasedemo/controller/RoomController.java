package com.zzx.releasedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: RoomController
 * date: 2022/3/1 14:57:59
 * author: zzx
 */
@Controller
@RequestMapping("/Room")
public class RoomController {


    @GetMapping("/hello")
    public String test(){
        return "helloWorld";
    }
}
