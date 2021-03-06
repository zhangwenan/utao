package com.zhangwenan.app1.service;

import com.zhangwenan.app1.bean.SiteConfig;
import com.zhangwenan.app1.bean.SysConfig;

/**
 * Created with IntelliJ IDEA.
 * User: wenlie
 * Date: 13-10-16
 * Time: 下午10:54
 * To change this template use File | Settings | File Templates.
 */
public interface SiteConfigService {

    SiteConfig getConfigByServerName(String name);

    void updateConfig(SiteConfig siteConfig);
}
