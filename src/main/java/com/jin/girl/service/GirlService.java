package com.jin.girl.service;

import com.jin.girl.dao.GirlDao;
import com.jin.girl.entity.Girl;
import com.jin.girl.enums.ResultEnum;
import com.jin.girl.exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyao on 2017/3/14.
 */
@Service
public class GirlService {

    @Autowired
    private GirlDao girlDao;

    public List<Girl> findAll() {
        return girlDao.findAll();
    }

    public void save(Girl girl) {
        girlDao.save(girl);
    }

    public Girl findById(Integer id) {
        return girlDao.findById(id);
    }

    public void update(Girl girl) {
        girlDao.update(girl);
    }

    public void delete(Integer id) {
        girlDao.delete(id);
    }



    public void getAge(Integer id) throws Exception {
        Girl girl = girlDao.findById(id);
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
     * @returno
     */
    public Girl findOne(Integer id) {
        return girlDao.findById(id);
    }
}
