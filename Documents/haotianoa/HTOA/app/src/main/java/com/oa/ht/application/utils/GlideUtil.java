package com.oa.ht.application.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.oa.ht.application.R;

/**
 * Created by apple on 2017/10/10.
 */

public class GlideUtil {
    public static void loadImage(Context mContext, Object url, ImageView imageView) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.img_loading)
                .error(R.drawable.img_load_failed)
                .fitCenter()
        ;
        Glide.with(mContext)
                .load(url)
                .apply(requestOptions)
                .into(imageView);
    }
}
