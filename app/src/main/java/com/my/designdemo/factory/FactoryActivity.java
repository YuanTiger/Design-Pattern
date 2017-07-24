package com.my.designdemo.factory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.my.designdemo.R;
import com.my.designdemo.builder.BuilderActivity;
import com.my.designdemo.clone.CloneActivity;
import com.my.designdemo.factory.simple.AudiA6L;
import com.my.designdemo.factory.simple.AudiA6LFactory;
import com.my.designdemo.factory.simple.BenzE260L;
import com.my.designdemo.factory.simple.BenzE260LFactory;
import com.my.designdemo.factory.simple.CarConcreteFactory;
import com.my.designdemo.factory.simple.CarFactory;
import com.my.designdemo.factory.simple.NewCarFactory;
import com.my.designdemo.single.SingleActivity;


/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:43
 * E-Mail:mengyuanzz@126.com
 * Desc  :工厂方法模式
 */

public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        findViewById(R.id.bt_factory_0).setOnClickListener(this);
        findViewById(R.id.bt_factory_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_factory_0:
                //创建奔驰工厂
                CarFactory carFactory1 = new BenzE260LFactory();
                BenzE260L product1 = (BenzE260L) carFactory1.createProduct();
                product1.drive();
                product1.openHeadlamps();
                //创建奥迪工厂
                CarFactory carFactory2 = new AudiA6LFactory();
                AudiA6L product2 = (AudiA6L) carFactory2.createProduct();
                product2.drive();
                product2.openHeadlamps();
                break;
            case R.id.bt_factory_1:
                //创建通用汽车工厂
                NewCarFactory carFactory = new CarConcreteFactory();
                //创建奔驰E260L
                BenzE260L benzE260L = carFactory.createProduct(BenzE260L.class);
                //创建奥迪A6L
                AudiA6L audiA6L = carFactory.createProduct(AudiA6L.class);
                //测试
                benzE260L.drive();
                audiA6L.drive();

                benzE260L.openHeadlamps();
                audiA6L.openHeadlamps();
                break;

        }

    }
}
