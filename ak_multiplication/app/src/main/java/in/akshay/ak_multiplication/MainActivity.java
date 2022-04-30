package in.akshay.ak_multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    TextView t1;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.e1);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {

                    case R.id.b1:
                        StringBuffer buffer = new StringBuffer();
                        int res;

                        // get the input number from editText
                        String fs = e1.getText().toString();

                        // convert it to integer
                        int n = Integer.parseInt(fs);

                        // build the logic for table
                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);
                            buffer.append(n + " X " + i + " = " + ans + "\n\n");
                        }

                        t1.setText(buffer);
                        break;
                }
            }
        });
    }
}