package com.example.demo.controller;

import com.example.demo.mbg.model.Test;
import com.example.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * @author qigang.qin@hand-china.com 2021/5/25 15:44
 */
@Api(tags = "TestController")
@Controller
@RequestMapping("/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService service;

    @ApiOperation("获取数据列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public List<Test> getBrandList(@ApiParam("查询参数") Test test) {
        return service.selectList(test);
    }
}
