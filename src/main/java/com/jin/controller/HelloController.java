package com.jin.controller;

import com.jin.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinyao on 2017/1/11.
 */
@RestController
@RequestMapping("/hi")
//@RestController = @Controller + @ResponseBody 需要模板
public class HelloController {

/*    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;


    //@RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    //@RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping("/hello")
    public String sayHello(@PathVariable("id") Integer id) {
        // return "hello World!"+"<h1>"+cupSize+"<h1>"+age;
        return id.toString();
    }
}
