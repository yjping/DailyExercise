package com.imook.girl.service;

import com.imook.girl.domain.Girl;
import com.imook.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author yuanjiaping
 * @create 2018-04-24 16:12
 * @description TODO
 **/
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("CCC");
        girlB.setAge(32);
        girlRepository.save(girlB);
    }
}
