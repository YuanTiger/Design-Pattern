package socket.my.com.designdemo.single.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/3下午3:55
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class 完美的懒汉式 {
    //全项目唯一的对象
    private volatile  static 完美的懒汉式 ourInstance;

    //构造方法私有化
    private 完美的懒汉式() {

    }

    //通过静态方法来返回对象
    public static 完美的懒汉式 getInstance() {
        //在调用该方法时进行判空，在对象为null时创建对象
        if (ourInstance == null) {
            synchronized (new Object()) {
                if (ourInstance == null) {
                    ourInstance = new 完美的懒汉式();
                }
            }
        }
        return ourInstance;
    }

//    //通过静态方法来返回对象
//    public static synchronized 完美的懒汉式 getInstance2() {
//        //在调用该方法时进行判空，在对象为null时创建对象
//        if (ourInstance == null) {
//            ourInstance = new 完美的懒汉式();
//        }
//        return ourInstance;
//    }
}
