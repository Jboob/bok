package com.bok.controller;

import com.bok.entity.user.UserInfo;
import com.bok.repository.HomeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "HomeController",description = "首页接口")
@RestController
@RequestMapping("home")
public class HomeController {


    @Autowired
    private HomeRepository homeRepository;
//
//    @ApiOperation(value="用户登录", notes="用户登录接口")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", required = true ,dataType = "string"),
//            @ApiImplicitParam(name = "passwd", value = "密码", required = true ,dataType = "string")
//    })
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    @PostMapping
    public String index(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("123");
        userInfo.setUserName("张三");
        userInfo.setUserPass("hyqwyqywyqwuuqwaasnajsnmanmsma");
        homeRepository.save(userInfo);
        return "Hello World !";
    }


}
