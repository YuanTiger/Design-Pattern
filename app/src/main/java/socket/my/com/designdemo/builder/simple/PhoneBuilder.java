package socket.my.com.designdemo.builder.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/11下午3:15
 * E-Mail:mengyuanzz@126.com
 * Desc  :商品-手机的抽象Builder
 */

public abstract class PhoneBuilder {

    //构建手机品牌
    public abstract void buildBrand(String brand);
    //构建手机CPU
    public abstract void buildCPU(String cpu);
    //构建手机内存
    public abstract void buildMemorySize(String memorySize);
    //构建手机像素大小
    public abstract void buildPixel(String pixel);
    //将各个零件进行拼接
    public abstract PhoneProduct create();
}
