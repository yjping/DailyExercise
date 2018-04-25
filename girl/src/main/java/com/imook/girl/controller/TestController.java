package com.imook.girl.controller;

import com.imook.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanjiaping
 * @create 2018-04-23 11:03
 * @description TODO
 **/
@RestController
@RequestMapping("/testEat")
public class TestController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/eat", method = RequestMethod.POST)
    public String eat(){
        return girlProperties.getCupSize();
    }
}
