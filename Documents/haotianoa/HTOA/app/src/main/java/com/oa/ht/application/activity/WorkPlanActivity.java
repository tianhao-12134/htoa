package com.oa.ht.application.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.oa.ht.application.R;
import com.oa.ht.application.fragment.MeFragment;
import com.oa.ht.application.fragment.MessageFragment;
import com.oa.ht.application.fragment.WorkBenchFragment;
import com.oa.ht.application.fragment.WorkFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WorkPlanActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tab_message)
    RadioButton tabMessage;
    @BindView(R.id.tab_workBench)
    RadioButton tabWorkBench;
    @BindView(R.id.tab_work)
    RadioButton tabWork;
    @BindView(R.id.tab_my)
    RadioButton tabMy;
    @BindView(R.id.tab_rg)
    RadioGroup tabRg;
    private List<Fragment> fragmentList;
    private Fragment messageFragment;
    private Fragment workFragment;
    private Fragment workBenchFragment;
    private Fragment meFragmet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_plan);
        ButterKnife.bind(this);
        fragmentList = new ArrayList<>();
        addFragment();
    }
    private void addFragment() {
        messageFragment = new MessageFragment();
        workBenchFragment = new WorkBenchFragment();
        workFragment = new WorkFragment();
        meFragmet = new MeFragment();
        fragmentList.add(messageFragment);
        fragmentList.add(workBenchFragment);
        fragmentList.add(workFragment);
        fragmentList.add(meFragmet);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        tabRg.check(R.id.tab_message);
                        break;
                    case 1:
                        tabRg.check(R.id.tab_workBench);
                        break;
                    case 2:
                        tabRg.check(R.id.tab_work);
                        break;
                    case 3:
                        tabRg.check(R.id.tab_my);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.tab_message:
                        viewPager.setCurrentItem(0,true);
                        break;
                    case R.id.tab_workBench:
                        viewPager.setCurrentItem(1,true);
                        break;
                    case R.id.tab_work:
                        viewPager.setCurrentItem(2,true);
                        break;
                    case R.id.tab_my:
                        viewPager.setCurrentItem(3,true);
                        break;

                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList == null ? 0 : fragmentList.size();
        }
    }
}
