# 引入
## Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
## Step 2. Add the dependency

	dependencies {
		implementation 'com.github.sinothk:BannerView:1.0.0912'
		implementation 'com.github.bumptech.glide:glide:3.7.0'
	}

# 使用
## java

    public class MainActivity extends AppCompatActivity {
    BannerView bannerView, banner2View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerView = (BannerView) findViewById(R.id.banner);
        banner2View = (BannerView) findViewById(R.id.banner2);

        List<BannerBean> bannerBeanList = new ArrayList<>();
        BannerBean banner1 = new BannerBean("T1", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg", 12);
        BannerBean banner2 = new BannerBean("T2", "http://p1.so.qhimgs1.com/t015f7060fbdb07aa81.jpg", 12);
        BannerBean banner3 = new BannerBean("T3", "http://p2.so.qhimgs1.com/t016293e0d59c90e5c2.jpg", 12);

        bannerBeanList.add(banner1);
        bannerBeanList.add(banner2);
        bannerBeanList.add(banner3);

        BannerUtil.show(this, bannerView, bannerBeanList);

        BannerUtil.show(this, banner2View, bannerBeanList);

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
    
## xml

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimary"
    android:orientation="vertical">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <com.sinothk.widget.bannerView.style1.BannerView
                android:id="@+id/banner"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:background="#FFF" />

            <com.sinothk.widget.bannerView.style1.BannerView
                android:id="@+id/banner2"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:background="#FFF" />
            <Button
                android:id="@+id/button"
                android:layout_width="match_parent"
                android:layout_height="1200dp"
                android:text="Button" />
        </LinearLayout>
    </ScrollView>
    </LinearLayout>
    
# 效果图

![](https://github.com/sinothk/BannerView/blob/master/app/art/banner_view_style1.png)
