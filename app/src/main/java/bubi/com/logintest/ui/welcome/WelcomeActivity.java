package bubi.com.logintest.ui.welcome;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import bubi.com.logintest.R;
import bubi.com.logintest.ui.list.ListActivity;


public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button openListScreenButton = findViewById(R.id.open_list_screen_button);
        openListScreenButton.setOnClickListener(view -> openListScreen());

        Button showPushNotification = findViewById(R.id.show_push_notification_button);
        showPushNotification.setOnClickListener(view -> showPushNotification());

        Button openWebViewScreen = findViewById(R.id.open_web_view_screen_button);
        openWebViewScreen.setOnClickListener(view -> openWebViewScreen());
    }

    private void openListScreen() {
        final Intent intent = new Intent(WelcomeActivity.this, ListActivity.class);
        startActivity(intent);
    }

    private void showPushNotification() {
        String tittle = "Push title";
        String subject = "Push subject";
        String body = "Push notification text continue";

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder notificationBuilder = new Notification.Builder(getApplicationContext())
                .setContentTitle(tittle)
                .setContentText(body)
                .setContentTitle(subject)
                .setSmallIcon(R.drawable.ic_launcher_background);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("some_channel_id", "Pusher Events", NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
            notificationBuilder.setChannelId("some_channel_id");
        }

        Notification notify = notificationBuilder.build();

        notify.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0, notify);
    }

    private void openWebViewScreen() {
        //needs implementation
    }
}
