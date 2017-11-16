package com.my.designdemo.design.strategy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.my.designdemo.Constant;
import com.my.designdemo.R;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午1:45
 * E-Mail:mengyuanzz@126.com
 * Desc  :  策略模式Activity
 */

public class StrategyActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private EditText et_strategy_number;
    private CheckBox cb_bus;
    private CheckBox cb_tax;
    private CheckBox cb_subway;
    private TextView tv_strategy_price;

    //选中的出行类型,
    private TripMode selectMode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_strategy);

        et_strategy_number = (EditText) findViewById(R.id.et_strategy_number);
        tv_strategy_price = (TextView) findViewById(R.id.tv_strategy_price);

        cb_bus = (CheckBox) findViewById(R.id.cb_bus);
        cb_tax = (CheckBox) findViewById(R.id.cb_tax);
        cb_subway = (CheckBox) findViewById(R.id.cb_subway);


        findViewById(R.id.bt_strategy_0).setOnClickListener(this);

        //默认地铁
        selectMode(TripMode.SUBWAY);

        cb_bus.setOnCheckedChangeListener(this);
        cb_tax.setOnCheckedChangeListener(this);
        cb_subway.setOnCheckedChangeListener(this);
    }

    private void selectMode(TripMode mode) {
        cb_bus.setChecked(false);
        cb_tax.setChecked(false);
        cb_subway.setChecked(false);

        selectMode = mode;

        switch (mode.getType()) {
            case Constant.TYPE_BUS:
                cb_bus.setChecked(true);
                break;
            case Constant.TYPE_SUBWAY:
                cb_subway.setChecked(true);
                break;
            case Constant.TYPE_TAX:
                cb_tax.setChecked(true);
                break;
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_strategy_0://计算价格
                String km = et_strategy_number.getText().toString();
                if (TextUtils.isEmpty(km)) {
                    Toast.makeText(this, "请先输入距离", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (selectMode == null) {
                    Toast.makeText(this, "请选择出行方式", Toast.LENGTH_SHORT).show();
                    return;
                }
                caculatePrice(km);
                break;
        }
    }

    private void caculatePrice(String km) {
        float price = PriceCaculateController.cacluatePrice(Integer.valueOf(km), selectMode.getType());
        tv_strategy_price.setText("使用-" + selectMode.getTripName() + "-行驶了" + km + "Km，共计：" + price + "元");

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isCheck) {
        TripMode tripMode = null;
        if (!isCheck) {
            selectMode = null;
            return;
        }
        switch (compoundButton.getId()) {
            case R.id.cb_bus:
                tripMode = TripMode.BUS;
                break;
            case R.id.cb_subway:
                tripMode = TripMode.SUBWAY;
                break;
            case R.id.cb_tax:
                tripMode = TripMode.TAX;
                break;
        }
        selectMode(tripMode);
    }
}
