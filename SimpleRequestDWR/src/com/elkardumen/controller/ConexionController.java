package com.elkardumen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConexionController {
    
    @RequestMapping("/pageInit")
    public String pageStart() {
		return "paginaInicial";
    }
}
