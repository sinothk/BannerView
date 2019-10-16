package com.sinothk.widget.bannerView.style1;

import androidx.viewpager.widget.ViewPager;

import com.sinothk.widget.bannerView.style1.transformer.AccordionTransformer;
import com.sinothk.widget.bannerView.style1.transformer.BackgroundToForegroundTransformer;
import com.sinothk.widget.bannerView.style1.transformer.CubeInTransformer;
import com.sinothk.widget.bannerView.style1.transformer.CubeOutTransformer;
import com.sinothk.widget.bannerView.style1.transformer.DefaultTransformer;
import com.sinothk.widget.bannerView.style1.transformer.DepthPageTransformer;
import com.sinothk.widget.bannerView.style1.transformer.FlipHorizontalTransformer;
import com.sinothk.widget.bannerView.style1.transformer.FlipVerticalTransformer;
import com.sinothk.widget.bannerView.style1.transformer.ForegroundToBackgroundTransformer;
import com.sinothk.widget.bannerView.style1.transformer.RotateDownTransformer;
import com.sinothk.widget.bannerView.style1.transformer.RotateUpTransformer;
import com.sinothk.widget.bannerView.style1.transformer.ScaleInOutTransformer;
import com.sinothk.widget.bannerView.style1.transformer.StackTransformer;
import com.sinothk.widget.bannerView.style1.transformer.TabletTransformer;
import com.sinothk.widget.bannerView.style1.transformer.ZoomInTransformer;
import com.sinothk.widget.bannerView.style1.transformer.ZoomOutSlideTransformer;
import com.sinothk.widget.bannerView.style1.transformer.ZoomOutTranformer;


public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
