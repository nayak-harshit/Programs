package com.nayak.flashlight;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
Switch flashSwitch;
CameraManager cameraManager;
    String cameraId;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flashSwitch = findViewById(R.id.switch1);
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Flash(View view) {
        try {
            cameraId  = cameraManager.getCameraIdList()[1];
            cameraManager.setTorchMode(cameraId, false);
            flashSwitch.setChecked(false);
        }
        catch (CameraAccessException e) {
            e.printStackTrace();
        }

        Boolean flashSwitchChecked = flashSwitch.isChecked();
        if (flashSwitchChecked){
            try {
                cameraManager.setTorchMode(cameraId, true);
                flashSwitch.setText("Turn OFF Flashlight");
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }else{
            try {
                cameraManager.setTorchMode(cameraId, false);
                flashSwitch.setText("Turn ON Flashlight");
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }
    }
}