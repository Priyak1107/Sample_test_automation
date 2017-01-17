package ankit.com.testingapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.txtSubmit);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        final TextView log = (TextView) findViewById(R.id.txtLog);
        final AppCompatEditText editText = (AppCompatEditText) findViewById(R.id.edtTxt);
        final TextInputLayout tinpt = (TextInputLayout) findViewById(R.id.txtInp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editText.getText().toString();
                if (!TextUtils.isEmpty(value)) {
                    log.setText(value);
                    tinpt.setErrorEnabled(false);
                } else {
                    tinpt.setErrorEnabled(true);
                    editText.setError("no value in edit text");
                    tinpt.setError("no value in edit text");
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });


    }
}
