package ru.koder71.multiplyiteasy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }
            }
        });
        //Button goto x2 - begin
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x2 - end
        //Button goto x3 - begin
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x3 - end
        //Button goto x4 - begin
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X4.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x4 - end
        //Button goto x5 - begin
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X5.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x5 - end
        //Button goto x6 - begin
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X6.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x6 - end
        //Button goto x7 - begin
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X7.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x7 - end
        //Button goto x8 - begin
        TextView textView8 = findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X8.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x8 - end
        //Button goto x9 - begin
        TextView textView9 = findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, X9.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        //Button goto x9 - end
    }

    //System button "back"
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {
        }
    }
}