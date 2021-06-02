package com.example.security.infra.common.constant;


/**
 * 状态码枚举
 *
 * @author qigang.qin@hand-china.com 2021/6/1 19:15
 */
public enum ResultCode {

    /**
     * code 代码,mean 含义
     */

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    /**
     * <p> <p>
     *
     * @param code
     * @param message
     * @return
     * @author qigang.qin@hand-china.com
     * @date 2021/6/1 19:16
     */
    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
