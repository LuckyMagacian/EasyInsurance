package com.lanxi.EasyInsurance.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by shenzhiqiang on 16-11-16.
 */
public interface CityidTransforMapper {

    /**
     * 根据蓝喜cityid 保险公司id 转换 保险公司cityid
     * @param lxCityid 根据蓝喜cityid
     * @param insuranceCompany 保险公司id
     * @return
     */
    public abstract String getICCityidByLXCityidIC(@Param("lxCityid") String lxCityid,
                                                   @Param("insuranceCompany") String insuranceCompany);

}
