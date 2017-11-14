package com.oa.ht.application.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.oa.ht.application.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetActivity extends AppCompatActivity {

    @BindView(R.id.user_img_back)
    ImageView userImgBack;
    @BindView(R.id.user_msg_back)
    TextView userMsgBack;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.set_layout_message)
    LinearLayout setLayoutMessage;
    @BindView(R.id.set_layout_privacy)
    LinearLayout setLayoutPrivacy;
    @BindView(R.id.set_layout_manyUser)
    LinearLayout setLayoutManyUser;
    @BindView(R.id.set_layout_myservice)
    LinearLayout setLayoutMyservice;
    @BindView(R.id.set_btn_back)
    Button setBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.user_img_back, R.id.user_msg_back, R.id.set_layout_message, R.id.set_layout_privacy, R.id.set_layout_manyUser, R.id.set_layout_myservice, R.id.set_btn_back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.user_img_back:
                finish();
                break;
            case R.id.user_msg_back:
                finish();
                break;
            case R.id.set_layout_message:
                break;
            case R.id.set_layout_privacy:
                break;
            case R.id.set_layout_manyUser:
                break;
            case R.id.set_layout_myservice:
                break;
            case R.id.set_btn_back:
                break;
        }
    }
}
