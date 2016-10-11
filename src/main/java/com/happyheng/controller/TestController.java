package com.happyheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuheng on 16/10/11.
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/test")
    public String testRequest() {
        return "test";
    }

}
