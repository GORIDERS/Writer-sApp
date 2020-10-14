package com.example.writersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView)findViewById(R.id.text1);
        String para = "A view group that allows the view hierarchy placed within it to be scrolled. Scroll view may have only one direct child placed within it. To add multiple views within the scroll view, make the direct child you add a view group, for example LinearLayout, and place additional views within that LinearLayout.\n" +
                "\n" +
                "Scroll view supports vertical scrolling only. For horizontal scrolling, use HorizontalScrollView instead.\n" +
                "\n" +
                "Never add a RecyclerView or ListView to a scroll view. Doing so results in poor user interface performance and a poor user experience." +
                "In android, ScrollView is a kind of layout that is useful to add vertical or horizontal scroll bars to the content which is larger than the actual size of layouts such as linearlayout, relativelayout, framelayout, etc.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Generally, the android ScrollView is useful when we have content that doesn’t fit our android app layout screen. The ScrollView will enable a scroll to the content which is exceeding the screen layout and allow users to see the complete content by scrolling.\n" +
                "\n" +
                " \n" +
                "\n" +
                "The android ScrollView can hold only one direct child. In case, if we want to add multiple views within the scroll view, then we need to include them in another standard layout like linearlayout, relativelayout, framelayout, etc.\n" +
                "\n" +
                " \n" +
                "\n" +
                "To enable scrolling for our android applications, ScrollView is the best option but we should not use ScrollView along with ListView or Gridview because they both will take care of their own vertical scrolling.\n" +
                "\n" +
                " \n" +
                "\n" +
                "In android, ScrollView supports only vertical scrolling. In case, if we want to implement horizontal scrolling, then we need to use a HorizontalScrollView component.\n" +
                "\n" +
                " \n" +
                "\n" +
                "The android ScrollView is having a property called android:fillViewport, which is used to define whether the ScrollView should stretch it’s content to fill the viewport or not.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Now we will see how to use ScrollView with linearlayout to enable scroll view to the content which is larger than screen layout in android application with examples.";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}