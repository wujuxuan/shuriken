package com.varmilo.shuriken.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.varmilo.shuriken.entity.User;
import com.varmilo.shuriken.service.UserService;
import com.varmilo.shuriken.util.MD5Util;
import com.varmilo.shuriken.util.R;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.activation.DataSource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Objects;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 后台用户注册
     * @return
     */
    @ResponseBody
    @PostMapping("UserRegister")
    public R UserRegister(User user){

        User userData = userService.getOne(new QueryWrapper<User>().eq("username",user.getUsername()));
        if (userData != null){
            return R.field("用户名已被使用");
        }
        user.setLevel(2);
        String password = user.getPassword();
        String md5 =  MD5Util.md5(password);
        user.setPassword(md5);
        userService.save(user);
        return R.success("注册成功");
    }

    /**
     * 后台用户登录校验
     * @return
     */
    @RequestMapping("UserLogin")
    public String UserLogin(@Valid User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User userData = userService.getOne(new QueryWrapper<User>().eq("username",user.getUsername()));

        String md5 = MD5Util.md5(user.getPassword());

        if (!Objects.equals(md5,userData.getPassword())){
            request.getRequestDispatcher("/index.html").forward(request,response);
        }
        if (userData.getLevel() == 1){
            request.getRequestDispatcher("/index.html").forward(request,response);
        }
        return "index";
    }
}
