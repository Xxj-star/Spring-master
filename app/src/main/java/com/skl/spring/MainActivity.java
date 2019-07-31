package com.skl.spring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.skl.popmenu.PopMenu;
import com.skl.popmenu.PopMenuItem;
import com.skl.popmenu.PopMenuItemListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.clickBut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopMenu mPopMenu = new PopMenu.Builder().attachToActivity(MainActivity.this)
                        .addMenuItem(new PopMenuItem("微信朋友圈", getResources().getDrawable(R.mipmap.umeng_socialize_wxcircle)))
                        .addMenuItem(new PopMenuItem("微信好友", getResources().getDrawable(R.mipmap.umeng_socialize_wechat)))
                        .addMenuItem(new PopMenuItem("微博", getResources().getDrawable(R.mipmap.umeng_socialize_sina)))
                        .addMenuItem(new PopMenuItem("QQ空间", getResources().getDrawable(R.mipmap.umeng_socialize_qzone)))
                        .addMenuItem(new PopMenuItem("QQ好友", getResources().getDrawable(R.mipmap.umeng_socialize_qq)))
                        .addMenuItem(new PopMenuItem("复制链接", getResources().getDrawable(R.mipmap.umeng_socialize_copyurl)))
                        .setOnItemClickListener(new PopMenuItemListener() {
                            @Override
                            public void onItemClick(PopMenu popMenu, int position) {
                                switch (position) {
                                    case 0:
                                        Toast.makeText(MainActivity.this,"微信朋友圈被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                    case 1:
                                        Toast.makeText(MainActivity.this,"微信好友被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                    case 2:
                                        Toast.makeText(MainActivity.this,"微博被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                    case 3:
                                        Toast.makeText(MainActivity.this,"QQ空间被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                    case 4:
                                        Toast.makeText(MainActivity.this,"QQ好友被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                    case 5:
                                        Toast.makeText(MainActivity.this,"复制链接被点击了",Toast.LENGTH_LONG).show();
                                        break;
                                }
                            }
                        })
                        .build();
                mPopMenu.show();
            }
        });
    }
}
