package socket.my.com.designdemo.builder.customerview;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import socket.my.com.designdemo.R;
import socket.my.com.designdemo.utils.ScreenUtil;

/**
 * Author：mengyuan
 * Date  : 2017/6/24下午6:32
 * E-Mail:mengyuanzz@126.com
 * Desc  :全局Dialog，采用Builder模式
 * 注意：
 * 1、所有的控件默认全为隐藏，设置值才会显示出来，需要什么就设置什么即可
 * 2、关于Button，如果只有一个按钮，必须使用左边的按钮(leftButton)，因为2个按钮的分割线是与右边按钮(rightButton)绑定
 */

public class BuilderDialog extends Dialog {
    TextView tvTitle;
    ImageView ivIcon;
    TextView tvMessage;
    TextView tvButtonLeft;
    TextView tvButtonRight;
    ImageView viewLine;


    private static Builder builder;


    public static Builder with(Context context) {
        if (builder == null) {
            builder = new Builder(context);
        }
        return builder;
    }


    public BuilderDialog(DialogConfig config) {
        //设置没有标题的Dialog风格
        super(config.context,R.style.NoTitleDialog);

        View contentView = LayoutInflater.from(config.context).inflate(R.layout.dialog_build, null);
        setContentView(contentView);

        tvTitle = contentView.findViewById(R.id.tv_title);
        ivIcon = contentView.findViewById(R.id.iv_icon);
        tvMessage = contentView.findViewById(R.id.tv_message);
        tvButtonLeft = contentView.findViewById(R.id.tv_button_left);
        tvButtonRight = contentView.findViewById(R.id.tv_button_right);
        viewLine = contentView.findViewById(R.id.view_line);


        tvTitle.setVisibility(View.GONE);
        viewLine.setVisibility(View.GONE);
        ivIcon.setVisibility(View.GONE);
        tvMessage.setVisibility(View.GONE);
        tvButtonLeft.setVisibility(View.GONE);
        tvButtonRight.setVisibility(View.GONE);


        setTitlText(config.title);
        setTitlTextSize(config.titleSizeSp);
        setImageResource(config.imageResource);
        setImageWidth(config.imageWidth);
        setImageHeight(config.imageHeight);
        setTvMessage(config.message1);
        setTvMessageGravity(config.message1Gravity);
        setCancelableFlag(config.isCanCancel);
        setLeftText(config.leftButtonText, config.leftListener);
        setLeftBtColor(config.leftBtColor);
        setRightText(config.rightButtontText, config.rightListener);
        setRightBtColor(config.rightBtColor);


    }

    /**
     * 设置标题
     *
     * @param title
     */
    private void setTitlText(String title) {
        if (TextUtils.isEmpty(title)) {
            return;
        }
        tvTitle.setVisibility(View.VISIBLE);
        tvTitle.setText(title);
    }

    /**
     * 设置标题大小
     *
     * @param sp
     */
    private void setTitlTextSize(int sp) {
        if (sp <= 0) {
            return;
        }
        tvTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
    }

    /**
     * 设置图片资源
     *
     * @param imageResource
     */
    private void setImageResource(int imageResource) {
        if (imageResource == 0) {
            return;
        }
        ivIcon.setVisibility(View.VISIBLE);
        ivIcon.setImageResource(imageResource);
    }

