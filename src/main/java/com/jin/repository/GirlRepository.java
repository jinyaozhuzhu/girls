package com.jin.repository;

import com.jin.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jinyao on 2017/1/12.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //按照年龄来查询
    List<Girl> findByAge(Integer age);
}
