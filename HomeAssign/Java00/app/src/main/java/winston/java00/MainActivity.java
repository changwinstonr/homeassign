package winston.java00;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


   final Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        final TextView textView = (TextView) findViewById(R.id.textView);

        View.OnClickListener BlueBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView PressBlueBtn = (TextView) findViewById(R.id.button1);
                textView.setTextColor(Color.BLUE);}
            };
                View.OnClickListener MagBtn = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView PressMagBtn = (TextView) findViewById(R.id.button2);
                        textView.setTextColor(Color.MAGENTA);}
                    };
                        View.OnClickListener GreyBtn = new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                TextView PressGreyBtn = (TextView) findViewById(R.id.button3);
                                textView.setTextColor(Color.GRAY);}
                            };
        button1.setOnClickListener(BlueBtn);
        button2.setOnClickListener(MagBtn);
        button3.setOnClickListener(GreyBtn);
                        }
    }
