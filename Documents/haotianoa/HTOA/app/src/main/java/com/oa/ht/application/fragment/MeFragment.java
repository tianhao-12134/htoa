package com.oa.ht.application.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.oa.ht.application.R;
import com.oa.ht.application.activity.SetActivity;
import com.oa.ht.application.activity.UserMsgActivity;
import com.oa.ht.application.utils.RoundImageView;
import com.sdsmdg.tastytoast.TastyToast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {


    @BindView(R.id.text_user_name)
    TextView textUserName;
    @BindView(R.id.text_user_profession)
    TextView textUserProfession;
    @BindView(R.id.text_user_workState)
    TextView textUserWorkState;
    @BindView(R.id.image_user_imageing)
    RoundImageView imageUserImageing;
    @BindView(R.id.user_message)
    ConstraintLayout userMessage;
    @BindView(R.id.layout_myCustomer)
    LinearLayout layoutMyCustomer;
    @BindView(R.id.layout_redPacket)
    LinearLayout layoutRedPacket;
    @BindView(R.id.layout_help)
    LinearLayout layoutHelp;
    @BindView(R.id.layout_invite)
    LinearLayout layoutInvite;
    @BindView(R.id.layout_set)
    LinearLayout layoutSet;
    Unbinder unbinder;

    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.text_user_workState, R.id.image_user_imageing, R.id.user_message, R.id.layout_myCustomer, R.id.layout_redPacket, R.id.layout_help, R.id.layout_invite, R.id.layout_set})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_user_workState://工作状态
                TastyToast.makeText(getActivity(), "工作状态", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.image_user_imageing://用户的头像
                TastyToast.makeText(getActivity(), "用户的头像", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.user_message://用户的详细信息
                startActivity(new Intent(getActivity(), UserMsgActivity.class));//跳转到用户详情页
                break;
            case R.id.layout_myCustomer://我的客服
                TastyToast.makeText(getActivity(), "我的客服", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.layout_redPacket://红包
                TastyToast.makeText(getActivity(), "红包", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.layout_help://帮助
                TastyToast.makeText(getActivity(), "帮助", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.layout_invite://邀请
                TastyToast.makeText(getActivity(), "邀请", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING);
                break;
            case R.id.layout_set://设置
                startActivity(new Intent(getActivity(), SetActivity.class));//跳转到用户详情页
                break;
        }
    }
}
