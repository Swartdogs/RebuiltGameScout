package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//After the first competition, we decided to only count the inner and outer
//goals as the top goal instead of separating them. When scouting, it was too
//hard to distinguish whether it hit the inner or outer.

//We also decided we did not need the cycle time data, so the Cycle Counter
//buttons were deleted. The same was true for the Crossing through the shield generator.

//The code for the above deleted was commented and not deleted.

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection

    public static String RobotTip = "False";
    public static String RobotStall = "False";
    public static String Defense = "False";
    public static String Fouls = "False";
    public static int teleCoralL4 = 0;
    public static int teleCoralL3 = 0;
    public static int teleCoralL2 = 0;
    public static int teleCoralL1 = 0;
    public static int teleProcessed = 0;
    public static int teleAlgaeKnockedOff = 0;
    public static String teleAlgaeMissed = "False";
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
        final Button RobotTipB = (Button) findViewById(R.id.teleOp_tipped_B);
        final Button RobotStallB = (Button) findViewById(R.id.teleOp_stalled_B);
        final Button DefenseB = (Button) findViewById(R.id.teleOp_Defense_B);
        final Button FoulsB = (Button) findViewById(R.id.teleOp_fouled_B);
        final Button Names = (Button) findViewById(R.id.nos);
        final Button teleOpNetAlgaeMissedB = (Button) findViewById(R.id.teleOp_missed_B);

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
        final Button teleRobotNetPlus = (Button) findViewById(R.id.teleOpNetAlgaePlus_GB2);
        final Button teleRobotNetMinus = (Button) findViewById(R.id.teleOpNetAlgaeMinus_GB2);
        final Button teleOpKnockedOffPlus = (Button) findViewById(R.id.teleOpKnockedOffPlus_GB);
        final Button teleOpKnockedOffMinus = (Button) findViewById(R.id.teleOpKockedOffMinus_GB);

        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.toSubmission);

        TextView teleL4Text = (TextView) findViewById(R.id.teleOpCoralL4Scored_TV);
        TextView teleL3Text = (TextView) findViewById(R.id.teleOpCoralL3Scored_TV);
        TextView teleL2Text = (TextView) findViewById(R.id.teleOpCoralL2Scored_TV);
        TextView teleL1Text = (TextView) findViewById(R.id.teleOpCoralL1Scored_TV);
        TextView teleProcessedText = (TextView) findViewById(R.id.teleOpAlgaeScoredProcessed_TV3);
        TextView teleRobotNetText = (TextView) findViewById(R.id.teleOpAlgaeScoredNet_TV);
        TextView teleOpKnockedOffText = findViewById(R.id.teleOpKnockedOff_TV);

        RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
        RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.grey_button));
        DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.grey_button));
        FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.grey_button));

//        if (data_collection_end_game.RobotTip.equals("true")) {
//            RobotTip = "true";
//            RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.colorPrimary));
//            RobotTipB.setTag("#FFE600");
//        }
//        else {
//            RobotTip = "false";
//            RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
//            RobotTipB.setTag("D7D7D7D5");
//        }
//
//        if (data_collection_end_game.RobotStall.equals("true")) {
//            RobotStall = "true";
//            RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.colorPrimary));
//            RobotStallB.setTag("#FFE600");
//        }
//        else {
//            RobotStall = "false";
//            RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.grey_button));
//            RobotStallB.setTag("D7D7D7D5");
//        }
//
//        if (data_collection_end_game.Defense.equals("true")) {
//            Defense = "true";
//            DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.colorPrimary));
//            DefenseB.setTag("#FFE600");
//        }
//        else {
//            RobotStall = "false";
//            DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.grey_button));
//            DefenseB.setTag("D7D7D7D5");
//        }
//
//        if (data_collection_end_game.Fouls.equals("true")) {
//            Fouls = "true";
//            FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.colorPrimary));
//            FoulsB.setTag("#FFE600");
//        }
//        else {
//            Fouls = "false";
//            FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.grey_button));
//            FoulsB.setTag("D7D7D7D5");
//        }
//
//
        teleCoralL4Plus.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                if (teleCoralL4 < 12) {
                    teleCoralL4 += 1;
                    teleL4Text.setText(String.valueOf(teleCoralL4));
                }
            }});

        teleCoralL4Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL4 > 0) {
                    teleCoralL4 -= 1;
                    teleL4Text.setText(String.valueOf(teleCoralL4));
                }
            }});

        teleCoralL3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL3 < 12) {
                    teleCoralL3 += 1;
                    teleL3Text.setText(String.valueOf(teleCoralL3));
                }
            }});

        teleCoralL3Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL3 > 0) {
                    teleCoralL3 -= 1;
                    teleL3Text.setText(String.valueOf(teleCoralL3));
                }
            }});

        teleCoralL2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL2 < 12) {
                    teleCoralL2 += 1;
                    teleL2Text.setText(String.valueOf(teleCoralL2));
                }
            }});

        teleCoralL2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL2 > 0) {
                    teleCoralL2 -= 1;
                    teleL2Text.setText(String.valueOf(teleCoralL2));
                }
            }});

        teleCoralL1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL1 < 50) {
                    teleCoralL1 += 1;
                    teleL1Text.setText(String.valueOf(teleCoralL1));
                }
            }});

        teleCoralL1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleCoralL1 > 0) {
                    teleCoralL1 -= 1;
                    teleL1Text.setText(String.valueOf(teleCoralL1));
                }
            }});

        teleProcessedPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleProcessed < 18) {
                    teleProcessed += 1;
                    teleProcessedText.setText(String.valueOf(teleProcessed));
                }
            }});

        teleProcessedMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleProcessed > 0) {
                    teleProcessed -= 1;
                    teleProcessedText.setText(String.valueOf(teleProcessed));
                }
            }});

        teleRobotNetPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleRobotNet < 18) {
                    teleRobotNet += 1;
                    teleRobotNetText.setText(String.valueOf(teleRobotNet));
                }
            }});

        teleRobotNetMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleRobotNet > 0) {
                    teleRobotNet -= 1;
                    teleRobotNetText.setText(String.valueOf(teleRobotNet));
                }
            }});

        teleOpKnockedOffPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleAlgaeKnockedOff < 6) {
                    teleAlgaeKnockedOff += 1;
                    teleOpKnockedOffText.setText(String.valueOf(teleAlgaeKnockedOff));
                }
            }});

        teleOpKnockedOffMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teleAlgaeKnockedOff > 0) {
                    teleAlgaeKnockedOff -= 1;
                    teleOpKnockedOffText.setText(String.valueOf(teleAlgaeKnockedOff));
                }
            }});
