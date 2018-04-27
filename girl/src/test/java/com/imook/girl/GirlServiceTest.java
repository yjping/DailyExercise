package com.imook.girl;

import com.imook.girl.domain.Girl;
import com.imook.girl.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yuanjiaping
 * @create 2018-04-27 15:00
 * @description TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;//注入girlservice

    @Test
    public void findOneTest(){
        Girl girl = girlService.findOne(20);
        Assert.assertEquals(new Integer(22), girl.getAge());
    }
}
