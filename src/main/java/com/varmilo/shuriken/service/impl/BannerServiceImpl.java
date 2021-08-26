package com.varmilo.shuriken.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.varmilo.shuriken.dao.BannerDao;
import com.varmilo.shuriken.entity.Banner;
import com.varmilo.shuriken.service.BannerService;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerDao, Banner> implements BannerService {
}
