package com.gdyunst.changjia.shopping.common.enums;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/6/26
 **/
public enum  ResultEnum {
    SYS_ERROR(-1, "系统异常"),
    PARA_ERROR(-2, "请求参数不符合规范"),
    CONFIG_ERROR(-3, "系统配置信息错误"),
    LIMIT_ERROR(-4, "请求受限，相同的url和para需要2秒后请求"),
    LOGIC_ERROR(-11,"逻辑异常"),
    SUCCESS(0,"ok"),

    RESULT_TYPE_60(60, "超出预约时间"),
    RESULT_TYPE_70(70, "未到预约时间"),
    RESULT_TYPE_80(80, "在预约时间内"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
