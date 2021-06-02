package com.example.elasticsearch.repository;


import com.example.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author qigang.qin@hand-china.com 2021/6/2 16:07
 */
public interface  EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    /**
     * <p> <p>
       * @param name
     * @param subTitle
     * @param keywords
     * @param page
     * @return org.springframework.data.domain.Page<com.example.elasticsearch.document.EsProduct>
     * @author qigang.qin@hand-china.com
     * @date 2021/6/2 16:10
     */
    Page<EsProduct> selectPage(String name, String subTitle, String keywords, Pageable page);
}
