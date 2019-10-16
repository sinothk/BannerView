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

//    private String openUrl;

    // url,R.drawable.*
//    private Intent intent;
//    private String openUrl;

    private String bizId;

//    public static BannerBean getLocEntity(String title, Object imgUrl, String bizId) {
//        BannerBean bean = new BannerBean();
//        bean.setTitle(title);
//        bean.setImgUrl(imgUrl);
//        bean.setBizId(bizId);
//        return bean;
//    }

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

    //    public BannerBean(String title, String openUrl) {
//        this.img = img;
//        this.openUrl = openUrl;
//    }

//    @Deprecated
//    public BannerBean(Object img) {
//        this.img = img;
//    }
//
//    public BannerBean(String img, String openUrl) {
//        this.img = img;
//        this.openUrl = openUrl;
//    }
//
//    public BannerBean(String title, String img, String openUrl) {
//        this.title = title;
//        this.img = img;
//        this.openUrl = openUrl;
//    }
//
//    @Deprecated
//    public BannerBean(String img, Intent intent) {
//        this.img = img;
//        this.intent = intent;
//    }
//
//    @Deprecated
//    public BannerBean(String title, String img, Intent intent) {
//        this.title = title;
//        this.img = img;
//        this.intent = intent;
//    }

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Object getImg() {
//        return img;
//    }
//
//    public void setImg(Object img) {
//        this.img = img;
//    }
//
//    public Intent getIntent() {
//        return intent;
//    }
//
//    public void setIntent(Intent intent) {
//        this.intent = intent;
//    }
//
//    public String getOpenUrl() {
//        return openUrl;
//    }
//
//    public void setOpenUrl(String openUrl) {
//        this.openUrl = openUrl;
//    }
//
//    public String getBizId() {
//        return bizId;
//    }
//
//    public void setBizId(String bizId) {
//        this.bizId = bizId;
//    }
//
//    public BannerBean setBizId(BannerBean bannerBean, String bizId) {
//        bannerBean.setBizId(bizId);
//        return bannerBean;
//    }
}
