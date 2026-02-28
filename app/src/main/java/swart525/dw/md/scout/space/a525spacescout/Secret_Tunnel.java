package swart525.dw.md.scout.space.a525spacescout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Secret_Tunnel extends AppCompatActivity {

    public static String SecretBlueOne = "False";
    public static String SecretBlueTwo = "False";
    public static String SecretBlueThree = "False";
    public static String SecretRedOne = "False";
    public static String SecretRedTwo = "False";
    public static String SecretRedThree = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_secret_tunnel);


        //Defines all buttons

        final Button SecretBlue1B = findViewById(R.id.One_Blue_B);
        final Button SecretBlue2B = findViewById(R.id.Two_Blue_B);
        final Button SecretBlue3B = findViewById(R.id.Three_Blue_B);
        final Button SecretRed1B = findViewById(R.id.One_Red_B);
        final Button SecretRed2B = findViewById(R.id.Two_Red_B);
        final Button SecretRed3B = findViewById(R.id.Three_Red_B);




        SecretBlue1B.setOnClickListener(view -> {

            SecretBlueOne = "True";
            SecretBlue1B.setText(SecretBlueOne);
        });

        SecretBlue2B.setOnClickListener(view -> {

            SecretBlueTwo = "True";
            SecretBlue2B.setText(SecretBlueTwo);
        });

        SecretBlue3B.setOnClickListener(view -> {

            SecretBlueThree = "True";
            SecretBlue3B.setText(SecretBlueThree);
        });

        SecretRed1B.setOnClickListener(view -> {

            SecretRedOne = "True";
            SecretRed1B.setText(SecretRedOne);
        });

        SecretRed2B.setOnClickListener(view -> {

            SecretRedTwo = "True";
            SecretRed2B.setText(SecretRedTwo);
        });

        SecretRed3B.setOnClickListener(view -> {

            SecretRedThree = "True";
            SecretRed3B.setText(SecretRedThree);
        });

        Button BackToStart = findViewById(R.id.Tunnel_Go_Back);
        BackToStart.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v)
            {
                if (SecretBlueOne.equals("True"))
                {
                    // This is where you set all names to Blue 1, and colour to Blue;

                }
                else if (SecretBlueTwo.equals("True"))
                {
                    // This is where you set all names to Blue 2, and colour to Blue;

                }
                else if (SecretBlueThree.equals("True"))
                {
                    // This is where you set all names to Blue 3, and colour to Blue;

                }
                else if (SecretRedOne.equals("True"))
                {
                    // This is where you set all names to Red 1, and colour to Red;

                }
                else if (SecretRedTwo.equals("True"))
                {
                    // This is where you set all names to Red 2, and colour to Red;

                }
                else if (SecretRedThree.equals("True"))
                {
                    // This is where you set all names to Red 3, and colour to Red;

                }

                //the freak down here is the problem line
                else {
                    Toast.makeText(Secret_Tunnel.this, "Crouch Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
    }