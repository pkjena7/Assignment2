package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.assignment2.App.CHANNEL_ID;

public class MainActivity extends AppCompatActivity {

    private NotificationManagerCompat notificationManager;
    private EditText editTextTitle;
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManager = NotificationManagerCompat.from(this);
        editTextTitle = findViewById(R.id.title);
        editTextMessage = findViewById(R.id.message);
    }

    public void sendOnChannel1(View v) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .build();

        notificationManager.notify(1, notification);

    }

    public void sendOnChannel2(View v) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Bitmap largeicon = BitmapFactory.decodeResource(getResources(), R.drawable.download);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .setLargeIcon(largeicon)
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(getString(R.string.message_details))
                        .setBigContentTitle("Big Content Title")
                        .setSummaryText("Summary Text"))
                .build();

        notificationManager.notify(1, notification);

    }


    public void sendOnChannel3(View v) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Bitmap largeicon = BitmapFactory.decodeResource(getResources(), R.drawable.download);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .setLargeIcon(largeicon)
                .setStyle(new NotificationCompat.InboxStyle()
                        .addLine("This is line 1")
                        .addLine("This is line 2")
                        .addLine("This is line 3")
                        .addLine("This is line 4")
                        .addLine("This is line 5")
                        .addLine("This is line 6")
                        .addLine("This is line 7")
                        .setBigContentTitle("Big Content Title")
                        .setSummaryText("Summary Text"))
                .build();

        notificationManager.notify(1, notification);

    }

    public void sendOnChannel4(View v) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Bitmap largeicon = BitmapFactory.decodeResource(getResources(), R.drawable.download);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .setLargeIcon(largeicon)
                .setStyle(new NotificationCompat.BigPictureStyle()
                        .bigPicture(largeicon)
                        .bigLargeIcon(null))
                .build();

        notificationManager.notify(1, notification);

    }

    public void sendOnChannel5(View v) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Bitmap largeicon = BitmapFactory.decodeResource(getResources(), R.drawable.download);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .setLargeIcon(largeicon)
                .addAction(R.drawable.ic_baseline_thumb_up_24, "like", null)
                .addAction(R.drawable.ic_baseline_thumb_down_24, "Dislike", null)
                .addAction(R.drawable.ic_baseline_skip_previous_24, "previous", null)
                .addAction(R.drawable.ic_baseline_pause_24, "pause", null)
                .addAction(R.drawable.ic_baseline_skip_next_24, "next", null)
                .setStyle(new androidx.media.app.NotificationCompat.MediaStyle()
                        .setShowActionsInCompactView(1, 2, 3))
                .setSubText("Sub text")
                .build();

        notificationManager.notify(1, notification);

    }
}