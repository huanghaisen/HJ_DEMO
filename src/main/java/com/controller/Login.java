package com.controller;

import com.model.User;
import com.service.ServiceTest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/3/20.
 */
@Controller
@RequestMapping("/login")
public class Login {
    Logger log=Logger.getLogger(Login.class);
    @Autowired
    private ServiceTest serviceTest;


    @RequestMapping(value="login",method={ RequestMethod.POST,RequestMethod.GET})
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("fgdsjhfgkdsafgjskgfdshkfgdskfgdskafgdskhfgdsafkhajkds");
        System.out.println("啦啦啦");
//        Map<String,User> msg=new HashMap<>();
//        User user=new User();
////        user.setId(1);
////        user.setName("hisen");
////        serviceTest.query();
//        msg.put("user",user);
        serviceTest.query();
        return new ModelAndView("login/login","user",serviceTest.query());
    }
}
