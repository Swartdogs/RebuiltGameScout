package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


//After the first competition, we decided to only count the inner and outer
//goals as the top goal instead of separating them. When scouting, it was too
//hard to distinguish whether it hit the inner or outer.

//We also decided we did not need the cycle time data, so the Cycle Counter
//buttons were deleted. The same was true for the Crossing through the shield generator.

//The code for the above deleted was commented and not deleted.

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection

    public static String RobotTip = "false";
    public static String RobotStall = "false";
    public static String Defense = "false";
    public static String Fouls = "false";
    public static int teleCoralL4 = 0;
    public static int teleCoralL3 = 0;
    public static int teleCoralL2 = 0;
    public static int teleCoralL1 = 0;
    public static int teleProcessed = 0;
    public static String teleAlgaeKnockedOff = "false";
    public static int teleRobotNet = 0;
    public static String Team_Num_Display = "0000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        TextView TeamNumTeleop = (TextView) findViewById(R.id.TeamNumTeleopTV);
        Intent intent2 = getIntent();
        String teleopteamnumstring = intent2.getStringExtra(data_collection_TeleOP.Team_Num_Display);
        TeamNumTeleop.setText(teleopteamnumstring);

        //Defines all checkboxes
        final CheckBox RobotTipCB = (CheckBox) findViewById(R.id.tipped_CB);
        final CheckBox RobotStallCB = (CheckBox) findViewById(R.id.stalled_CB);
        final CheckBox DefenseCB = (CheckBox) findViewById(R.id.defense_CB);
        final CheckBox FoulsCB = (CheckBox) findViewById(R.id.foul_CB);
        final CheckBox teleAlgaeKnockedOffCB = (CheckBox) findViewById(R.id.teleOpKnockedOff_CB);

        //Defines all buttons
        //Coral Buttons
        final Button teleCoralL4Plus = (Button) findViewById(R.id.teleOpCoralL4Plus_GB);
        final Button teleCoralL4Minus = (Button) findViewById(R.id.teleOpCoralL4Minus_GB);
        final Button teleCoralL3Plus = (Button) findViewById(R.id.teleOpCoralL3Plus_GB);
        final Button teleCoralL3Minus = (Button) findViewById(R.id.teleOpCoralL3Minus_GB);
        final Button teleCoralL2Plus = (Button) findViewById(R.id.teleOpCoralL2Plus_GB);
        final Button teleCoralL2Minus = (Button) findViewById(R.id.teleOpCoralL2Minus_GB);
        final Button teleCoralL1Plus = (Button) findViewById(R.id.teleOpCoralL1Plus_GB);
        final Button teleCoralL1Minus = (Button) findViewById(R.id.teleOpCoralL1Minus_GB);

        //Algae Buttons
        final Button teleProcessedPlus = (Button) findViewById(R.id.teleOpProcessedAlgaePlus_GB2);
        final Button teleProcessedMinus = (Button) findViewById(R.id.teleOpProcessedAlgaeMinus_GB2);
        final Button teleRobotNetPlus = (Button) findViewById(R.id.teleOpNetAlgaePlus_GB);
        final Button teleRobotNetMinus = (Button) findViewById(R.id.teleOpNetAlgaeMinus_GB);

        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.toSubmission);

        TextView teleL4Text = (TextView) findViewById(R.id.teleOpCoralL4Scored_TV);
        TextView teleL3Text = (TextView) findViewById(R.id.teleOpCoralL3Scored_TV);
        TextView teleL2Text = (TextView) findViewById(R.id.teleOpCoralL2Scored_TV);
        TextView teleL1Text = (TextView) findViewById(R.id.teleOpCoralL1Scored_TV);
        TextView teleProcessedText = (TextView) findViewById(R.id.teleOpAlgaeScoredProcessed_TV3);
        TextView teleRobotNetText = (TextView) findViewById(R.id.teleOpAlgaeScoredNet_TV2);


        teleCoralL4Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleCoralL4 += 1;
                teleL4Text.setText(teleCoralL4);
            }});

        teleCoralL4Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL4 > 0) {
                    teleCoralL4 -= 1;
                    teleL4Text.setText(teleCoralL4);
                }
            }});

        teleCoralL3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleCoralL3 += 1;
                teleL3Text.setText(teleCoralL3);
            }});

        teleCoralL3Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL3 > 0) {
                    teleCoralL3 -= 1;
                    teleL3Text.setText(teleCoralL3);
                }
            }});

        teleCoralL2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleCoralL2 += 1;
                teleL2Text.setText(teleCoralL2);
            }});

        teleCoralL2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL2 > 0) {
                    teleCoralL2 -= 1;
                    teleL2Text.setText(teleCoralL2);
                }
            }});

        teleCoralL1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleCoralL1 += 1;
                teleL1Text.setText(teleCoralL1);
            }});

        teleCoralL1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL1 > 0) {
                    teleCoralL1 -= 1;
                    teleL1Text.setText(teleCoralL1);
                }
            }});

        teleProcessedPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleProcessed += 1;
                teleProcessedText.setText(teleProcessed);
            }});

        teleProcessedMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleProcessed > 0) {
                    teleProcessed -= 1;
                    teleProcessedText.setText(teleProcessed);
                }
            }});

        teleRobotNetPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teleRobotNet += 1;
                teleRobotNetText.setText(teleRobotNet);
            }});

        teleRobotNetMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleRobotNet > 0) {
                    teleRobotNet -= 1;
                    teleRobotNetText.setText(teleRobotNet);
                }
            }});



        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
           @Override
           public void onClick(View v) {

                if (RobotTipCB.isChecked()) {
                    RobotTip = "True";
                }
                if (RobotStallCB.isChecked()) {
                    RobotStall = "True";
                }
                if (DefenseCB.isChecked()) {
                    Defense = "True";
                }
                if (FoulsCB.isChecked()) {
                    Fouls = "True";
                }
                if (teleAlgaeKnockedOffCB.isChecked()) {
                    teleAlgaeKnockedOff = "True";
                }
                    Intent teamnumintent = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                    teamnumintent.putExtra(Team_Num_Display, teleopteamnumstring);
                    startActivity (teamnumintent);
                    //Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    //startActivity(startintent);
                }

        });
    }
}
