package com.gdyunst.changjia.shopping.bean.environments;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/7/3
 **/
@Service
//@Configuration
public class ContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicatioContext;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        ContextHolder.applicatioContext = ctx;
    }

    public static ApplicationContext getContext() {
        return ContextHolder.applicatioContext;
    }

    public static PropertySourcesPlaceholdersResolver getSystemProperty() {
        if(null!=applicatioContext) {
            Environment environment = applicatioContext.getBean(Environment.class);
            return new PropertySourcesPlaceholdersResolver(environment);
        }else{
            return null;
        }
    }
}
