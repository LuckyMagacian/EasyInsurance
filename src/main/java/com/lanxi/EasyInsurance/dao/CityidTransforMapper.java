package com.lanxi.EasyInsurance.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by shenzhiqiang on 16-11-16.
 */
public interface CityidTransforMapper {

    public abstract String getICCityidByLXCityidIC(@Param("lxCityid") String lxCityid,
                                                   @Param("insuranceCompany") String insuranceCompany);

}
