package socket.my.com.designdemo.single;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import socket.my.com.designdemo.R;
import socket.my.com.designdemo.single.simple.最简单的懒汉式;
import socket.my.com.designdemo.single.simple.枚举单例;
import socket.my.com.designdemo.single.thread.EasyTrainThread;

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
                tv_single_1.setText(枚举单例.INSTANCE.getUrl());
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
