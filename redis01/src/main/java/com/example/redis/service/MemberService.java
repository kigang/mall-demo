package com.example.redis.service;


/**
 *
 * @author qigang.qin@hand-china.com 2021/6/1 10:22
 */
public interface MemberService {


    /**
     * <p> <p>
       * @param telephone
     * @return java.lang.String
     * @author qigang.qin@hand-china.com
     * @date 2021/6/1 10:23
     */
    String getAuthCode(String telephone);

    /**
     * <p> <p>
       * @param telephone
     * @param authCode
     * @return java.lang.Boolean
     * @author qigang.qin@hand-china.com
     * @date 2021/6/1 10:23
     */
    Boolean verifyAuthCode(String telephone, String authCode);
}
