package com.lanxi.EasyInsurance.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shenzhiqiang on 16-11-16.
 */

@Controller
@RequestMapping("/sunshine")
public class SunshineController {

    private static Logger log = Logger.getLogger(SunshineController.class);


    @RequestMapping(value = "/initInfo", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public String initInfo(HttpServletRequest request) {



        return "";

    }

}
