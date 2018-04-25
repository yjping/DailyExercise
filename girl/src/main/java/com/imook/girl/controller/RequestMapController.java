package com.imook.girl.controller;

import com.imook.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuanjiaping
 * @create 2018-04-23 10:32
 * @description TODO
 **/
@RestController
public class RequestMapController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hi","nihao"},method = RequestMethod.GET)
    public String test2(){
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = "/{id}/sayId", method = RequestMethod.GET)
    public String sayId(@PathVariable("id") Integer id){
        return "id: " +id;
    }

    @RequestMapping(value = "/sayAge", method = RequestMethod.GET)
    public String sayAge(@RequestParam("age") Integer myAge){
        return "age: " + myAge;
    }

    @RequestMapping(value = "/sayAge11", method = RequestMethod.GET)
    public String sayAge11(@RequestParam(value = "age", required = false, defaultValue = "1") Integer myAge){
        return "age: " + myAge;
    }

//    @RequestMapping(value = "/sayAge22", method = RequestMethod.GET)
    @GetMapping(value = "/sayAge22")
    public String sayAge22(@RequestParam(value = "age", required = false, defaultValue = "1") Integer myAge){
        return "age: " + myAge;
    }
}
