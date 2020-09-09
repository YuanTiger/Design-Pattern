package com.my.designdemo.design.command;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.my.designdemo.R;
import com.my.designdemo.design.command.simple.TetrisButtons;
import com.my.designdemo.design.command.simple.TetrisCommand;
import com.my.designdemo.design.command.simple.TetrisCommandBottom;
import com.my.designdemo.design.command.simple.TetrisCommandLeft;
import com.my.designdemo.design.command.simple.TetrisCommandRight;
import com.my.designdemo.design.command.simple.TetrisCommandTop;
import com.my.designdemo.design.command.simple.TetrisReceiver;

/**
 * Author: mengyuan
 * Date  : 2020/9/9/5:16 PM
 * E-Mail: mengyuanzz@126.com
 * -----------
 * 命令模式实例
 */
public class CommandActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView tvCommandDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_command);

        findViewById(R.id.bt_command).setOnClickListener(this);

        tvCommandDesc = findViewById(R.id.tv_command_desc);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_command:
                tvCommandDesc.setText("");
                testCommand();
                break;
        }
    }

    private void testCommand() {
        //首先要有《俄罗斯方块游戏》
        TetrisReceiver receiver = new TetrisReceiver();
        //我们创建好定义好的命令
        TetrisCommand commandLeft = new TetrisCommandLeft(receiver);
        TetrisCommand commandRight = new TetrisCommandRight(receiver);
        TetrisCommand commandBottom = new TetrisCommandBottom(receiver);
        TetrisCommand commandTop = new TetrisCommandTop(receiver);
        //将命令统一封装到按钮中
        TetrisButtons buttons = new TetrisButtons();
        buttons.setCommandLeft(commandLeft);
        buttons.setCommandRight(commandRight);
        buttons.setCommandBottom(commandBottom);
        buttons.setCommandTop(commandTop);
        //具体按下哪个按钮，由用户决定
        StringBuilder builder = new StringBuilder();
        builder.append(buttons.toTop()).append("\n");
        builder.append(buttons.toTop()).append("\n");
        builder.append(buttons.toTop()).append("\n");
        builder.append(buttons.toTop()).append("\n");
        builder.append(buttons.toLeft()).append("\n");
        builder.append(buttons.toRight()).append("\n");
        builder.append(buttons.toBottom());

        tvCommandDesc.setText(builder);
    }
}
