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



public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
   // public static String Taxi_Yes = "False";
   // public static String Taxi_No = "False";
   // public static String AutoUpperhubScore = "0";
  //  public static String AutoUpperhubMiss = "0";
    public static int autoCoralL4 = 0;
    public static int autoCoralL3 = 0;
    public static int autoCoralL2 = 0;
    public static int autoCoralL1 = 0;
    public static int autoProcessed = 0;
    public static String autoAlgaeKnockedOff = "false";
    public static String Team_Num_Display = "0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        TextView TeamNumSandy = (TextView) findViewById(R.id.TeamNumSandyTV);
        Intent teamnumintent = getIntent();
        String sandstormteamnumstring = teamnumintent.getStringExtra(Data_Collection_Page_1.Team_Num_Display);
        TeamNumSandy.setText(sandstormteamnumstring);

        // int Team_Num_Real = bundle.getInt("code");

        //Defines and implements Button to continue along with variable savings

        //Buttons for Coral
        final Button autoCoralL4Plus = (Button) findViewById(R.id.AutoCoralL4Plus_GB);
        final Button autoCoralL4Minus = (Button) findViewById(R.id.AutoCoralL4Minus_GB);
        final Button autoCoralL3Plus = (Button) findViewById(R.id.AutoCoralL3Plus_GB);
        final Button autoCoralL3Minus = (Button) findViewById(R.id.AutoCoralL3Minus_GB);
        final Button autoCoralL2Plus = (Button) findViewById(R.id.AutoCoralL2Plus_GB);
        final Button autoCoralL2Minus = (Button) findViewById(R.id.AutoCoralL2Minus_GB);
        final Button autoCoralL1Plus = (Button) findViewById(R.id.AutoCoralL1Plus_GB);
        final Button autoCoralL1Minus = (Button) findViewById(R.id.AutoCoralL1Minus_GB);

        //Algae Buttons
        final Button autoProcessedPlus = (Button) findViewById(R.id.autoAlgaePlus_GB4);
        final Button autoProcessedMinus = (Button) findViewById(R.id.autoAlgaeMinus_GB4);

        //Algae CB
        final CheckBox autoAlgaeKnockedOffCB = (CheckBox) findViewById(R.id.AutoKnockedOff_CB);

        //Button to move to next page
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);

        TextView autoL4Text = (TextView) findViewById(R.id.AutoCoralL4Scored_TV);
        TextView autoL3Text = (TextView) findViewById(R.id.AutoCoralL3Scored_TV);
        TextView autoL2Text = (TextView) findViewById(R.id.AutoCoralL2Scored_TV);
        TextView autoL1Text = (TextView) findViewById(R.id.AutoCoralL1Scored_TV);
        TextView autoProcessedText = (TextView) findViewById(R.id.autoAlgaeScored_TV);

        autoCoralL4Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoCoralL4 += 1;
                autoL4Text.setText(String.valueOf(autoCoralL4));
            }});


        autoCoralL4Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoCoralL4 > 0) {
                    autoCoralL4 -= 1;
                    autoL4Text.setText(String.valueOf(autoCoralL4));
                }

            }});

        autoCoralL3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoCoralL3 += 1;
                autoL3Text.setText(String.valueOf(autoCoralL3));
            }});


        autoCoralL3Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoCoralL3 > 0) {
                    autoCoralL3 -= 1;
                    autoL3Text.setText(String.valueOf(autoCoralL3));
                }

            }});

        autoCoralL2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoCoralL2 += 1;
                autoL2Text.setText(String.valueOf(autoCoralL2));
            }});


        autoCoralL2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoCoralL2 > 0) {
                    autoCoralL2 -= 1;
                    autoL2Text.setText(String.valueOf(autoCoralL2));
                }

            }});

        autoCoralL1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoCoralL1 += 1;
                autoL1Text.setText(String.valueOf(autoCoralL1));
            }});


        autoCoralL1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoCoralL1 > 0) {
                    autoCoralL1 -= 1;
                    autoL1Text.setText(String.valueOf(autoCoralL1));
                }

            }});

        autoProcessedPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoProcessed += 1;
                autoProcessedText.setText(String.valueOf(autoProcessed));
            }});



        autoProcessedMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autoProcessed > 0) {
                    autoProcessed -= 1;
                    autoProcessedText.setText(String.valueOf(autoProcessed));
                }

            }});

        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                /*AutoAmpAttempt = Integer.toString(Integer.parseInt(AutoAmpAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpAttempt));
                AutoAmpScore = Integer.toString(Integer.parseInt(AutoAmpScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpScore));
                AutoSpeakerAttempt = Integer.toString(Integer.parseInt(AutoSpeakerAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerAttempt));
                AutoSpeakerScore = Integer.toString(Integer.parseInt(AutoSpeakerScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerScore));
                */

                if (autoAlgaeKnockedOffCB.isChecked()) {
                    autoAlgaeKnockedOff = "true";
                }

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
