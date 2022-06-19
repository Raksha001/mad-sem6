package com.example.e5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.core.app.NotificationCompat.Builder;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    NotificationManager manager;
    NotificationChannel channel;
    Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        txt = (EditText) findViewById(R.id.editTextTextPersonName);
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String message = txt.getText().toString();
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                CharSequence name = "My Notification";
                String description = "Hello World";
                int importance = NotificationManager.IMPORTANCE_DEFAULT;
                channel = new NotificationChannel("1", name, importance);
                channel.setDescription(description);

                builder = new NotificationCompat.Builder(MainActivity.this, channel.getId()).setSmallIcon(R.mipmap.ic_launcher);
                manager.createNotificationChannel(channel);

                Person jd = new Person.Builder().setName("Message") .setImportant(true) .build();
                new NotificationCompat.MessagingStyle(jd).addMessage(message, new Date().getTime(), jd) .setBuilder(builder);
                manager.notify(0, builder.build());

            }
        });
    }
}