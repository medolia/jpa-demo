package com.que.demo.aop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.que.demo.aop.annotation.PermissionAnnotation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2020/10/16 11:38
 * @description
 * @modify
 */

@RestController
@RequestMapping(value = "/permission")
public class TestController {

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    @PermissionAnnotation()
    public JSONObject getGroupList(@RequestBody JSONObject request) {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }
}
