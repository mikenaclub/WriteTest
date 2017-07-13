package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by STR02119 on 7/13/2017.
 */
@Controller
public class Test1 {

    @RequestMapping("/")
    public @ResponseBody String testfunction1() {
        return "testfunction1";
    }
}
