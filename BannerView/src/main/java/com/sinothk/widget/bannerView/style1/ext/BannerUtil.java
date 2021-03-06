package com.sinothk.widget.bannerView.style1.ext;

import android.app.Activity;
import android.content.Intent;

import com.sinothk.widget.bannerView.style1.BannerConfig;
import com.sinothk.widget.bannerView.style1.BannerView;
import com.sinothk.widget.bannerView.style1.Transformer;
import com.sinothk.widget.bannerView.style1.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  创建:  梁玉涛 2018/2/26/026 on 14:04
 *  项目: BannerView
 *  描述:
 *  更新:
 * <pre>
 */
public class BannerUtil {

    public static final int LEFT = BannerConfig.LEFT;
    public static final int CENTER = BannerConfig.CENTER;
    public static final int RIGHT = BannerConfig.RIGHT;

    private static BannerView banner;

    public static void show(final Activity activity, Object obj, final List<BannerBean> bannerBeanList, int where) {
        banner = (BannerView) obj;
        if (banner == null || bannerBeanList == null || bannerBeanList.size() == 0) {
            return;
        }

        List<String> titles = new ArrayList<>();
        List<Object> images = new ArrayList<>();

        for (BannerBean bannerBean : bannerBeanList) {
            String title = bannerBean.getTitle();
            if (title != null && title.length() != 0) {
                titles.add(title);
            }

            Object img = bannerBean.getImgUrl();
            if (img != null) {
                images.add(img);
            }
        }

        if (images.size() == 0) return;

        if (titles.size() == 0 || titles.size() != images.size()) {// 标题为空，或标题数量和图片不一致时，不显示标题
            //设置banner样式
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        } else {
            //设置banner样式
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
            //设置标题集合（当banner样式有显示title时）
            banner.setBannerTitles(titles);
        }

        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.Default);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(5000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(where);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

//        banner.setOnBannerListener(new OnBannerListener() {
//            @Override
//            public void OnBannerClick(int position) {
//                Intent intent = bannerBeanList.get(position).getIntent();
//                if (intent != null) {
//                    activity.startActivity(intent);
//                }
//            }
//        });
    }

    /**
     * 开始轮播
     */
    public static void startAutoPlay() {
        if (banner != null) {
            banner.startAutoPlay();
        }
    }

    /**
     * 结束轮播
     */
    public static void stopAutoPlay() {
        if (banner != null) {
            banner.stopAutoPlay();
        }
    }

}
