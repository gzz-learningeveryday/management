package com.gsy.management.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**==========================================================
* author    date            description
*============================================================
* gsy      2020年1月11日      create file
*===========================================================*/

@RestController
public class IndexController {
   
    @GetMapping("mock")
    public String index(@RequestParam Map<String,String> map) {
        return "Mock Data";
    }
}

