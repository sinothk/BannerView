package com.sinothk.widget.bannerView.style1;

import android.support.v4.view.ViewPager.PageTransformer;

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
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
