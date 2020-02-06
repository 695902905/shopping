package com.gdyunst.changjia.shopping.exception;




import com.gdyunst.changjia.shopping.common.enums.ResultEnum;
import lombok.Data;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/6/26
 **/
@Data
public class ShException extends RuntimeException {

    private Integer code=-1;

    public ShException() {
    }

    public ShException(String message) {
        super(message);
    }

    public ShException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public ShException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
