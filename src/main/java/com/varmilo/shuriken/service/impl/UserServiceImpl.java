package com.varmilo.shuriken.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.varmilo.shuriken.dao.UserDao;
import com.varmilo.shuriken.entity.User;
import com.varmilo.shuriken.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService  {
}
