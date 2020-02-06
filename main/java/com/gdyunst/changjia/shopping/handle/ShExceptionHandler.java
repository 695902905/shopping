package com.gdyunst.changjia.shopping.handle;



import com.gdyunst.changjia.shopping.common.ResultUtil;
import com.gdyunst.changjia.shopping.common.enums.ResultEnum;
import com.gdyunst.changjia.shopping.exception.ShException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/6/28
 **/
@ControllerAdvice
@Slf4j
public class ShExceptionHandler {

    /**自定义异常*/
    @ExceptionHandler(value = ShException.class)
    public ModelAndView handlerErpException(HttpServletRequest request, HttpServletResponse response, ShException e) {
        log.error("【系统异常】请求地址：{}",request.getRequestURL(), e);
        //return ResultUtil.error(e.getCode(), e.getMessage());
        return JsonView.Render(ResultUtil.error(e.getCode(), e.getMessage()), response);
    }

   /* //参数校验异常
    @ExceptionHandler(BindException.class)
    public ResultVO handleBindException(HttpServletRequest request, HttpServletResponse response, BindException e) {
        log.error("【系统异常】请求地址：{}",request.getRequestURL(), e);
        List<FieldError> fieldErrors = e.getFieldErrors();
        String defaultMessage = fieldErrors.get(0).getDefaultMessage();
        return ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), defaultMessage);
    }

    //参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO handleMethodArgumentNotValidException(HttpServletRequest request, HttpServletResponse response, BindException e) {
        log.error("【系统异常】请求地址：{}",request.getRequestURL(), e);
        List<FieldError> fieldErrors = e.getFieldErrors();
        String defaultMessage = fieldErrors.get(0).getDefaultMessage();
        return ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), defaultMessage);
    }


    @ExceptionHandler(IllegalStateException.class)
    public ResultVO IllegalStateException(HttpServletRequest request, HttpServletResponse response, BindException e) {
        log.error("【系统异常】请求地址：{}",request.getRequestURL(), e);
        List<FieldError> fieldErrors = e.getFieldErrors();
        String defaultMessage = fieldErrors.get(0).getDefaultMessage();
        return ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), defaultMessage);
    }*/

    /**未知异常*/
    @ExceptionHandler(value = Exception.class)
    public ModelAndView handlerException(HttpServletRequest request, HttpServletResponse response, Exception e) {

        //请求参数异常
        if(e.getClass().equals(MethodArgumentNotValidException.class) ){
            //e.printStackTrace();
            String defaultMessage = e.getMessage();
           String resultMessage=defaultMessage.substring(defaultMessage.lastIndexOf("[")+1,defaultMessage.lastIndexOf("]]"));
            //ResultVO error = ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), defaultMessage);
            if(StringUtils.isNotEmpty(resultMessage)){
                return JsonView.Render(ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), resultMessage), response);
            }
            return JsonView.Render(ResultUtil.error(ResultEnum.PARA_ERROR.getCode(), defaultMessage), response);
            //return error;
        }
        Writer writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));
        //System.out.println("打印错误:"+writer.toString());
        //e.printStackTrace();
        log.error(writer.toString());
        //return ResultUtil.error(ResultEnum.SYS_ERROR.getCode(), ResultEnum.SYS_ERROR.getMessage());
        return JsonView.Render(ResultUtil.error(ResultEnum.SYS_ERROR.getCode(), e.getMessage()), response);
    }




}
