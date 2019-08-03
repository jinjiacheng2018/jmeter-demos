package com.jmeter.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.jmeter.boot.enums.UserEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    /**
     * 模型查询用户接口
     * @return
     */
    @RequestMapping("/users")
    public JSONObject users() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Tom",UserEnum.TOM);
        jsonObject.put("Jack",UserEnum.JACK);
        jsonObject.put("Jason",UserEnum.JASON);
        return jsonObject;
    }



}
