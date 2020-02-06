package com.gdyunst.changjia.shopping.common;


import com.gdyunst.changjia.shopping.common.enums.ResultEnum;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/6/26
 **/
public class ResultUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setSuccess(true);
        resultVO.setErrorCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMessage());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setErrorCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
