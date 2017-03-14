package com.jin.service;

import com.jin.entity.Girl;
import com.jin.enums.ResultEnum;
import com.jin.exception.GirlException;
import com.jin.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jinyao on 2017/3/14.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        String age = girl.getAge();
        Integer ageInt = Integer.parseInt(age);
        if (ageInt < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (ageInt > 10 && ageInt < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        } else {
            throw new GirlException(ResultEnum.SUCCESS);
        }
    }

    /**
     * 查询一个女生信息
     *
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
