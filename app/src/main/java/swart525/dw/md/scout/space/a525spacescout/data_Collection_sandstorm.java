package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
   // public static String Taxi_Yes = "False";
   // public static String Taxi_No = "False";
   // public static String AutoUpperhubScore = "0";
  //  public static String AutoUpperhubMiss = "0";
    public static String AutoAmpScore = "0";
    public static String AutoAmpAttempt = "0";
    public static String AutoSpeakerScore = "0";
    public static String AutoSpeakerAttempt = "0";
    public static String Add_AutoAmpScore = "0";
    public static String Add_AutoAmpAttempt = "0";
    public static String Add_AutoSpeakerScore = "0";
    public static String Add_AutoSpeakerAttempt = "0";
    public static String Team_Num_Display = "NA";
    public static Integer CenterOneAttempt = 0;
    public static Integer CenterTwoAttempt = 0;
    public static Integer CenterThreeAttempt = 0;
    public static Integer CenterFourAttempt = 0;
    public static Integer CenterFiveAttempt = 0;
    public static Integer RedOneAttempt = 0;
    public static Integer RedTwoAttempt = 0;
    public static Integer RedThreeAttempt = 0;
    public static Integer BlueOneAttempt = 0;
    public static Integer BlueTwoAttempt = 0;
    public static Integer BlueThreeAttempt = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        TextView TeamNumSandy = (TextView) findViewById(R.id.TeamNumSandyTV);
        Intent teamnumintent = getIntent();
        String sandstormteamnumstring = teamnumintent.getStringExtra(Data_Collection_Page_1.Team_Num_Display);
        TeamNumSandy.setText(sandstormteamnumstring);

        // int Team_Num_Real = bundle.getInt("code");

        //Defines "Elegant" Number Blocks
        final ElegantNumberButton AutoAmpAttemptedEB = (ElegantNumberButton) findViewById(R.id.Auto_Amp_Attempted_EB);
        final ElegantNumberButton AutoSpeakerAttemptedEB = (ElegantNumberButton) findViewById(R.id.Auto_Speaker_Attempted_EB);
        final ElegantNumberButton AutoAmpScoredEB = (ElegantNumberButton) findViewById(R.id.Auto_Amp_Scored_EB);
        final ElegantNumberButton AutoSpeakerScoredEB = (ElegantNumberButton) findViewById(R.id.Auto_Speaker_Scored_EB);

        //Defines and implements Button to continue along with variable savings
        Button CenterOneAttemptB = (Button) findViewById(R.id.Center_Ring_One_B);
        Button CenterTwoAttemptB = (Button) findViewById(R.id.Center_Ring_Two_B);
        Button CenterThreeAttemptB = (Button) findViewById(R.id.Center_Ring_Three_B);
        Button CenterFourAttemptB = (Button) findViewById(R.id.Center_Ring_Four_B);
        Button CenterFiveAttemptB = (Button) findViewById(R.id.Center_Ring_Five_B);

        Button RedOneAttemptB = (Button) findViewById(R.id.Red_Ring_One_B);
        Button RedTwoAttemptB = (Button) findViewById(R.id.Red_Ring_Two_B);
        Button RedThreeAttemptB = (Button) findViewById(R.id.Red_Ring_Three_B);

        Button BlueOneAttemptB = (Button) findViewById(R.id.Blue_Ring_One_B);
        Button BlueTwoAttemptB = (Button) findViewById(R.id.Blue_Ring_Two_B);
        Button BlueThreeAttemptB = (Button) findViewById(R.id.Blue_Ring_Three_B);


        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);

        CenterOneAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CenterOneAttempt+=1;

                if (data_Collection_sandstorm.CenterOneAttempt%3==0) {
                    CenterOneAttemptB.setBackgroundResource(R.color.gREY);
                    CenterOneAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.CenterOneAttempt%3==1) {
                    CenterOneAttemptB.setBackgroundResource(R.color.colorRed);
                    CenterOneAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.CenterOneAttempt%3==2) {
                    CenterOneAttemptB.setBackgroundResource(R.color.colorGreen);
                    CenterOneAttemptB.setText("Picked Up");

                }
            }
        });
        CenterTwoAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CenterTwoAttempt+=1;

                if (data_Collection_sandstorm.CenterTwoAttempt%3==0) {
                    CenterTwoAttemptB.setBackgroundResource(R.color.gREY);
                    CenterTwoAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.CenterTwoAttempt%3==1) {
                    CenterTwoAttemptB.setBackgroundResource(R.color.colorRed);
                    CenterTwoAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.CenterTwoAttempt%3==2) {
                    CenterTwoAttemptB.setBackgroundResource(R.color.colorGreen);
                    CenterTwoAttemptB.setText("Picked Up");

                }
            }
        });
        CenterThreeAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CenterThreeAttempt+=1;

                if (data_Collection_sandstorm.CenterThreeAttempt%3==0) {
                    CenterThreeAttemptB.setBackgroundResource(R.color.gREY);
                    CenterThreeAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.CenterThreeAttempt%3==1) {
                    CenterThreeAttemptB.setBackgroundResource(R.color.colorRed);
                    CenterThreeAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.CenterThreeAttempt%3==2) {
                    CenterThreeAttemptB.setBackgroundResource(R.color.colorGreen);
                    CenterThreeAttemptB.setText("Picked Up");

                }
            }
        });
        CenterFourAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CenterFourAttempt+=1;

                if (data_Collection_sandstorm.CenterFourAttempt%3==0) {
                    CenterFourAttemptB.setBackgroundResource(R.color.gREY);
                    CenterFourAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.CenterFourAttempt%3==1) {
                    CenterFourAttemptB.setBackgroundResource(R.color.colorRed);
                    CenterFourAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.CenterFourAttempt%3==2) {
                    CenterFourAttemptB.setBackgroundResource(R.color.colorGreen);
                    CenterFourAttemptB.setText("Picked Up");

                }
            }
        });
        CenterFiveAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CenterFiveAttempt+=1;

                if (data_Collection_sandstorm.CenterFiveAttempt%3==0) {
                    CenterFiveAttemptB.setBackgroundResource(R.color.gREY);
                    CenterFiveAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.CenterFiveAttempt%3==1) {
                    CenterFiveAttemptB.setBackgroundResource(R.color.colorRed);
                    CenterFiveAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.CenterFiveAttempt%3==2) {
                    CenterFiveAttemptB.setBackgroundResource(R.color.colorGreen);
                    CenterFiveAttemptB.setText("Picked Up");

                }
            }
        });
        RedOneAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedOneAttempt+=1;

                if (data_Collection_sandstorm.RedOneAttempt%3==0) {
                    RedOneAttemptB.setBackgroundResource(R.color.gREY);
                    RedOneAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.RedOneAttempt%3==1) {
                    RedOneAttemptB.setBackgroundResource(R.color.colorRed);
                    RedOneAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.RedOneAttempt%3==2) {
                    RedOneAttemptB.setBackgroundResource(R.color.colorGreen);
                    RedOneAttemptB.setText("Picked Up");

                }
            }
        });
        RedTwoAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedTwoAttempt+=1;

                if (data_Collection_sandstorm.RedTwoAttempt%3==0) {
                    RedTwoAttemptB.setBackgroundResource(R.color.gREY);
                    RedTwoAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.RedTwoAttempt%3==1) {
                    RedTwoAttemptB.setBackgroundResource(R.color.colorRed);
                    RedTwoAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.RedTwoAttempt%3==2) {
                    RedTwoAttemptB.setBackgroundResource(R.color.colorGreen);
                    RedTwoAttemptB.setText("Picked Up");

                }
            }
        });
        RedThreeAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedThreeAttempt+=1;

                if (data_Collection_sandstorm.RedThreeAttempt%3==0) {
                    RedThreeAttemptB.setBackgroundResource(R.color.gREY);
                    RedThreeAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.RedThreeAttempt%3==1) {
                    RedThreeAttemptB.setBackgroundResource(R.color.colorRed);
                    RedThreeAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.RedThreeAttempt%3==2) {
                    RedThreeAttemptB.setBackgroundResource(R.color.colorGreen);
                    RedThreeAttemptB.setText("Picked Up");

                }
            }
        });
        BlueOneAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlueOneAttempt+=1;

                if (data_Collection_sandstorm.BlueOneAttempt%3==0) {
                    BlueOneAttemptB.setBackgroundResource(R.color.gREY);
                    BlueOneAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.BlueOneAttempt%3==1) {
                    BlueOneAttemptB.setBackgroundResource(R.color.colorRed);
                    BlueOneAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.BlueOneAttempt%3==2) {
                    BlueOneAttemptB.setBackgroundResource(R.color.colorGreen);
                    BlueOneAttemptB.setText("Picked Up");

                }
            }
        });
        BlueTwoAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlueTwoAttempt+=1;

                if (data_Collection_sandstorm.BlueTwoAttempt%3==0) {
                    BlueTwoAttemptB.setBackgroundResource(R.color.gREY);
                    BlueTwoAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.BlueTwoAttempt%3==1) {
                    BlueTwoAttemptB.setBackgroundResource(R.color.colorRed);
                    BlueTwoAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.BlueTwoAttempt%3==2) {
                    BlueTwoAttemptB.setBackgroundResource(R.color.colorGreen);
                    BlueTwoAttemptB.setText("Picked Up");

                }
            }
        });
        BlueThreeAttemptB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlueThreeAttempt+=1;

                if (data_Collection_sandstorm.BlueThreeAttempt%3==0) {
                    BlueThreeAttemptB.setBackgroundResource(R.color.gREY);
                    BlueThreeAttemptB.setText("No Attempt");
                }
                else if (data_Collection_sandstorm.BlueThreeAttempt%3==1) {
                    BlueThreeAttemptB.setBackgroundResource(R.color.colorRed);
                    BlueThreeAttemptB.setText("Attempted");
                }
                else if (data_Collection_sandstorm.BlueThreeAttempt%3==2) {
                    BlueThreeAttemptB.setBackgroundResource(R.color.colorGreen);
                    BlueThreeAttemptB.setText("Picked Up");

                }
            }
        });

        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                AutoAmpAttempt = Integer.toString(Integer.parseInt(AutoAmpAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpAttempt));
                AutoAmpScore = Integer.toString(Integer.parseInt(AutoAmpScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpScore));
                AutoSpeakerAttempt = Integer.toString(Integer.parseInt(AutoSpeakerAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerAttempt));
                AutoSpeakerScore = Integer.toString(Integer.parseInt(AutoSpeakerScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerScore));
                CenterOneAttempt = CenterOneAttempt%3;
                CenterTwoAttempt = CenterTwoAttempt%3;
                CenterThreeAttempt = CenterThreeAttempt%3;
                CenterFourAttempt = CenterFourAttempt%3;
                CenterFiveAttempt = CenterFiveAttempt%3;
                BlueOneAttempt = BlueOneAttempt%3;
                BlueTwoAttempt = BlueTwoAttempt%3;
                BlueThreeAttempt = BlueThreeAttempt%3;
                RedOneAttempt = RedOneAttempt%3;
                RedTwoAttempt = RedTwoAttempt%3;
                RedThreeAttempt = RedThreeAttempt%3;

                //Intent intent2 = new Inte
                // nt(data_Collection_sandstorm.this, data_collection_TeleOP.class);
               // intent2.putExtra(Team_Num_Display2, sandstormteamnumstring);
                //startActivity(intent2);
                /*add in data collection pieces from checkboxes*/
                Intent teamnumintent = new Intent(data_Collection_sandstorm.this, data_collection_TeleOP.class);
                teamnumintent.putExtra(Team_Num_Display, sandstormteamnumstring);
                startActivity(teamnumintent);
                //Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                //startActivity(startintent);
            }
        });

    }

}
