package com.example.elasticsearch.service;


import com.example.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 *
 * @author qigang.qin@hand-china.com 2021/6/2 16:11
 */
public interface EsProductService {

    int importAll();




    /**
     * 根据关键字搜索名称或者副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}
