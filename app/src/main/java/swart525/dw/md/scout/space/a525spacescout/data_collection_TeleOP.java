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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


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
    public static String Fouls = "False";
    public static String DefenseInactive = "False";
    public static String ScoreFuel = "False";
    public static String FerryInactive = "False";
    public static String FerryActive = "False";
    public static String NoneInactive = "False";
    public static String NoneActive = "False";
    public static String Team_Num_Display = "0000";
    public static int cyclesTele = 0;
    public static int FuelTeleNum = 0;



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
        final Button DefenceActiveB = (Button) findViewById(R.id.TeleDefenseActive_B);
        final Button FerryInactiveB = (Button) findViewById(R.id.teleFerryInactive_B);
        final Button FerryActiveB = (Button) findViewById(R.id.TeleFerryActive_B);
        final Button NoneInactiveB = (Button) findViewById(R.id.TeleNoneInactive_B);
        final Button NoneActiveB = (Button) findViewById(R.id.teleNoneActive_B);
        final Button ScoreFuelB = (Button) findViewById(R.id.TeleScoreFuelActive_B);
        final Button CyclePlus = (Button) findViewById(R.id.TeleCyclesPlus_GB);
        final Button CycleMinus = (Button) findViewById(R.id.TeleCyclesMinus_GB);
        final SeekBar FuelSeekBar = (SeekBar) findViewById(R.id.SeekBarFuelTele);

        RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
        StallOtherB.setBackgroundColor(ContextCompat.getColor(StallOtherB.getContext(), R.color.grey_button));
        DefenseInactiveB.setBackgroundColor(ContextCompat.getColor(DefenseInactiveB.getContext(), R.color.grey_button));
        DefenceActiveB.setBackgroundColor(ContextCompat.getColor(DefenceActiveB.getContext(), R.color.grey_button));
        FerryInactiveB.setBackgroundColor(ContextCompat.getColor(FerryInactiveB.getContext(), R.color.grey_button));
        FerryActiveB.setBackgroundColor(ContextCompat.getColor(FerryActiveB.getContext(), R.color.grey_button));
        NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.grey_button));
        NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
        ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.grey_button));


        TextView CyclesText = (TextView) findViewById(R.id.TeleCyclesScored_TV);
        CyclesText.setText(String.valueOf(cyclesTele));



        CyclePlus.setOnClickListener(view -> {
                cyclesTele += 1;
                CyclesText.setText(String.valueOf(cyclesTele));
        });


        CycleMinus.setOnClickListener(View -> {
            if (cyclesTele > 0){
                cyclesTele -= 1;
                CyclesText.setText(String.valueOf(cyclesTele));
            }
        });


        ScoreFuelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) ScoreFuelB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.colorPrimary));
                    ScoreFuelB.setTag("#FFE600");
                    ScoreFuel = "true";
                    NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
                    NoneActiveB.setTag("D7D7D7D5");
                    NoneActive= "false";



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
                    //Set everything else to false
                    ScoreFuel = "false";
                    FerryActive = "false";
                    DefenseActive = "false";
                    ScoreFuelB.setBackgroundColor(ContextCompat.getColor(ScoreFuelB.getContext(), R.color.grey_button));
                    ScoreFuelB.setTag("D7D7D7D5");
                    FerryActiveB.setBackgroundColor(ContextCompat.getColor(FerryActiveB.getContext(), R.color.grey_button));
                    FerryActiveB.setTag("D7D7D7D5");
                    DefenceActiveB.setBackgroundColor(ContextCompat.getColor(DefenceActiveB.getContext(), R.color.grey_button));
                    DefenceActiveB.setTag("D7D7D7D5");




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
                    //set everything to false
                    FerryInactive = "false";
                    DefenseInactive = "false";
                    FerryInactiveB.setBackgroundColor(ContextCompat.getColor(FerryInactiveB.getContext(), R.color.grey_button));
                    FerryInactiveB.setTag("D7D7D7D5");
                    DefenseInactiveB.setBackgroundColor(ContextCompat.getColor(DefenseInactiveB.getContext(), R.color.grey_button));
                    DefenseInactiveB.setTag("D7D7D7D5");



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
                    NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
                    NoneActiveB.setTag("D7D7D7D5");
                    NoneActive= "false";


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
                    NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.grey_button));
                    NoneInactiveB.setTag("D7D7D7D5");
                    NoneInactive= "false";


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
                    NoneActiveB.setBackgroundColor(ContextCompat.getColor(NoneActiveB.getContext(), R.color.grey_button));
                    NoneActiveB.setTag("D7D7D7D5");
                    NoneActive= "false";



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
                    NoneInactiveB.setBackgroundColor(ContextCompat.getColor(NoneInactiveB.getContext(), R.color.grey_button));
                    NoneInactiveB.setTag("D7D7D7D5");
                    NoneInactive= "false";


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



        FuelSeekBar.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                FuelTeleNum = (i + 1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        Button To_Submission = (Button) findViewById(R.id.toSubmission); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent teamnumintent = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                teamnumintent.putExtra(Team_Num_Display, teleopteamnumstring);
                startActivity(teamnumintent);
            }

        });
    }}