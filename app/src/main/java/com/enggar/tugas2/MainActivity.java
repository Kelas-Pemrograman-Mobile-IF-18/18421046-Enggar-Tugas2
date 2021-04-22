package com.enggar.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txNama;
    EditText edtNama, edtNpm, edtJekel, edtTelp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNama = (TextView) findViewById(R.id.txtHasil);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtJekel = (EditText) findViewById(R.id.edtJeKel);
        edtTelp = (EditText) findViewById(R.id.edtTelp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txNama.setText(edtNpm.getText() + "\n" +  edtNama.getText() + "\n" + edtJekel.getText()+ "\n" + edtTelp.getText());
            }
        });
    }
}