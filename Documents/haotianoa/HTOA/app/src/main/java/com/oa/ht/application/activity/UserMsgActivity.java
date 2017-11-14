package com.oa.ht.application.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.oa.ht.application.R;
import com.oa.ht.application.utils.RoundImageView;
import com.zzti.fengyongge.imagepicker.PhotoSelectorActivity;

import java.io.File;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserMsgActivity extends AppCompatActivity {

    @BindView(R.id.user_img_back)
    ImageView userImgBack;
    @BindView(R.id.user_msg_back)
    TextView userMsgBack;
    @BindView(R.id.user_meg_image)
    ConstraintLayout userMegImage;
    @BindView(R.id.user_msg_name)
    ConstraintLayout userMsgName;
    @BindView(R.id.user_msg_phone)
    ConstraintLayout userMsgPhone;
    @BindView(R.id.user_msg_erweima)
    ConstraintLayout userMsgErweima;
    @BindView(R.id.user_msg_sex)
    ConstraintLayout userMsgSex;
    @BindView(R.id.user_msg_birthday)
    ConstraintLayout userMsgBirthday;
    @BindView(R.id.user_msg_address)
    ConstraintLayout userMsgAddress;
    @BindView(R.id.user_msg_company)
    TextView userMsgCompany;
    @BindView(R.id.user_image)
    RoundImageView userImage;
    private String imageLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_msg);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.user_image, R.id.user_img_back, R.id.user_msg_back, R.id.user_meg_image, R.id.user_msg_name, R.id.user_msg_phone, R.id.user_msg_erweima, R.id.user_msg_sex, R.id.user_msg_birthday, R.id.user_msg_address, R.id.user_msg_company})
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.user_image://查看图片
                intent = new Intent(this, ShowImageActivity.class);
                intent.putExtra("imageLoad", imageLoad);
                startActivity(intent);
                break;
            case R.id.user_img_back://退出图标
                finish();
                break;
            case R.id.user_msg_back://退出文字
                finish();
                break;
            case R.id.user_meg_image://头像选择
                intent= new Intent(this, PhotoSelectorActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.putExtra("limit", 1);//number是选择图片的数量
                startActivityForResult(intent, 0);
                break;
            case R.id.user_msg_name://昵称
                break;
            case R.id.user_msg_phone://电话
                break;
            case R.id.user_msg_erweima://二维码
                break;
            case R.id.user_msg_sex://性别
                break;
            case R.id.user_msg_birthday://生日
                break;
            case R.id.user_msg_address://地区
                break;
            case R.id.user_msg_company://公司
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 0:
                if (data != null) {
                    List<String> paths = (List<String>) data.getExtras().getSerializable("photos");//path是选择拍照或者图片的地址数组
                    imageLoad = paths.get(0);
                    //处理代码
                    userImage.setImageURI(Uri.fromFile(new File(paths.get(0))));
                }
                break;
            default:
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
