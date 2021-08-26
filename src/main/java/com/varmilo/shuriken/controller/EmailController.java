package com.varmilo.shuriken.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.varmilo.shuriken.entity.EmailEntity;
import com.varmilo.shuriken.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varmilo.shuriken.util.R;

import javax.validation.Valid;


/**
 * 
 *
 * @author wjx
 * @email 
 * @date 2021-08-25 16:49:02
 */
@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @Autowired
    JavaMailSender javaMailSender;
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page params , EmailEntity entity){
        Page page = emailService.page(params, Wrappers.query(entity));

        return R.success("查询成功",page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		EmailEntity email = emailService.getById(id);

        return R.success("查询成功",email);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody @Valid EmailEntity email){
        EmailEntity emailData = emailService.getOne(new QueryWrapper<EmailEntity>().eq("email", email.getEmail()));
        if (emailData !=null){
            return R.field(R.MailboxAlreadyExists,"邮箱不能唯一的");
        }
        emailService.save(email);
        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EmailEntity email){
		emailService.updateById(email);
        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		emailService.removeByIds(Arrays.asList(ids));

        return R.success("删除成功");
    }

    /**
     * 发送邮件
     */
    @RequestMapping("/sendEmail")
    public R sendEmail(){

        String[] emails = emailService.listEmail();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("这是一封测试邮件");
        message.setFrom("varmiloofficial@zhihaihe.cn");
        message.setTo(emails);
        message.setSentDate(new Date());
        message.setText("这是测试邮件的正文");
        javaMailSender.send(message);
        return R.success("发送成功");
    }
}
