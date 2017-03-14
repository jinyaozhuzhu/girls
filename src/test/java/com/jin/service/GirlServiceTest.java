package com.jin.service;

import com.jin.entity.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jinyao on 2017/3/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(GirlServiceTest.class);
    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() throws Exception {
        Girl girl = girlService.findOne(3);
        LOGGER.error("girl={}", girl);
        Assert.assertEquals(new Integer(10), new Integer(girl.getAge()));

    }

}