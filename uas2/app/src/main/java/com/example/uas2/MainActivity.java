package com.example.uas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final int WalcomeSreanDisplay = 3000;
        Thread welcomeThred = new Thread(){

            int wait = 0;
            @Override
            public void  run () {
                try{
                    super.run();
                    while (wait < WalcomeSreanDisplay){
                        sleep(  100);
                        wait += 100;

                    }
                }   catch (Exception e){
                    System.out.println("EXc="  +e);
                }   finally {
                    Intent j = new Intent( MainActivity.this,Main2Activity.class);
                    Intent i = new Intent( MainActivity.this,MainActivity.class);

                    finish();
                    startActivity(j);
                }
            }
        };
        welcomeThred.start();
    }

}

