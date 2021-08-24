package ru.koder71.multiplyiteasy;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class X8 extends AppCompatActivity {
    Brain brain = new Brain(8);

    Dialog table2;
    Dialog goodJob;
    Dialog notComplete;
    Dialog congratulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all);
        //create variable text_multiplicand
        TextView text_multiplicand = findViewById(R.id.text_multnum);
        text_multiplicand.setText(String.valueOf(brain.x));
        final TextView m1 = findViewById(R.id.multi1);
        m1.setText(String.valueOf(brain.x));

        //congratulation dialog start
        congratulation = new Dialog(this);
        congratulation.requestWindowFeature(Window.FEATURE_NO_TITLE);
        congratulation.setContentView(R.layout.knowdialog);
        congratulation.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        congratulation.setCancelable(false);
        TextView know = congratulation.findViewById(R.id.textView11);
        know.setText(R.string.you_know_8);


        //dialog window
        table2 = new Dialog(this); //create new window
        table2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        table2.setContentView(R.layout.remember);
        table2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        table2.setCancelable(false);//button back off
        ImageView previewimg = (ImageView) table2.findViewById(R.id.imageView2);
        previewimg.setImageResource(R.drawable.mult_table8);

        TextView res = findViewById(R.id.res);
        //I remember button start
        Button btnIremember = (Button) table2.findViewById(R.id.buttonIremember);
        btnIremember.setOnClickListener(new View.OnClickListener() {
            //button press reaction start
            @Override
            public void onClick(View v) {
                TextView m2 = findViewById(R.id.multi2);
                m2.setText(R.string.quest);
                res.setText(String.valueOf(brain.x * (brain.numb.get(brain.r))));
                table2.dismiss();
            }
            //button press reaction end
        });
        table2.show();
        //I remember button end

        //good job dialog window
        goodJob = new Dialog(this); //create new window
        goodJob.requestWindowFeature(Window.FEATURE_NO_TITLE);
        goodJob.setContentView(R.layout.gooddialog);
        goodJob.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        goodJob.setCancelable(false);//button back off

        //you know dialog
        //ok button start
        Button btnok = (Button) goodJob.findViewById(R.id.buttonOk);
        btnok.setOnClickListener(new View.OnClickListener() {
            //button press reaction start
            int count = 0;
            final int[] progress = {
                    R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5,
                    R.id.point6, R.id.point7, R.id.point8};

            @Override
            public void onClick(View v) {
                TextView m2 = findViewById(R.id.multi2);
                if (brain.numb.size() >= 2 && count < 8) {
                    count++;
                    for (int i = 0; i < count; i++) {
                        TextView tv = findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points_green);
                    }
                    brain.numb.remove(brain.numb.get(brain.r));
                    brain.r = brain.rand.nextInt(brain.numb.size());
                    res.setText(String.valueOf(brain.multiPlyer()));
                    m2.setText(R.string.quest);
                    goodJob.dismiss();
                } else {
                    goodJob.dismiss();

                    congratulation.show();
                }
            }
            //button press reaction end
        });
        //Good dialog end


        //ok button start
        Button btngood = congratulation.findViewById(R.id.buttonOk);
        btngood.setOnClickListener(new View.OnClickListener() {
            //button press reaction start
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(X8.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                    //return back to choose multiplicand end
                } catch (Exception e) {
                }
            }

            //button press reaction end
        });
        //notcomplete dialog start
        notComplete = new Dialog(this);
        notComplete.requestWindowFeature(Window.FEATURE_NO_TITLE);
        notComplete.setContentView(R.layout.notcompletedialog);
        notComplete.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notComplete.setCancelable(false);

        //button back start
        Button btn_back2 = (Button) findViewById(R.id.button_back2);
        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button back reaction start
                if (brain.numb.size() >= 2) {
                    notComplete.show();
                } else {
                    try {
                        //return back to choose multiplicand start
                        Intent intent = new Intent(X8.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                        //return back to choose multiplicand end
                    } catch (Exception e) {
                    }
                }
                //button back reaction end
            }
        });
    }

    public void onClickNotCompl(View v) {
        switch (v.getId()) {
            case R.id.buttonYes:
                try {
                    //return back to choose multiplicand start
                    Intent intent = new Intent(X8.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                    //return back to choose multiplicand end
                } catch (Exception e) {
                }
                break;
            case R.id.buttonNo:
                notComplete.dismiss();
                break;
        }

        //button back end

    }

    //logic start
    public void onClickNum(View v) {
        TextView m2 = findViewById(R.id.multi2);


        switch (v.getId()) {

            case R.id.digit2:
                if (brain.numb.get(brain.r) == 2) {
                    m2.setText(String.valueOf(2));
                    goodJob.show();


                } else table2.show();
                break;
            case R.id.digit3:
                if (brain.numb.get(brain.r) == 3) {
                    m2.setText(String.valueOf(3));
                    goodJob.show();
                } else table2.show();
                break;

            case R.id.digit4:
                if (brain.numb.get(brain.r) == 4) {
                    m2.setText(String.valueOf(4));
                    goodJob.show();
                } else table2.show();
                break;
            case R.id.digit5:
                if (brain.numb.get(brain.r) == 5) {
                    m2.setText(String.valueOf(5));
                    goodJob.show();
                } else table2.show();
                break;
            case R.id.digit6:
                if (brain.numb.get(brain.r) == 6) {
                    m2.setText(String.valueOf(6));
                    goodJob.show();
                } else table2.show();
                break;
            case R.id.digit7:
                if (brain.numb.get(brain.r) == 7) {
                    m2.setText(String.valueOf(7));
                    goodJob.show();
                } else table2.show();
                break;
            case R.id.digit8:
                if (brain.numb.get(brain.r) == 8) {
                    m2.setText(String.valueOf(8));
                    goodJob.show();
                } else table2.show();
                break;
            case R.id.digit9:
                if (brain.numb.get(brain.r) == 9) {
                    m2.setText(String.valueOf(9));
                    goodJob.show();
                } else table2.show();
                break;
        }
    }
    //logic end

    //System button back start
    @Override
    public void onBackPressed() {
        //button back reaction start
        try {
            //return back to choose multiplicand start
            Intent intent = new Intent(X8.this, GameLevels.class);
            startActivity(intent);
            finish();
            //return back to choose multiplicand end
        } catch (Exception e) {
        }
        //button back reaction end
    }
    //System button back end

}




