package com.varmilo.shuriken.controller;

import com.varmilo.shuriken.entity.Banner;
import com.varmilo.shuriken.service.BannerService;
import com.varmilo.shuriken.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * 修改轮播图图片
     * @param banner
     * @return
     */
    @PostMapping("update")
    public R update(@Valid Banner banner, HttpSession session){
        R result = getR(session);
        if (result != null) return result;

        if (banner.getId() != null){
            return R.field("id不能为空");
        }

        boolean b = bannerService.updateById(banner);

        return b?R.success("修改成功"):R.field("修改失败，id无效");
    }

    private R getR(HttpSession session) {
        Object user = session.getAttribute("user");
        if (user ==null){
            return R.field("您没有权限");
        }
        return null;
    }


    /**
     * 添加轮播图图片
     * @param banner
     * @return
     */
    @PostMapping("save")
    public R save(@Valid Banner banner,HttpSession session){
        R result = getR(session);
        if (result != null) return result;
        bannerService.save(banner);
        return R.success("添加成功");
    }

    /**
     * 删除轮播图
     * @param banner
     * @return
     */
    @PostMapping("delete")
    public R delete(Banner banner,HttpSession session){
        R result = getR(session);
        if (result != null) return result;
        if (banner.getId() != null){
            return R.field("id不能为空");
        }

        boolean b = bannerService.removeById(banner.getId());
        return b?R.success("删除成功"):R.field("删除失败，id无效");

    }

    /**
     * 获取轮播图
     * @param
     * @return
     */
    @GetMapping("list")
    public R list(){
        List<Banner> list = bannerService.list();
        return R.success("查询成功",list);
    }
}
