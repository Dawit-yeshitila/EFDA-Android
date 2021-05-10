package com.expire.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        button1 = (Button) findViewById(R.id.home);
        button2 = (Button) findViewById(R.id.notification);
        button3 = (Button) findViewById(R.id.alarm);
        button4 = (Button) findViewById(R.id.message);
        button5 = (Button) findViewById(R.id.list);
        button6 = (Button) findViewById(R.id.setting);
        button7 = (Button) findViewById(R.id.login);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class7();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class6();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class5();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class4();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class2();
            }
        });


    }


    public void class2() {
        Intent intent2 = new Intent(this, notification.class);
        startActivity(intent2);
    }

    public void class3() {
        Intent intent3 = new Intent(this, alarm.class);
        startActivity(intent3);
    }

    public void class4() {
        Intent intent4 = new Intent(this, message.class);
        startActivity(intent4);
    }

    public void class5() {
        Intent intent5 = new Intent(this, list.class);
        startActivity(intent5);
    }

    public void class6() {
        Intent intent6 = new Intent(this, setting.class);
        startActivity(intent6);
    }

    public void class7() {
        Intent intent7 = new Intent(this, login.class);
        startActivity(intent7);
    }

}