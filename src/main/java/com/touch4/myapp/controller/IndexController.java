package com.touch4.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value= {"/","/index","/index.html"})
	public String index() {
        return "index/index";
    }
	
	/*@RequestMapping("music")
	public String music() {
        return "music/index";
    }*/
}
