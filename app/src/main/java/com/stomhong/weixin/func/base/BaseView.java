package com.stomhong.weixin.func.base;

/**
 * @author StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/26
 * Description: View层基类
 */

public interface BaseView {
    /**
     * 显示加载页面
     */
    void showLoading();

    /**
     * 隐藏加载页面
     */
    void hideLoading();

    /**
     * 结束Activity
     */
    void toFinish();

    /**
     * 显示消息
     * @param msg 消息内容
     */
    void showMsg(String msg);

    /**
     * 显示错误消息
     * @param msg 消息内容
     */
    void showErrorMsg(String msg);
}
