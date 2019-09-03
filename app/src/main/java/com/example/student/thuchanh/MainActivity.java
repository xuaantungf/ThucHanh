package com.example.student.thuchanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button giai;
        giai = findViewById(R.id.giai);
        final EditText kq;
        kq = findViewById(R.id.kq);

        giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)


            {
                String sa = ((EditText) findViewById(R.id.a)).getText().toString();
                String sb = ((EditText) findViewById(R.id.b)).getText().toString();
                String sc = ((EditText) findViewById(R.id.c)).getText().toString();


                double a = Double.parseDouble(sa);
                double b = Double.parseDouble(sb);
                double c = Double.parseDouble(sc);
                if (a == 0) {
                    kq.setText("Đây là phương trình bậc 1");
                    if (b == 0) {
                        if (c == 0)
                            kq.setText(kq.getText() + "Phuong trinh co vo so nghiem");
                        else
                            kq.setText(kq.getText() + "Phuong trinh vo nghiem");

                    }
                    kq.setText("" + -c / b);
                } else {
                    double delta = b * b - (4 * a * c);
                    if (delta < 0.0) {
                        kq.setText("PT vo nghiem");
                    } else if (delta == 0) {
                        kq.setText("PT co nghiem kep: " + (-b / (2 * a)));
                    } else {
                        double delta_sqrt = Math.sqrt(delta);
                    }

                }

            }

        });
    }
}