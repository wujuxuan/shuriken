package com.varmilo.shuriken.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.varmilo.shuriken.entity.EmailEntity;

import java.util.List;


/**
 * 
 *
 * @author wjx
 * @email 
 * @date 2021-08-25 16:49:02
 */
public interface EmailService extends IService<EmailEntity> {

    /**
     * 获取所有邮箱
     * @return
     */
    String[] listEmail();
}

