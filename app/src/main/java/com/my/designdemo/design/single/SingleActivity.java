package com.my.designdemo.design.single;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

import com.my.designdemo.R;
import com.my.designdemo.design.single.simple.枚举单例;
import com.my.designdemo.design.single.thread.EasyTrainThread;


/**
 * Author：mengyuan
 * Date  : 2017/6/29下午4:43
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class SingleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_single_0;
    private TextView tv_single_1;


    private Handler tv0Handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            tv_single_0.append(msg.obj + "\n");
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_single);

        tv_single_0 = (TextView) findViewById(R.id.tv_single_0);
        tv_single_1 = (TextView) findViewById(R.id.tv_single_1);


        findViewById(R.id.bt_single_0).setOnClickListener(this);
        findViewById(R.id.bt_single_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_single_0://最简单的懒汉式
                easySaleTicket();
                break;
            case R.id.bt_single_1://枚举单例
                String url = 枚举单例.INSTANCE.getUrl();

                SpannableStringBuilder styled = new SpannableStringBuilder(url);
                styled.setSpan(new URLSpan(url), 0, url.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                //设置超链接可点击
                tv_single_1.setMovementMethod(new LinkMovementMethod());
                tv_single_1.setText(styled);
                break;
        }
    }


    private void easySaleTicket() {
        //同时创建10个线程
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();
        new Thread(new EasyTrainThread() {
            @Override
            public void sendHandler(String className) {
                Message obtain = Message.obtain();
                obtain.obj = className;
                tv0Handler.sendMessage(obtain);

            }

        }).start();

    }
}
