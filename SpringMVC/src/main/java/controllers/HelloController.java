package main.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TMS on 06.06.2017.
 */
@Controller
@RequestMapping("/in")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "WEB-INF/poops/hello.jsp";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "WEB-INF/poops/hello2.jsp";
    }
}