//        teleOpKnockedOffB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String colorCode = (String) teleOpKnockedOffB.getTag();
//                if ("#FFE600".equals(colorCode)){
//                    teleOpKnockedOffB.setBackgroundColor(ContextCompat.getColor(teleOpKnockedOffB.getContext(), R.color.grey_button));
//                    teleOpKnockedOffB.setTag("#000000");
//                    teleAlgaeKnockedOff = "false";
//                }
//                else{
//                    teleOpKnockedOffB.setBackgroundColor(ContextCompat.getColor(teleOpKnockedOffB.getContext(), R.color.white)) ;
//                    teleOpKnockedOffB.setTag("#FFE600");
//                    teleAlgaeKnockedOff = "true";
//                }
//
//            }
//
//        });
//        teleOpKnockedOffB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String colorCode = (String) teleOpKnockedOffB.getTag();
//                if (!"#FFE600".equals(colorCode)){
//                    teleOpKnockedOffB.setBackgroundColor(ContextCompat.getColor(teleOpKnockedOffB.getContext(), R.color.colorPrimary));
//                    teleOpKnockedOffB.setTag("#FFE600");
//                    teleAlgaeKnockedOff = "true";
//
//
//                }
//                else if("#FFE600".equals(colorCode)){
//                    teleOpKnockedOffB.setBackgroundColor(ContextCompat.getColor(teleOpKnockedOffB.getContext(), R.color.grey_button));
//                    teleOpKnockedOffB.setTag("D7D7D7D5");
//                    teleAlgaeKnockedOff = "false";
//                }
//
//            }
//
//        });


        RobotTipB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) RobotTipB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.colorPrimary));
                    RobotTipB.setTag("#FFE600");
                    RobotTip = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
                    RobotTipB.setTag("D7D7D7D5");
                    RobotTip= "false";
                }

            }

        });

        RobotStallB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) RobotStallB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.colorPrimary));
                    RobotStallB.setTag("#FFE600");
                    RobotStall = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.grey_button));
                    RobotStallB.setTag("D7D7D7D5");
                    RobotStall= "false";
                }

            }

        });

        //teleOpNetAlgaeMissedB
        teleOpNetAlgaeMissedB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) teleOpNetAlgaeMissedB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    teleOpNetAlgaeMissedB.setBackgroundColor(ContextCompat.getColor(teleOpNetAlgaeMissedB.getContext(), R.color.colorPrimary));
                    teleOpNetAlgaeMissedB.setTag("#FFE600");
                    teleAlgaeMissed = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    teleOpNetAlgaeMissedB.setBackgroundColor(ContextCompat.getColor(teleOpNetAlgaeMissedB.getContext(), R.color.grey_button));
                    teleOpNetAlgaeMissedB.setTag("D7D7D7D5");
                    teleAlgaeMissed= "false";
                }

            }

        });

        DefenseB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) DefenseB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.colorPrimary));
                    DefenseB.setTag("#FFE600");
                    Defense = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.grey_button));
                    DefenseB.setTag("D7D7D7D5");
                    Defense= "false";
                }

            }

        });

        FoulsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) FoulsB.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.colorPrimary));
                    FoulsB.setTag("#FFE600");
                    Names.setTag("D7D7D7D5");
                    Fouls = "true";

                }
            }

        });


        Names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) Names.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    Names.setBackgroundColor(ContextCompat.getColor(Names.getContext(), R.color.colorPrimary));
                    Names.setTag("#FFE600");
                    FoulsB.setTag("D7D7D7D5");
                    Fouls = "false";

                }
            }
        });

        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
           @Override
           public void onClick(View v) {




                    Intent teamnumintent = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                    teamnumintent.putExtra(Team_Num_Display, teleopteamnumstring);
                    startActivity (teamnumintent);
                    //Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    //startActivity(startintent);
                }

        });
    }
}
