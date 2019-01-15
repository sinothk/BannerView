package com.sinothk.widget.bannerView.style1.ext;

import android.content.Context;
import android.widget.ImageView;

import com.sinothk.widget.bannerView.style1.loader.ImageLoader;
import com.squareup.picasso.Picasso;

import java.io.File;

/**
 * <pre>
 *  创建:  梁玉涛 2018/2/26/026 on 11:52
 *  项目: BannerView
 *  描述:
 *  更新:
 * <pre>
 */
public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
         切记不要胡乱强转！
         */
//        eg：
//        //Glide 加载图片简单用法
        if (path instanceof String) {
//            Glide.with(context).load((String) path).into(imageView);
            Picasso.with(context).load((String) path).into(imageView);
        } else if (path instanceof Integer) {
//            Glide.with(context).load((Integer) path).into(imageView);
            Picasso.with(context).load((Integer) path).into(imageView);
        } else if (path instanceof File) {
//            Glide.with(context).load((File) path).into(imageView);
            Picasso.with(context).load((File) path).into(imageView);
        }

        //Picasso 加载图片简单用法
//        Picasso.with(context).load((String) path).into(imageView);
//
//        //用fresco加载图片简单用法，记得要写下面的createImageView方法
//        Uri uri = Uri.parse((String) path);
//        imageView.setImageURI(uri);
    }

//    //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//    @Override
//    public ImageView createImageView(Context context) {
//        //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//        SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
//        return simpleDraweeView;
//    }
}
