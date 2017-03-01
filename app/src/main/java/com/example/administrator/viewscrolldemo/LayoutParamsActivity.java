package com.example.administrator.viewscrolldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

/**
 * Created by ChuPeng on 2017/1/18.
 * 通过改变布局参数对View进行移动
 */

public class LayoutParamsActivity extends Activity
{
    //向上移动
    private Button up;
    //向下移动
    private Button down;
    //重置
    private Button reset;
    //被移动的按钮
    private Button moveButton;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_params);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        reset = (Button) findViewById(R.id.reset);
        moveButton = (Button) findViewById(R.id.moveButton);

        up.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //获取被移动按钮的参数
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) moveButton.getLayoutParams();
                //每次移动100px
                params.topMargin -= 100;
                //刷新View控件
                moveButton.requestLayout();
            }
        });

        down.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //获取被移动按钮的参数
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) moveButton.getLayoutParams();
                //每次移动100px
                params.topMargin += 100;
                //刷新View控件
                moveButton.requestLayout();
            }
        });

        reset.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //获取被移动按钮的参数
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) moveButton.getLayoutParams();
                //重置为0
                params.topMargin = 0;
                //刷新View控件
                moveButton.requestLayout();
            }
        });
    }
}
