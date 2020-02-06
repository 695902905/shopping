package com.gdyunst.changjia.shopping.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/6/26
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel()
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3068837394742385883L;

  /*  *//** 错误码. *//*
    @ApiModelProperty(example="0")
    private Integer code;

    *//** 提示信息. *//*
    @ApiModelProperty(example="成功")
    private String msg;

    *//** 具体内容. *//*
    private T data;*/


    @ApiModelProperty(example="true")
    private Boolean success=true;

    @ApiModelProperty(example="0")
    private Integer errorCode;

    @ApiModelProperty(example="ok")
    private String  msg;

    private T data;

}
