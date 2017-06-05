package com.jin.girl.dao;

import com.jin.girl.entity.Girl;

import java.util.List;

/**
 * Created by jinyao on 2017/6/5.
 */
public interface GirlDao {

    List<Girl> findAll();

    void save(Girl girl);

    Girl findById(Integer id);

    void update(Girl girl);

    void delete(Integer id);


}
