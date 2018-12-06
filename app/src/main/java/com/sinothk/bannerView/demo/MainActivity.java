package com.sinothk.bannerView.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sinothk.widget.bannerView.style1.BannerView;
import com.sinothk.widget.bannerView.style1.ext.BannerBean;
import com.sinothk.widget.bannerView.style1.ext.BannerUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerView bannerView, banner2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerView = (BannerView) findViewById(R.id.banner);
        List<BannerBean> bannerBeanList = new ArrayList<>();
        BannerBean banner1 = new BannerBean("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg");
        BannerBean banner2 = new BannerBean("http://p1.so.qhimgs1.com/t015f7060fbdb07aa81.jpg");
        BannerBean banner3 = new BannerBean(R.drawable.no_banner);
        bannerBeanList.add(banner1);
        bannerBeanList.add(banner2);
        bannerBeanList.add(banner3);

        BannerUtil.show(this, bannerView, bannerBeanList, BannerUtil.CENTER);

        // =====================================================================

        banner2View = (BannerView) findViewById(R.id.banner2);
        List<BannerBean> bannerBeanList2 = new ArrayList<>();
        BannerBean banner2_1 = new BannerBean("T1", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg");
        BannerBean banner2_2 = new BannerBean("T2", "http://p1.so.qhimgs1.com/t015f7060fbdb07aa81.jpg");
        BannerBean banner2_3 = new BannerBean("T3", "http://p2.so.qhimgs1.com/t016293e0d59c90e5c2.jpg");
        bannerBeanList2.add(banner2_1);
        bannerBeanList2.add(banner2_2);
        bannerBeanList2.add(banner2_3);
        BannerUtil.show(this, banner2View, bannerBeanList2);

        // =======================原版=================================
//        Banner banner = (Banner) findViewById(R.id.banner);
//        //设置banner样式
//        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
//        //设置图片加载器
//        banner.setImageLoader(new GlideImageLoader());
//        //设置图片集合
//        banner.setImages(images);
//        //设置banner动画效果
//        banner.setBannerAnimation(Transformer.DepthPage);
//        //设置标题集合（当banner样式有显示title时）
//        banner.setBannerTitles(titles);
//        //设置自动轮播，默认为true
//        banner.isAutoPlay(true);
//        //设置轮播时间
//        banner.setDelayTime(1500);
//        //设置指示器位置（当banner模式中有指示器时）
//        banner.setIndicatorGravity(BannerConfig.CENTER);
//        //banner设置方法全部调用完毕时最后调用
//        banner.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        BannerUtil.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        BannerUtil.stopAutoPlay();
    }
}
