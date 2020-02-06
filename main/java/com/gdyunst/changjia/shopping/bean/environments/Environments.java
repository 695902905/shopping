package com.gdyunst.changjia.shopping.bean.environments;


import org.apache.commons.lang3.ArrayUtils;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

/**
 * @author xieyian
 * @description ${@description}
 * @date 2019/7/3
 **/

public class Environments implements Environment {
    /**
     * 是否为生产环境
     * @return
     */

    public static Boolean isProduction(){
        Environment environment = ContextHolder.getContext().getEnvironment();
        if(!ArrayUtils.contains(environment.getActiveProfiles(), Globals.Profiles.PROD)){
            return false;
        }else{
            return true;
        }
    }

    public static Boolean isSit(){
        Environment environment = ContextHolder.getContext().getEnvironment();
        if(!ArrayUtils.contains(environment.getActiveProfiles(), Globals.Profiles.SIT)){
            return false;
        }else{
            return true;
        }
    }

    /**
     * 是否为开发环境
     * @return
     */
    public static Boolean isDevelopment(){
        Environment environment = ContextHolder.getContext().getEnvironment();
        if(!ArrayUtils.contains(environment.getActiveProfiles(), Globals.Profiles.DEV)){
            return false;
        }else{
            return true;

        }
    }

    @Override
    public String[] getActiveProfiles() {
        return new String[0];
    }

    @Override
    public String[] getDefaultProfiles() {
        return new String[0];
    }

    @Override
    public boolean acceptsProfiles(String... strings) {
        return false;
    }

    @Override
    public boolean acceptsProfiles(Profiles profiles) {
        return false;
    }

    @Override
    public boolean containsProperty(String s) {
        return false;
    }

    @Override
    public String getProperty(String s) {
        return null;
    }

    @Override
    public String getProperty(String s, String s1) {
        return null;
    }

    @Override
    public <T> T getProperty(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T getProperty(String s, Class<T> aClass, T t) {
        return null;
    }

    @Override
    public String getRequiredProperty(String s) throws IllegalStateException {
        return null;
    }

    @Override
    public <T> T getRequiredProperty(String s, Class<T> aClass) throws IllegalStateException {
        return null;
    }

    @Override
    public String resolvePlaceholders(String s) {
        return null;
    }

    @Override
    public String resolveRequiredPlaceholders(String s) throws IllegalArgumentException {
        return null;
    }
}
