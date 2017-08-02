package com.my.designdemo.absfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.my.designdemo.R;
import com.my.designdemo.absfactory.simple.AbsFactory;
import com.my.designdemo.absfactory.simple.AndroidFactory;
import com.my.designdemo.absfactory.simple.ButtonAbsProduct;
import com.my.designdemo.absfactory.simple.IOSFactory;
import com.my.designdemo.absfactory.simple.SystemAbsProduct;
import com.my.designdemo.absfactory.simple.WindowPhoneFactory;


/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:43
 * E-Mail:mengyuanzz@126.com
 * Desc  :抽象工厂方法模式
 */

public class AbsFactoryActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_factory);

        findViewById(R.id.bt_abs_factory_0).setOnClickListener(this);
        findViewById(R.id.bt_abs_factory_1).setOnClickListener(this);
        findViewById(R.id.bt_abs_factory_2).setOnClickListener(this);
        findViewById(R.id.bt_abs_factory_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.bt_abs_factory_0://WindowPhone
                //构建WindowPhone具体工厂
                AbsFactory windowPhoneFactory = new WindowPhoneFactory();
                //构建操作系统
                SystemAbsProduct windowPhoneSystem = windowPhoneFactory.createSystem();
                //构建按钮
                ButtonAbsProduct windowPhoneButton = windowPhoneFactory.createButton();
                //调用依赖
                Toast.makeText(this, windowPhoneButton.getButtonName(windowPhoneSystem), Toast.LENGTH_SHORT).show();
                break;


            case R.id.bt_abs_factory_1://iOS
                //构建WindowPhone具体工厂
                AbsFactory iOSFactory = new IOSFactory();
                //构建操作系统
                SystemAbsProduct iOSSystem = iOSFactory.createSystem();
                //构建按钮
                ButtonAbsProduct iOSButton = iOSFactory.createButton();
                //调用依赖
                Toast.makeText(this, iOSButton.getButtonName(iOSSystem), Toast.LENGTH_SHORT).show();
                break;


            case R.id.bt_abs_factory_2://Android
                AbsFactory androidFactory = new AndroidFactory();
                SystemAbsProduct androidSystem = androidFactory.createSystem();
                ButtonAbsProduct androidButton = androidFactory.createButton();
                Toast.makeText(this, androidButton.getButtonName(androidSystem), Toast.LENGTH_SHORT).show();
                break;


            case R.id.bt_abs_factory_3://Error
                AbsFactory androidFactory1 = new AndroidFactory();
                SystemAbsProduct androidSystem1 = androidFactory1.createSystem();
                ButtonAbsProduct androidButton1 = androidFactory1.createButton();
                AbsFactory iOSFactory1 = new IOSFactory();
                SystemAbsProduct iOSSystem1 = iOSFactory1.createSystem();
                ButtonAbsProduct iOSButton1 = iOSFactory1.createButton();
                //使用Android的Button时，传入iOS操作系统
                Toast.makeText(this, androidButton1.getButtonName(iOSSystem1), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
