package com.example.elasticsearch.service.impl;

import com.example.elasticsearch.document.EsProduct;
import com.example.elasticsearch.repository.EsProductRepository;
import com.example.elasticsearch.service.EsProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *
 * @author qigang.qin@hand-china.com 2021/6/2 16:12
 */
@Service
public class EsProductServiceImpl implements EsProductService {

    private static final Logger logger = LoggerFactory.getLogger(EsProductServiceImpl.class);
    //@Autowired
    //private EsProductDao productDao;
    @Autowired
    private EsProductRepository productRepository;

    @Override
    public int importAll() {
        return 0;
    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }
}
