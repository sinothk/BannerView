package com.sinothk.widget.bannerView.style1.ext;

import android.content.Intent;

/**
 * <pre>
 *  创建:  梁玉涛 2018/2/26/026 on 14:06
 *  项目: BannerView
 *  描述:
 *  更新:
 * <pre>
 */
public class BannerBean {

    private String title;
    private Object imgUrl;
    private String bizId;

    public static BannerBean getEntity(String title, Object imgUrl, String bizId) {
        BannerBean bean = new BannerBean();
        bean.setTitle(title);
        bean.setImgUrl(imgUrl);
        bean.setBizId(bizId);
        return bean;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Object imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }
}
