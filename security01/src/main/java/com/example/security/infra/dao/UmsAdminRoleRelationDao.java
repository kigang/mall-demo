package com.example.security.infra.dao;

import com.example.mybatis.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author qigang.qin@hand-china.com 2021/6/1 19:45
 */
@Mapper
public interface UmsAdminRoleRelationDao {

    /**
     * <p> <p>
       * @param adminId
     * @return java.util.List<com.example.mybatis.mbg.model.UmsPermission>
     * @author qigang.qin@hand-china.com
     * @date 2021/6/1 19:46
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
