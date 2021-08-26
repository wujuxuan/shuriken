package com.varmilo.shuriken.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.varmilo.shuriken.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;


@Mapper
public interface UserDao extends BaseMapper<User> {
}
