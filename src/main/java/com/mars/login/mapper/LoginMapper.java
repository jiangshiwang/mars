package com.mars.login.mapper;

import com.mars.login.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    UserInfo login(Integer userId,String pwd);
}
