package com.sinothk.bannerView.demo;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sinothk.widget.bannerView.style1.BannerView;
import com.sinothk.widget.bannerView.style1.ext.BannerBean;
import com.sinothk.widget.bannerView.style1.ext.BannerUtil;
import com.sinothk.widget.bannerView.style1.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerView bannerView, banner2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int h = 508 * width / 1080;

        bannerView = findViewById(R.id.banner);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, h);
        bannerView.setLayoutParams(layoutParams);


        List<BannerBean> bannerBeanList = new ArrayList<>();
        BannerBean banner2 = BannerBean.getEntity("T1", R.drawable.banner01, "1");
        BannerBean banner3 = BannerBean.getEntity("T1", R.drawable.banner02, "1");
        bannerBeanList.add(banner2);
        bannerBeanList.add(banner3);

        BannerUtil.show(this, bannerView, bannerBeanList, BannerUtil.CENTER);

        bannerView.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });

        // =====================================================================

        banner2View = findViewById(R.id.banner2);
        final List<BannerBean> bannerBeanList2 = new ArrayList<>();

        BannerBean banner2_1 = BannerBean.getEntity("T1", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg", "1");
        BannerBean banner2_2 = BannerBean.getEntity("T2", "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2998709676,3706664345&fm=26&gp=0.jpg", "1");
        BannerBean banner2_3 = BannerBean.getEntity("T3", "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1148107543,1622080121&fm=26&gp=0.jpg", "1");

        bannerBeanList2.add(banner2_1);
        bannerBeanList2.add(banner2_2);
        bannerBeanList2.add(banner2_3);

        BannerUtil.show(this, banner2View, bannerBeanList2, BannerUtil.RIGHT);

        banner2View.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) { //bannerBeanList2.get(position).getBizId()
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });


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
