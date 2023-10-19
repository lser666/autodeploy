package com.example.autodeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixudong
 * @date 2023/10/19 13:46
 */

@RestController
@RequestMapping("/test")
public class test {

    @GetMapping
    public String t() {
        return "hello";
    }

}
