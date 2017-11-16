package com.my.designdemo.design.clone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.my.designdemo.R;

import java.util.ArrayList;

/**
 * Author：mengyuan
 * Date  : 2017/7/17下午2:00
 * E-Mail:mengyuanzz@126.com
 * Desc  : 原型模式
 */

public class CloneActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_clone_0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clone);

        tv_clone_0 = (TextView) findViewById(R.id.tv_clone_0);

        findViewById(R.id.bt_clone_0).setOnClickListener(this);
        findViewById(R.id.bt_clone_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_clone_0://简单克隆
                //清空textView
                tv_clone_0.setText("");
                //创建对象
                WordDocument document = new WordDocument();
                document.setAuthor("孟远");
                document.setText("这是一篇极好的文章。");
                ArrayList<String> imageList = new ArrayList<>();
                imageList.add("图0");
                imageList.add("图1");
                document.setImageList(imageList);
                //打印创建的对象
                tv_clone_0.append("创建的对象:\n" + document.toString());
                //克隆对象
                WordDocument cloneBean = document.clone();
                //打印克隆的对象
                tv_clone_0.append("克隆的对象:\n" + cloneBean.toString());
                //修改克隆的对象
                cloneBean.setAuthor("黑色小老虎");
                cloneBean.addImage("新加图片2");
                //再次打印2个对象
                tv_clone_0.append("修改克隆对象:\n" + cloneBean.toString());
                tv_clone_0.append("最开始的对象:\n" + document.toString());

                break;
            case R.id.bt_clone_1://复杂克隆
                break;
        }
    }
}
