package socket.my.com.designdemo.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import socket.my.com.designdemo.R;
import socket.my.com.designdemo.builder.dialog.NormalDialog;
import socket.my.com.designdemo.builder.simple.PhoneBuilder;
import socket.my.com.designdemo.builder.simple.PhoneDirector;
import socket.my.com.designdemo.builder.simple.PhoneProduct;

/**
 * Author：mengyuan
 * Date  : 2017/6/29下午4:39
 * E-Mail:mengyuanzz@126.com
 * Desc  :Build模式-Dialog演示
 */

public class BuilderActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView tv_build_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        tv_build_6 = (TextView) findViewById(R.id.tv_build_6);

        findViewById(R.id.bt_build_0).setOnClickListener(this);
        findViewById(R.id.bt_build_1).setOnClickListener(this);
        findViewById(R.id.bt_build_2).setOnClickListener(this);
        findViewById(R.id.bt_build_3).setOnClickListener(this);
        findViewById(R.id.bt_build_4).setOnClickListener(this);
        findViewById(R.id.bt_build_5).setOnClickListener(this);
        findViewById(R.id.bt_build_6).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_build_0:
                NormalDialog.with(this)
                        .title("标题")
                        .message("我想靠右边显示")
                        .messageGravity(Gravity.START)
                        .leftBt("test0", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_1:
                NormalDialog.with(this)
                        .message("我想居中")
                        .canCancel(false)
                        .leftBt("test1", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_2:
                NormalDialog.with(this)
                        .message("点击外部可以关闭，不信你点点")
                        .title("再来个标题")
                        .leftBt("变个颜色", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .leftBtColor(getResources().getColor(R.color.color_3ec179))
                        .rightBt("test2", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test2", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_3:
                NormalDialog.with(this)
                        .message("点击外部不可以关闭")
                        .canCancel(false)
                        .leftBtColor(getResources().getColor(R.color.color_0090ff))
                        .rightBtColor(getResources().getColor(R.color.color_f96c59))
                        .leftBt("再变个颜色", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .rightBt("test2", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test2", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_4:
                NormalDialog.with(this)
                        .imageResource(R.mipmap.icon_failed)
                        .message("非常抱歉，充值失败！")
                        .canCancel(false)
                        .leftBt("取消", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "取消", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .rightBt("重试", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "重试", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_5:
                NormalDialog.with(this)
                        .title("提示")
                        .message("您确认退出登录吗？")
                        .canCancel(false)
                        .leftBtColor(getResources().getColor(R.color.color_0090ff))
                        .rightBtColor(getResources().getColor(R.color.color_f96c59))
                        .leftBt("取消", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                dialog.cancel();
                            }
                        })
                        .rightBt("确认", new NormalDialog.ConcreteBuilder.ButtonClickLister() {
                            @Override
                            public void onClick(NormalDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "退出登录成功！", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.bt_build_6:
                //创建Builder对象
                PhoneBuilder miBuilder = new socket.my.com.designdemo.builder.simple.ConcretePhoneBuilder();
                //创建管理者
                PhoneDirector director = new PhoneDirector(miBuilder);
                //生成商品
                PhoneProduct product = null;
                switch (new Random().nextInt(4)) {
                    case 0:
                        product = director.constuct("小米", "骁龙825", "4GB", "1500万像素");
                        break;
                    case 1:
                        product = director.constuct("华为", "骁龙800", "2GB", "800万像素");
                        break;
                    case 2:
                        product = director.constuct("魅族", "骁龙800", "2GB", "1500万像素");
                        break;
                    case 3:
                        product = director.constuct("三星", "BOOM号", "4GB", "1300万像素");
                        break;
                }
                assert product != null;
                tv_build_6.setText(product.toString());
                break;
        }
    }
}
