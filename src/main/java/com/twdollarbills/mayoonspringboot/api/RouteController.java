package com.twdollarbills.mayoonspringboot.api;

import org.springframework.web.bind.annotation.RequestMapping;

public class RouteController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
