package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.TextView;



public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static int autoCoralL4 = 0;
    public static int autoCoralL3 = 0;
    public static int autoCoralL2 = 0;
    public static int autoCoralL1 = 0;
    public static int autoProcessed = 0;
    public static String autoAlgaeKnockedOff = "False";
    public static String autoMoved = "False";
    public static String Team_Num_Display = "0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        TextView TeamNumSandy = findViewById(R.id.TeamNumSandyTV);
        Intent teamnumintent = getIntent();
        String sandstormteamnumstring = teamnumintent.getStringExtra(Data_Collection_Page_1.Team_Num_Display);
        TeamNumSandy.setText(sandstormteamnumstring);

        // int Team_Num_Real = bundle.getInt("code");

        //Defines and implements Button to continue along with variable savings

        //Buttons for Coral
        final Button autoCoralL4Plus = findViewById(R.id.AutoCoralL4Plus_GB);
        final Button autoCoralL4Minus = findViewById(R.id.AutoCoralL4Minus_GB);
        final Button autoCoralL3Plus = findViewById(R.id.AutoCoralL3Plus_GB);
        final Button autoCoralL3Minus = findViewById(R.id.AutoCoralL3Minus_GB);
        final Button autoCoralL2Plus = findViewById(R.id.AutoCoralL2Plus_GB);
        final Button autoCoralL2Minus = findViewById(R.id.AutoCoralL2Minus_GB);
        final Button autoCoralL1Plus = findViewById(R.id.AutoCoralL1Plus_GB);
        final Button autoCoralL1Minus = findViewById(R.id.AutoCoralL1Minus_GB);

        final Button autoMovedB = findViewById(R.id.autoMovedFromStart_B);
        autoMovedB.setTag("D7D7D7D5");
        final Button autoAlgaeKnockedOffB = findViewById(R.id.autoKnockedOff_B);
        autoAlgaeKnockedOffB.setTag("#D7D7D7D5");

        //Algae Buttons
        final Button autoProcessedPlus = findViewById(R.id.autoAlgaePlus_GB4);
        final Button autoProcessedMinus = findViewById(R.id.autoAlgaeMinus_GB4);


        //Button to move to next page
        Button To_TeleOp = findViewById(R.id.To_Teleop);

        TextView autoL4Text = findViewById(R.id.AutoCoralL4Scored_TV);
        TextView autoL3Text = findViewById(R.id.AutoCoralL3Scored_TV);
        TextView autoL2Text = findViewById(R.id.AutoCoralL2Scored_TV);
        TextView autoL1Text = findViewById(R.id.AutoCoralL1Scored_TV);
        TextView autoProcessedText = findViewById(R.id.autoAlgaeScored_TV);

        autoCoralL4Plus.setOnClickListener(view -> {
            if (autoCoralL4 < 12) {
                autoCoralL4 += 1;
                autoL4Text.setText(String.valueOf(autoCoralL4));
            }
        });


        autoCoralL4Minus.setOnClickListener(view -> {
            if (autoCoralL4 > 0) {
                autoCoralL4 -= 1;
                autoL4Text.setText(String.valueOf(autoCoralL4));
            }

        });

        autoCoralL3Plus.setOnClickListener(view -> {
            if (autoCoralL3 < 12) {
                autoCoralL3 += 1;
                autoL3Text.setText(String.valueOf(autoCoralL3));
            }
        });


        autoCoralL3Minus.setOnClickListener(view -> {
            if (autoCoralL3 > 0) {
                autoCoralL3 -= 1;
                autoL3Text.setText(String.valueOf(autoCoralL3));
            }

        });

        autoCoralL2Plus.setOnClickListener(view -> {
            if (autoCoralL2 < 12) {
                autoCoralL2 += 1;
                autoL2Text.setText(String.valueOf(autoCoralL2));
            }
        });


        autoCoralL2Minus.setOnClickListener(view -> {
            if (autoCoralL2 > 0) {
                autoCoralL2 -= 1;
                autoL2Text.setText(String.valueOf(autoCoralL2));
            }

        });

        autoCoralL1Plus.setOnClickListener(view -> {
            if (autoCoralL1 < 50) {
                autoCoralL1 += 1;
                autoL1Text.setText(String.valueOf(autoCoralL1));
            }

        });


        autoCoralL1Minus.setOnClickListener(view -> {
            if (autoCoralL1 > 0) {
                autoCoralL1 -= 1;
                autoL1Text.setText(String.valueOf(autoCoralL1));
            }

        });

        autoProcessedPlus.setOnClickListener(view -> {
            if (autoProcessed < 18) {
                autoProcessed++;
                autoProcessedText.setText(String.valueOf(autoProcessed));
            }
        });



        autoProcessedMinus.setOnClickListener(view -> {
            if (autoProcessed > 0) {
                autoProcessed -= 1;
                autoProcessedText.setText(String.valueOf(autoProcessed));
            }

        });
        autoMovedB.setOnClickListener(view -> {
             String colorCode = (String) autoMovedB.getTag();
             if (!"#FFE600".equals(colorCode)){
                 autoMovedB.setBackgroundColor(ContextCompat.getColor(autoMovedB.getContext(), R.color.colorPrimary));
                 autoMovedB.setTag("#FFE600");
                 autoMoved = "true";


                 }
             else if("#FFE600".equals(colorCode)){
                 autoMovedB.setBackgroundColor(ContextCompat.getColor(autoMovedB.getContext(), R.color.grey_button));
                 autoMovedB.setTag("D7D7D7D5");
                 autoMoved = "false";
                 }

        });
        autoAlgaeKnockedOffB.setOnClickListener(view -> {
            String colorCode = (String) autoAlgaeKnockedOffB.getTag();
            if (!"#FFE600".equals(colorCode)){
                autoAlgaeKnockedOffB.setBackgroundColor(ContextCompat.getColor(autoAlgaeKnockedOffB.getContext(), R.color.colorPrimary));
                autoAlgaeKnockedOffB.setTag("#FFE600");
                autoAlgaeKnockedOff = "true";


            }
            else if("#FFE600".equals(colorCode)){
                autoAlgaeKnockedOffB.setBackgroundColor(ContextCompat.getColor(autoAlgaeKnockedOffB.getContext(), R.color.grey_button));
                autoAlgaeKnockedOffB.setTag("D7D7D7D5");
                autoAlgaeKnockedOff = "false";
            }

        });

        //Makes onclick listener for button
        To_TeleOp.setOnClickListener(view -> {



            //add in data collection pieces from checkboxes
            Intent teamnumintent1 = new Intent(data_Collection_sandstorm.this, data_collection_TeleOP.class);
            teamnumintent1.putExtra(Team_Num_Display, sandstormteamnumstring);
            startActivity(teamnumintent1);
            //Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
            //startActivity(startintent);
        });
    }
}