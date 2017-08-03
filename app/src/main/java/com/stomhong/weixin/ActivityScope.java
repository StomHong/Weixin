package com.stomhong.weixin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Scope;

/**
 * @author StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/26
 * Description:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
