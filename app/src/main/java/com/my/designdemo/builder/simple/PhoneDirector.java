package com.my.designdemo.builder.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/11下午3:21
 * E-Mail:mengyuanzz@126.com
 * Desc  :手机Builder的管理者
 */

public class PhoneDirector {

    private PhoneBuilder builder;

    public PhoneDirector(PhoneBuilder builder) {
        this.builder = builder;
    }

    public PhoneProduct constuct(String brand, String cpu, String memorySize, String pixel) {


        builder.buildBrand(brand);
        builder.buildCPU(cpu);
        builder.buildMemorySize(memorySize);
        builder.buildPixel(pixel);

        return builder.create();
    }
}
