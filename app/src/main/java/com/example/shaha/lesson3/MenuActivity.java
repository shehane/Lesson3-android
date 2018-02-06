package com.example.shaha.lesson3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

  //  String phoneNumber = "";
    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final EditText editText = findViewById(R.id.edittext1);
        final Button dialpad = findViewById(R.id.button_dialpad);
        final Button contact = findViewById(R.id.button_contact);
        final Button browser = findViewById(R.id.button_browser);
        final Button callLog = findViewById(R.id.button_callLog);
        final Button gallery = findViewById(R.id.button_gallery);
        final Button camera = findViewById(R.id.button_camera);

        findViewById(R.id.button_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = editText.getText().toString();
                call(phoneNumber);
            }
        });
        dialpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialpad.setText("Heyat cetindi...");
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact();
            }
        });

        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                browser(url);
            }
        });

        callLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callLog.setText("Heyat Cetindi...");
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gallery();
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camera();
            }
        });
    }
       public void call(String phoneNumber){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
        }

        public void contact(){
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            startActivityForResult(intent, 10011);
        }

        public void browser(String url){
            if (!url.startsWith("https://") && !url.startsWith("http://")){
                url = "http://" + url;}
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

        public void gallery(){
            Intent intent = new Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setType("image/*");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        public void camera(){
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivityForResult(intent, 0);
        }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            String result = data.toURI();
            // ...
        }
    }

    }

