package com.imook.girl.controller;

import com.imook.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yuanjiaping
 * @create 2018-04-17 16:39
 * @description
 **/
@Controller
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;//注入配置还需要在实体类加Component注解

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test11(){
        return "index";
    }
}
