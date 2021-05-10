package com.mars.login.controller;

import com.mars.login.model.UserInfo;
import com.mars.login.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginCheck")
    @ResponseBody
    public String loginCheck(HttpServletRequest request){

        logger.info("jinlaile");
        int userId=1002;
        System.out.println("ss");
        String pwd="123456";
        Long startTime=System.currentTimeMillis();
        UserInfo userInfo =loginService.login(userId, pwd);
        Long endTime=System.currentTimeMillis();

        String result=null;
        if (userInfo != null){
            result="1";
            logger.info("调用成功，用时："+(endTime-startTime)+"毫秒");
            logger.info("登录用户："+userInfo.getUserName());
        }else{
            logger.info("请注册后登录："+userInfo.getUserId());
        }
        return result;
    }
}
