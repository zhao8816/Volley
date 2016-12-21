package test.bwie.com.volley;

/**
 * Author：ZhaoTieJin
 * date :  2016/12/21
 */

public class Url {
    //http://v.juhe.cn/toutiao/index?type=shehui&key=2f41498b35e69877fc56dc96776e5d1f

    //便于更改，把url按一下规则写
    public static boolean isOnline = true;
    public static String host_online = "http://v.juhe.cn/toutiao/index";//上线时用的域名
    public static String host_dev = "http://v.juhe.cn/toutiao/index";//开发时用的域名
    public static String host = isOnline ? host_online : host_dev;//true执行前者，false执行后者
    public static String url_ceshi = host + "?type=shehui&key=2f41498b35e69877fc56dc96776e5d1f";
}