    /**
     * 设置图片宽度,单位dp
     *
     * @param imageWidth
     */
    private void setImageWidth(int imageWidth) {
        if (imageWidth == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ivIcon.getLayoutParams();
        layoutParams.width = ScreenUtil.dp2Px(imageWidth);
        ivIcon.setLayoutParams(layoutParams);
    }

    /**
     * 设置图片高度,单位dp
     *
     * @param imageHeight
     */
    private void setImageHeight(int imageHeight) {
        if (imageHeight == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ivIcon.getLayoutParams();
        layoutParams.height = ScreenUtil.dp2Px(imageHeight);
        ivIcon.setLayoutParams(layoutParams);
    }

    /**
     * 设置Message的内容
     *
     * @param text
     */
    private void setTvMessage(String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText(text);
    }

    private void setTvMessageGravity(int gravity) {
        tvMessage.setGravity(gravity);
    }


    /**
     * 设置左边Button内容
     *
     * @param text        文字内容
     * @param clickLister 点击监听
     */
    private void setLeftText(String text, final Builder.ButtonClickLister clickLister) {
        if (TextUtils.isEmpty(text) || clickLister == null) {
            return;
        }
        tvButtonLeft.setVisibility(View.VISIBLE);
        tvButtonLeft.setText(text);
        tvButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLister.onClick(BuilderDialog.this);
            }
        });
    }

    /**
     * 设置左边按钮字体颜色
     *
     * @param color
     */
    private void setLeftBtColor(int color) {
        if (color == 0) {
            return;
        }
        tvButtonLeft.setTextColor(color);
    }

    /**
     * 设置右边Button内容
     *
     * @param text        文字内容
     * @param clickLister 点击监听
     */
    private void setRightText(String text, final Builder.ButtonClickLister clickLister) {
        if (TextUtils.isEmpty(text) || clickLister == null) {
            return;
        }
        //分割线和右边Button绑定
        viewLine.setVisibility(View.VISIBLE);
        tvButtonRight.setVisibility(View.VISIBLE);
        tvButtonRight.setText(text);
        tvButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLister.onClick(BuilderDialog.this);
            }
        });
    }

    /**
     * 设置右Button字体颜色
     *
     * @param color
     */
    private void setRightBtColor(int color) {
        if (color == 0) {
            return;
        }
        tvButtonRight.setTextColor(color);
    }


    private void setCancelableFlag(boolean cancelFlag) {
        this.setCancelable(cancelFlag);
    }


    @Override
    public void dismiss() {
        super.dismiss();
        builder = null;
    }


    //--------------------------------Builder--------------------------------
    public static class Builder {

        private DialogConfig dialogConfig;


        public Builder(Context context) {
            dialogConfig = new DialogConfig();
            dialogConfig.context = context;
        }

        public Builder title(String text) {
            dialogConfig.title = text;
            return builder;
        }

        public Builder titleSize(int spSize) {
            dialogConfig.titleSizeSp = spSize;
            return builder;
        }

        public Builder imageResource(int imageResource) {
            dialogConfig.imageResource = imageResource;
            return builder;
        }

        public Builder imageWidth(int imageWidth) {
            dialogConfig.imageWidth = imageWidth;
            return builder;
        }

        public Builder imageHeight(int imageHeight) {
            dialogConfig.imageHeight = imageHeight;
            return builder;
        }

        public Builder message(String text) {
            dialogConfig.message1 = text;
            return builder;
        }


        public Builder messageGravity(int gravity) {
            dialogConfig.message1Gravity = gravity;
            return builder;
        }


        public Builder canCancel(boolean isCanCancel) {
            dialogConfig.isCanCancel = isCanCancel;
            return builder;
        }

        public Builder leftBt(String text, ButtonClickLister lister) {
            dialogConfig.leftButtonText = text;
            dialogConfig.leftListener = lister;
            return builder;
        }

        public Builder leftBtColor(int color) {
            dialogConfig.leftBtColor = color;
            return builder;
        }

        public Builder rightBtColor(int color) {
            dialogConfig.rightBtColor = color;
            return builder;
        }

        public Builder rightBt(String text, ButtonClickLister lister) {
            dialogConfig.rightButtontText = text;
            dialogConfig.rightListener = lister;
            return builder;
        }

        public BuilderDialog build() {
            return new BuilderDialog(dialogConfig);
        }


        //--------------------------------按钮点击回调--------------------------------
        public interface ButtonClickLister {
            void onClick(BuilderDialog dialog);
        }
    }

    //--------------------------------属性封装--------------------------------
    public static class DialogConfig {
        private Context context;
        //标题
        private String title;
        //标题字体大小
        private int titleSizeSp;
        //图标资源
        private int imageResource;
        //图标宽
        private int imageWidth;
        //图标高
        private int imageHeight;
        //消息内容
        private String message1;
        //消息内容文字位置
        private int message1Gravity = Gravity.CENTER;
        //点击外部是否可以取消
        private boolean isCanCancel = true;
        //左边按钮内容
        private String leftButtonText;
        //左边按钮颜色
        private int leftBtColor;
        //左边点击事件
        private Builder.ButtonClickLister leftListener;
        //右边按钮内容
        private String rightButtontText;
        //右边边按钮颜色
        private int rightBtColor;
        //右边按钮点击事件
        private Builder.ButtonClickLister rightListener;
    }
}