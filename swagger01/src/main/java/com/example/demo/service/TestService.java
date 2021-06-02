package com.example.demo.service;

import com.example.demo.mbg.model.Test;

import java.util.List;

/**
 *
 * @author qigang.qin@hand-china.com 2021/5/25 15:44
 */
public interface TestService {


    List<Test> selectList(Test test);
}
