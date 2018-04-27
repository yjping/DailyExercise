package com.imook.girl.service;

import com.imook.girl.domain.Girl;
import com.imook.girl.enums.ResultEnum;
import com.imook.girl.exception.GirlException;
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

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();
        if(age < 10){
            // 返回”可能在上小学“
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age < 16){
            // 返回"可能在上初中"
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 通过Id查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findById(id).get();
    }
}
