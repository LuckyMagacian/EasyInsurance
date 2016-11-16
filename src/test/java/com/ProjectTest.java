package com;

import static org.junit.Assert.*;

import com.lanxi.EasyInsurance.dao.CityidTransforMapper;
import com.lanxi.EasyInsurance.utils.DateTimeUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shenzhiqiang on 16-9-23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProjectTest {


    @Autowired
    CityidTransforMapper cityidTransforMapper;

    @Test
    public void test1() {

        System.out.println(cityidTransforMapper.getICCityidByLXCityidIC("3301", "00"));

    }


}
