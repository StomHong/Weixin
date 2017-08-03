package com.stomhong.weixin.func.weixin.module;

import com.stomhong.weixin.ActivityScope;
import com.stomhong.weixin.func.weixin.WeixinAdapter;
import com.stomhong.weixin.func.weixin.WeixinView;

import dagger.Module;
import dagger.Provides;

/**
 * @author StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/25
 * Description:
 */
@Module
public class WeixinModule {
    private WeixinView weixinView;

    public WeixinModule(WeixinView weixinView){
        this.weixinView = weixinView;
    }

    @ActivityScope
    @Provides
    public WeixinView provideWeixinView(){
        return weixinView;
    }

    @ActivityScope
    @Provides
    public WeixinAdapter provideWeixinAdapter(){
        return new WeixinAdapter();
    }
}
