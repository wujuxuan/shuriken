package com.varmilo.shuriken.service.impl;

import com.varmilo.shuriken.dao.EmailDao;
import com.varmilo.shuriken.entity.EmailEntity;
import com.varmilo.shuriken.service.EmailService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Service("emailService")
public class EmailServiceImpl extends ServiceImpl<EmailDao, EmailEntity> implements EmailService {

    @Override
    public String[] listEmail() {
        List<EmailEntity> list = list();
        String[] emails = new String[list.size()];
        for (int i = 0; i < emails.length; i++) {
            emails[i] = list.get(i).getEmail();
        }
        return emails;
    }
}