package com.my.designdemo.design.responsibility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.my.designdemo.R;
import com.my.designdemo.design.responsibility.simple.Leader;
import com.my.designdemo.design.responsibility.simple.LeaderCEO;
import com.my.designdemo.design.responsibility.simple.LeaderGeneral;
import com.my.designdemo.design.responsibility.simple.LeaderGroup;

/**
 * Author：mengyuan
 * Date  : 2017/11/16下午3:52
 * E-Mail:mengyuanzz@126.com
 * Desc  :责任链模式
 */

public class ResponsibilityActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText et_money;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsibility);

        et_money = findViewById(R.id.et_money);

        findViewById(R.id.bt_request).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_request:
                //获取输入框中输入的金额
                String money = et_money.getText().toString();
                if (TextUtils.isEmpty(money)) {
                    Toast.makeText(this, "请输入金额", Toast.LENGTH_SHORT).show();
                    return;
                }
                //组长实例
                Leader group = new LeaderGroup();
                //总监实例
                Leader general = new LeaderGeneral();
                //CEO实例
                Leader CEO = new LeaderCEO();

                //组长的下一级是总监
                group.setNextLeader(general);
                //总监的下一级是CEO
                general.setNextLeader(CEO);

                //由组长优先处理报销
                group.handlerRequest(Integer.valueOf(money));


                break;
        }
    }
}
