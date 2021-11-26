package com.sayali.learning.afinal;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Learning on 15/12/2017.
 */

public class PicassoClient {
    public static void downloadImage(Context c, String url, ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.with(c).load(url).placeholder(R.drawable.background).into(img);
        }else {
            Picasso.with(c).load(R.drawable.logo).into(img);
        }
    }
}
