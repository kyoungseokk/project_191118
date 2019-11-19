package com.example.user.project_191118;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText m_Value, m_nextText;
    String m_imageName, m_strNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_Value = (EditText) findViewById(R.id.editText);
        m_nextText = (EditText) findViewById(R.id.nextText);

        SharedPreferences settings = getSharedPreferences("share", 0);
        m_imageName = settings.getString("imageName", "");
        m_Value.setText(m_imageName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences settings = getSharedPreferences("share", 0);
//        SharedPreferences settings = getPreferences(0);
        m_imageName = m_Value.getText().toString();
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("imageName", m_imageName);

        //2nd example

        m_strNext = m_nextText.getText().toString();
        editor.putString("nextName", m_strNext);
        editor.commit();

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }
}
