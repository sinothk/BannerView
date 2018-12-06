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
    private Object img;// url,R.drawable.*
    private Intent intent;

    public BannerBean(Object img) {
        this.img = img;
    }

    public BannerBean(String title, String img) {
        this.title = title;
        this.img = img;
    }

    public BannerBean(String img, Intent intent) {
        this.img = img;
        this.intent = intent;
    }

    public BannerBean(String title, String img, Intent intent) {
        this.title = title;
        this.img = img;
        this.intent = intent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getImg() {
        return img;
    }

    public void setImg(Object img) {
        this.img = img;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
