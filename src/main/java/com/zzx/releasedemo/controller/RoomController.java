package com.zzx.releasedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description: RoomController
 * date: 2022/3/1 14:57:59
 * author: zzx
 */
@Controller
@RequestMapping("/Room")
public class RoomController {


    @ResponseBody
    @GetMapping("/hello")
    public String test(){
        String result = "helloWorld";
        return result;
    }
}
