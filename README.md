# Volley
Volley请求网络数据
注意事项：
    1、先在studio中下载Volley框架，然后写逻辑代码。
    2、Volley请求到的数据直接传递到了主线程。（能够吐司出来显示，就是证明）
    3、此外，Url类里面，还介绍了url拼接规则，方便以后更改。
        如下：：
              //http://v.juhe.cn/toutiao/index?type=shehui&key=2f41498b35e69877fc56dc96776e5d1f

              //便于更改，把url按一下规则写
              public static boolean isOnline = true;
              public static String host_online = "http://v.juhe.cn/toutiao/index";//上线时用的域名
              public static String host_dev = "http://v.juhe.cn/toutiao/index";//开发时用的域名
              public static String host = isOnline ? host_online : host_dev;//true执行前者，false执行后者
              public static String url_ceshi = host + "?type=shehui&key=2f41498b35e69877fc56dc96776e5d1f";
