package com.hongbao.controller;

import com.alibaba.fastjson.JSONObject;
import com.hongbao.entity.RedenvelopesUser;
import com.hongbao.service.RedenvelopesUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (RedenvelopesUser)表控制层
 *
 * @author makejava
 * @since 2020-12-23 09:32:22
 */
@RestController
@RequestMapping("User")
public class RedenvelopesUserController {
    /**
     * 服务对象
     */
    @Resource
    private RedenvelopesUserService redenvelopesUserService;

    @Autowired
    HttpServletRequest request;


    @RequestMapping("login")
    @ResponseBody
    public String login(String name,String pwd,HttpServletResponse response){
        RedenvelopesUser login = redenvelopesUserService.login(name, pwd);
        if(login != null){
            Cookie cookie = new Cookie("user", "" + login.getUserid());
            cookie.setPath("/");

            response.addCookie(cookie);
            return "{\"state\":true}";
        }
        return "{\"state\":false}";
    }


}