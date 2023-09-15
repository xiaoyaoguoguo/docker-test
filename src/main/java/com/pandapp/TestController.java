package com.pandapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Deacription TODO
 * @Author Jamie
 * @Date 2023/9/5 16:04
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        return "test";
    }
}
