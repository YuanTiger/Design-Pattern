package com.my.designdemo.design.builder.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/11下午3:05
 * E-Mail:mengyuanzz@126.com
 * Desc  :商品-手机模型
 */

public class PhoneProduct {

    private String brand;//品牌
    private String CPU;//CPU
    private String memorySize;//内存大小
    private String pixel;//像素大小


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    @Override
    public String toString() {
        return "品牌：" + brand +
                "\nCPU：" + CPU +
                "\n内存大小：" + memorySize +
                "\n像素大小：" + pixel;
    }
}
