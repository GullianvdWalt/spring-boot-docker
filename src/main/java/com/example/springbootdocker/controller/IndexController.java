package com.example.springbootdocker.controller;

/**
 * @author Gullian Van Der Walt
 * Created at 10:14 on Sep, 2021
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/index"})
public class IndexController {

    @GetMapping()
    public String getHome(){
        return "index";
    }
}
