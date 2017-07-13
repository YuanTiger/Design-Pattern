package com.my.designdemo.builder.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/11下午3:17
 * E-Mail:mengyuanzz@126.com
 * Desc  :手机的具体Builder
 */

public class ConcretePhoneBuilder extends PhoneBuilder {
    //商品手机
    private PhoneProduct product = new PhoneProduct();

    @Override
    public void buildBrand(String brand) {
        product.setBrand(brand);
    }

    @Override
    public void buildCPU(String cpu) {
        product.setCPU(cpu);
    }

    @Override
    public void buildMemorySize(String memorySize) {
        product.setMemorySize(memorySize);
    }

    @Override
    public void buildPixel(String pixel) {
        product.setPixel(pixel);
    }

    @Override
    public PhoneProduct create() {
        return product;
    }
}
