package com.u2tzjtne.expandabletextview.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.u2tzjtne.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {

    ExpandableTextView expandableTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableTextView = findViewById(R.id.expand_text_view);
        expandableTextView.setText("独创的垂直机器学习平台基于法律自动推理架构构建， 以法律数据、法律工具、算法引擎、法律模型为体系 提供强大的AI能力和服务。针对法律语言及法律推理任务进一步创新、重构、优化技术，锻造全场景认知和多模态理解的AI能力。领先的AI工程形式提供可全面提升AI科技和法律结合的 效率，降低法律科技服务应用的研发成本。");
    }
}