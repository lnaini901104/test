package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liunan-ds on 2017/1/23.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World!";
    }
}
