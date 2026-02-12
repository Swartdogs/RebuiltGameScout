package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


//After the first competition, we decided to only count the inner and outer
//goals as the top goal instead of separating them. When scouting, it was too
//hard to distinguish whether it hit the inner or outer.

//We also decided we did not need the cycle time data, so the Cycle Counter
//buttons were deleted. The same was true for the Crossing through the shield generator.

//The code for the above deleted was commented and not deleted.

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection

    public static String Tipped = "False";
    public static String Stall = "False";
    public static String DefenseActive = "False";
    public static String TeleAverageFuelScored = "Empty";
    public static String Fouls = "False";
    public static String DefenseInactive = "False";
    public static String ScoreFuel = "False";
    public static String FerryInactive = "False";
    public static String FerryActive = "False";
    public static String NoneInactive = "False";
    public static String NoneActive = "False";
    public static String Team_Num_Display = "0000";
    public static int cyclesTele = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        TextView TeamNumTeleop = (TextView) findViewById(R.id.TeamNumTeleopTV);
        Intent intent2 = getIntent();
        String teleopteamnumstring = intent2.getStringExtra(data_collection_TeleOP.Team_Num_Display);
        TeamNumTeleop.setText(teleopteamnumstring);

        //Defines all buttons

        final Button RobotTipB = (Button) findViewById(R.id.TeleTipped_B);
        final Button StallOtherB = (Button) findViewById(R.id.TeleStalled_B);
        final Button FouledOtherB = (Button) findViewById(R.id.TeleFouled_B);
        final Button DefenseInactiveB = (Button) findViewById(R.id.teleDefenseInactive_B);
        final RadioButton FuelAvg010RB = (RadioButton) findViewById(R.id.TeleCycles010_RB);
        final RadioButton FuelAvg1130RB = (RadioButton) findViewById(R.id.TeleCycles1130_RB);
        final RadioButton FuelAvg3150RB = (RadioButton) findViewById(R.id.TeleCycles3150_RB);
        final RadioButton FuelAvg5170RB = (RadioButton) findViewById(R.id.TeleCycles5170_RB);
        final RadioButton FuelAvg70PlusRB = (RadioButton) findViewById(R.id.TeleCyclesto71andbeyond_RB);
        final Button DefenceActiveB = (Button) findViewById(R.id.TeleDefenseActive_B);
        final Button FerryInactiveB = (Button) findViewById(R.id.teleFerryInactive_B);
        final Button FerryActiveB = (Button) findViewById(R.id.TeleFerryActive_B);
        final Button NoneInactiveB = (Button) findViewById(R.id.TeleNoneInactive_B);
        final Button NoneActiveB = (Button) findViewById(R.id.teleNoneActive_B);
        final Button ScoreFuelB = (Button) findViewById(R.id.TeleScoreFuelActive_B);
        final Button CyclePlus = (Button) findViewById(R.id.TeleCyclesPlus_GB);
        final Button CycleMinus = (Button) findViewById(R.id.TeleCyclesMinus_GB);

        //Defines all buttons
        //Coral Buttons
        //Below defines the button and commands for saving data and switching pages


        RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
        StallOtherB.setBackgroundColor(ContextCompat.getColor(StallOtherB.getContext(), R.color.grey_button));
        DefenseInactiveB.setBackgroundColor(ContextCompat.getColor(DefenseInactiveB.getContext(), R.color.grey_button));
        DefenceActiveB.setBackgroundColor(ContextCompat.getColor(DefenceActiveB.getContext(), R.color.grey_button));
        FerryInactiveB.setBackgroundColor(ContextCompat.getColor(FerryInactiveB.getContext(), R.color.grey_button));
        FerryActiveB.setBackgroundColor(ContextCompat.getColor(FerryActiveB.getContext(), R.color.grey_button));
        NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.grey_button));
        NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
        ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.grey_button));


        TextView CyclesText = findViewById(R.id.TeleCyclesScored_TV);


        CyclePlus.setOnClickListener(view -> {
            cyclesTele += 1;
            CyclesText.setText(String.valueOf(cyclesTele));
        });


        CycleMinus.setOnClickListener(view -> {
            cyclesTele -= 1;
            CyclesText.setText(String.valueOf(cyclesTele));
        });


        ScoreFuelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) ScoreFuelB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.colorPrimary));
                    ScoreFuelB.setTag("#FFE600");
                    ScoreFuel = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.grey_button));
                    ScoreFuelB.setTag("D7D7D7D5");
                    ScoreFuel= "false";
                }

            }

        });

        NoneActiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) NoneActiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.colorPrimary));
                    NoneActiveB.setTag("#FFE600");
                    NoneActive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
                    NoneActiveB.setTag("D7D7D7D5");
                    NoneActive= "false";
                }

            }

        });

        NoneInactiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) NoneInactiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.colorPrimary));
                    NoneInactiveB.setTag("#FFE600");
                    NoneInactive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.grey_button));
                    NoneInactiveB.setTag("D7D7D7D5");
                    NoneInactive= "false";
                }

            }

        });

        FerryActiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) FerryActiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    FerryActiveB.setBackgroundColor(ContextCompat.getColor(FerryActiveB.getContext(), R.color.colorPrimary));
                    FerryActiveB.setTag("#FFE600");
                    FerryActive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    FerryActiveB.setBackgroundColor(ContextCompat.getColor(FerryActiveB.getContext(), R.color.grey_button));
                    FerryActiveB.setTag("D7D7D7D5");
                    FerryActive= "false";
                }

            }

        });



        FerryInactiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) FerryInactiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    FerryInactiveB.setBackgroundColor(ContextCompat.getColor(FerryInactiveB.getContext(), R.color.colorPrimary));
                    FerryInactiveB.setTag("#FFE600");
                    FerryInactive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    FerryInactiveB.setBackgroundColor(ContextCompat.getColor(FerryInactiveB.getContext(), R.color.grey_button));
                    FerryInactiveB.setTag("D7D7D7D5");
                    FerryInactive= "false";
                }

            }

        });

        DefenceActiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) DefenceActiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    DefenceActiveB.setBackgroundColor(ContextCompat.getColor(DefenceActiveB.getContext(), R.color.colorPrimary));
                    DefenceActiveB.setTag("#FFE600");
                    DefenseActive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    DefenceActiveB.setBackgroundColor(ContextCompat.getColor(DefenceActiveB.getContext(), R.color.grey_button));
                    DefenceActiveB.setTag("D7D7D7D5");
                    DefenseActive= "false";
                }

            }

        });

        RobotTipB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) RobotTipB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.colorPrimary));
                    RobotTipB.setTag("#FFE600");
                    Tipped = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
                    RobotTipB.setTag("D7D7D7D5");
                    Tipped= "false";
                }

            }

        });

        StallOtherB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) StallOtherB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    StallOtherB.setBackgroundColor(ContextCompat.getColor(StallOtherB.getContext(), R.color.colorPrimary));
                    StallOtherB.setTag("#FFE600");
                    Stall = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    StallOtherB.setBackgroundColor(ContextCompat.getColor(StallOtherB.getContext(), R.color.grey_button));
                    StallOtherB.setTag("D7D7D7D5");
                    Stall= "false";
                }

            }

        });

        DefenseInactiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) DefenseInactiveB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    DefenseInactiveB.setBackgroundColor(ContextCompat.getColor(DefenseInactiveB.getContext(), R.color.colorPrimary));
                    DefenseInactiveB.setTag("#FFE600");
                    DefenseInactive = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    DefenseInactiveB.setBackgroundColor(ContextCompat.getColor(DefenseInactiveB.getContext(), R.color.grey_button));
                    DefenseInactiveB.setTag("D7D7D7D5");
                    DefenseInactive= "false";
                }

            }

        });

        FouledOtherB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) FouledOtherB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    FouledOtherB.setBackgroundColor(ContextCompat.getColor(FouledOtherB.getContext(), R.color.colorPrimary));
                    FouledOtherB.setTag("#FFE600");
                    Fouls = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    FouledOtherB.setBackgroundColor(ContextCompat.getColor(FouledOtherB.getContext(), R.color.grey_button));
                    FouledOtherB.setTag("D7D7D7D5");
                    Fouls= "false";
                }

            }

        });

        Button To_Submission = (Button) findViewById(R.id.toSubmission); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (FuelAvg010RB.isChecked()) {
                    TeleAverageFuelScored = "0-10";
                }
                else if (FuelAvg1130RB.isChecked()) {
                    TeleAverageFuelScored = "11-30";

                }
                else if (FuelAvg3150RB.isChecked()) {
                    TeleAverageFuelScored = "31-50";

                }
                else if (FuelAvg5170RB.isChecked()) {
                    TeleAverageFuelScored = "51-70";
                }

                else if (FuelAvg70PlusRB.isChecked()) {
                    TeleAverageFuelScored = "70+";
                }

                if (TeleAverageFuelScored.equals("Empty"))
                {
                    Toast.makeText(data_collection_TeleOP.this, "Please Choose Avg. Fuel!!!!!", Toast.LENGTH_LONG).show();
                }

                Intent teamnumintent = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                teamnumintent.putExtra(Team_Num_Display, teleopteamnumstring);
                startActivity (teamnumintent);
            }
        });

//        To_EndGame.setOnClickListener(new View.OnClickListener()
//        { //Makes onclick listener for button
//           @Override
//           public void onClick(View v) {
//
//
//
//
////                    Intent teamnumintent = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
////                    teamnumintent.putExtra(Team_Num_Display, teleopteamnumstring);
////                    startActivity (teamnumintent);
//                    //Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
//                    //startActivity(startintent);
//                }
    }
}
