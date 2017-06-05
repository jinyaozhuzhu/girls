package com.jin.girl.repository;

import com.jin.girl.entity.Girl;

import java.util.List;

/**
 * Created by jinyao on 2017/1/12.
 */
public interface GirlRepository
//        extends JpaRepository<Girl, Integer>
{

    //按照年龄来查询
    List<Girl> findByAge(Integer age);
}
