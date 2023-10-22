package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.error_btn);
        bt2 = findViewById(R.id.success_btn);
        bt3 = findViewById(R.id.information_btn);
        bt4 = findViewById(R.id.Warning_btn);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
                showErrorDialog();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(MainActivity.this, "Success!", Toast.LENGTH_SHORT, true).show();
                showSuccessDialog();

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toasty.info(MainActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toasty.warning(MainActivity.this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
                showWarningDialog();

            }
        });

    }


    private void showErrorDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Oops!");
        pDialog.setContentText("Somthing went wrong...");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");
        pDialog.show();
    }

    private void showWarningDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(MainActivity.this, SweetAlertDialog.WARNING_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Warning!");
        pDialog.setContentText("Warning...");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");
        pDialog.show();

    }

    private void showSuccessDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Success!");
        pDialog.setContentText("Success...");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");
        pDialog.show();

    }


}
