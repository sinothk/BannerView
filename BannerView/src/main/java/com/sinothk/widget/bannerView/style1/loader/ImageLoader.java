package com.sinothk.widget.bannerView.style1.loader;

import android.content.Context;
import android.widget.ImageView;


public abstract class ImageLoader implements ImageLoaderInterface<ImageView> {

    @Override
    public ImageView createImageView(Context context) {

        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);

        return imageView;
    }
}
