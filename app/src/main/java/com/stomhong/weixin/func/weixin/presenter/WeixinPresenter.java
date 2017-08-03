package com.stomhong.weixin.func.weixin.presenter;

import com.stomhong.weixin.data.local.service.WeixinService;
import com.stomhong.weixin.func.weixin.WeixinView;

import javax.inject.Inject;

/**
 * @author StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/25
 * Description:
 */

public class WeixinPresenter {

    private WeixinView view;
    private WeixinService weixinService;

    @Inject
    public WeixinPresenter(WeixinView weixinView,WeixinService weixinService) {
        this.view = weixinView;
        this.weixinService = weixinService;
    }
}
