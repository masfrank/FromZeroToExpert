package com.spk.fromzerotoexpert.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: clh.
 * @Description:
 * @Date Created in 2022-11-21 15:57
 **/
@RestController
public class HelloController {

    @Value("${custom.hello:Hello}")
    private String fze;

    @PostMapping("/FromZerotoExpert")
    public String Hello(){
        return ("嗨，欢迎您来到"+fze);
    }
}
