package com.example.demo.service.impl;

import com.example.demo.mbg.mapper.TestMapper;
import com.example.demo.mbg.model.Test;
import com.example.demo.mbg.model.TestExample;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author qigang.qin@hand-china.com 2021/5/25 15:43
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper mapper;

    @Override
    public List<Test> selectList(Test test) {
        TestExample example = new TestExample();
        return mapper.selectByExample(example);
    }
}
