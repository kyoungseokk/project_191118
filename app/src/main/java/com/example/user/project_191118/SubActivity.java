package com.example.user.project_191118;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

// 2nd Page
public class SubActivity extends AppCompatActivity {

    EditText m_nextText;
    String m_strNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        m_nextText = (EditText) findViewById(R.id.editText);

        SharedPreferences settings = getSharedPreferences("share", 0);
        m_strNext = settings.getString("nextName", "");
        m_nextText.setText(m_strNext);


    }
}
