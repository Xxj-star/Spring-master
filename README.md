
# 功能

自定义弹簧分享菜单布局，结合rebound动画实现，仿微博分享动画弹框效果。


# 使用方法：
```
  1.可以自定义图片
  2.自定义菜单命名
  
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
```

版本说明

# 当前版本

[![release](https://img.shields.io/badge/release-v1.0-orange.svg)](https://github.com/xuxinjiang/Spring-master/blob/master/update.md)

## build.gradle设置
```
dependencies {
  implementation 'com.github.xuxinjiang:Spring-master:v1.0'
}
```
# 演示（请star支持）

![image text](https://github.com/xuxinjiang/Spring-master/blob/master/gif/qun.jpg)

# 联系方式

本群旨在为使用我github项目的人提供方便，如果遇到问题欢迎在群里提问。

### 欢迎加入QQ交流群（Q群574181465）

![image text](https://github.com/xuxinjiang/Spring-master/blob/master/gif/qun.jpg)



