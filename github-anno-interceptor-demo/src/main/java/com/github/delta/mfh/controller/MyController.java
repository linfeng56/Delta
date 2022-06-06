package com.github.delta.mfh.controller;

import com.github.delta.mfh.beans.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 * @author sea
 */
@Controller
@RequestMapping("test")
public class MyController {

    @Autowired
    private MyBean myBean;

    @RequestMapping("success")
    @ResponseBody
    public String test(){
        return myBean.something();
    }
}
