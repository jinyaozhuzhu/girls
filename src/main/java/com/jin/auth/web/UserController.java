package com.jin.auth.web;

import com.jin.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jinyao on 2017/6/5.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

}
