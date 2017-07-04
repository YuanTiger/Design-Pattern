package socket.my.com.designdemo.single.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/4下午5:11
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public enum 枚举单例 {

    INSTANCE;

    public String getUrl(){
        return "http://www.baidu.com";
    }
}
