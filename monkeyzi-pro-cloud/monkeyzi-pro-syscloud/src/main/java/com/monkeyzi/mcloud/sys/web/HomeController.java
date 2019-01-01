package com.monkeyzi.mcloud.sys.web;

import com.monkeyzi.mcloud.common.core.utils.R;
import com.monkeyzi.mcloud.common.log.annotation.LogAnnotation;
import com.monkeyzi.mcloud.sys.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: 高yg
 * @date: 2018/12/31 18:46
 * @qq:854152531@qq.com
 * @blog http://www.monkeyzi.xin
 * @description:
 */
@RestController
@RequestMapping(value = "/api")
@Api(value = "monkeyzi-homeController",description = "首页", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {

    @LogAnnotation
    @PostMapping(value = "/home")
    @ApiOperation(value = "测试")
    public String home(@Valid @RequestBody User user){

            System.out.println("进来了");
            System.out.println(1/0);


        return "hhh";
    }

    @LogAnnotation
    @PostMapping(value = "/home1")
    @ApiOperation(value = "测试1")
    public String home1(User user){

        System.out.println("进来了");


        return "h1";
    }

    @LogAnnotation
    @PostMapping(value = "/home2")
    @ApiOperation(value = "测试1")
    public String home2(String name){

        System.out.println("进来了");


        return "h2";
    }

    @LogAnnotation
    @PostMapping(value = "/home3/{name}")
    @ApiOperation(value = "测试1")
    public R home3(@PathVariable String name){

        System.out.println("进来了");


        return R.ok("参数在吗",null);
    }
}