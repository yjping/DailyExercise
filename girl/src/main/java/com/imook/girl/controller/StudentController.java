package com.imook.girl.controller;

import com.imook.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuanjiaping
 * @create 2018-04-19 10:21
 * @description TODO
 **/
@Controller
@ResponseBody
public class StudentController {
    @Autowired
    private GirlProperties girlProperties;//注入配置还需要在实体类加Component注解

    @RequestMapping(value = "girlAge", method = RequestMethod.GET)
    public int getAge(){
        return girlProperties.getAge();
    }

}
