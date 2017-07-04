package socket.my.com.designdemo.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import socket.my.com.designdemo.R;
import socket.my.com.designdemo.builder.customerview.BuilderDialog;

/**
 * Author：mengyuan
 * Date  : 2017/6/29下午4:39
 * E-Mail:mengyuanzz@126.com
 * Desc  :Build模式-Dialog演示
 */

public class BuilderActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);


        findViewById(R.id.bt_build_0).setOnClickListener(this);
        findViewById(R.id.bt_build_1).setOnClickListener(this);
        findViewById(R.id.bt_build_2).setOnClickListener(this);
        findViewById(R.id.bt_build_3).setOnClickListener(this);
        findViewById(R.id.bt_build_4).setOnClickListener(this);
        findViewById(R.id.bt_build_5).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_build_0:
                BuilderDialog.with(this)
                        .title("标题")
                        .message("我想靠右边显示")
                        .messageGravity(Gravity.START)
                        .leftBt("test0", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
            case R.id.bt_build_1:
                BuilderDialog.with(this)
                        .message("我想居中")
                        .canCancel(false)
                        .leftBt("test1", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
            case R.id.bt_build_2:
                BuilderDialog.with(this)
                        .message("点击外部可以关闭，不信你点点")
                        .title("再来个标题")
                        .leftBt("变个颜色", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .leftBtColor(getResources().getColor(R.color.color_3ec179))
                        .rightBt("test2", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test2", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
            case R.id.bt_build_3:
                BuilderDialog.with(this)
                        .message("点击外部不可以关闭")
                        .canCancel(false)
                        .leftBtColor(getResources().getColor(R.color.color_0090ff))
                        .rightBtColor(getResources().getColor(R.color.color_f96c59))
                        .leftBt("再变个颜色", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test1", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .rightBt("test2", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "test2", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
            case R.id.bt_build_4:
                BuilderDialog.with(this)
                        .imageResource(R.mipmap.icon_failed)
                        .message("非常抱歉，充值失败！")
                        .canCancel(false)
                        .leftBt("取消", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "取消", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .rightBt("重试", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "重试", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
            case R.id.bt_build_5:
                BuilderDialog.with(this)
                        .title("提示")
                        .message("您确认退出登录吗？")
                        .leftBt("取消", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                dialog.cancel();
                            }
                        })
                        .rightBt("确认", new BuilderDialog.Builder.ButtonClickLister() {
                            @Override
                            public void onClick(BuilderDialog dialog) {
                                Toast.makeText(BuilderActivity.this, "退出登录成功！", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .build()
                        .show();
                break;
        }
    }
}
