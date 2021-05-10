package com.mars.login.service;

import com.mars.login.mapper.LoginMapper;
import com.mars.login.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;

    public UserInfo login(Integer userId, String pwd) {
        UserInfo userInfo=loginMapper.login(userId,pwd);
        return userInfo;
    }
}
