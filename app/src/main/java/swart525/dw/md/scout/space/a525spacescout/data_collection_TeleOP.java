package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

    public static String Team_Num_Display = "0000";
    public static String Tipped = "False";
    public static String Stall = "False";
    public static String Fouls = "False";
    public static String Beach = "False";
//    public static String DefenseActive = "False";
//    public static String DefenseInactive = "False";
//    public static String ScoreFuel = "False";
//    public static String FerryInactive = "False";
//    public static String FerryActive = "False";
//    public static String NoneInactive = "False";
//    public static String NoneActive = "False";
//    public static int FuelTeleNum = 0;
//    public static int cyclesTele = 0;

    public static String TeleActiveScoring = "False";
    public static String TeleInactiveScoring = "False";
    public static String TeleActivePush = "False";
    public static String TeleInactivePush = "False";
    public static String TeleActiveShoot = "False";
    public static String TeleInactiveShoot = "False";
    public static String TeleActiveDefense = "False";
    public static String TeleInactiveDefense = "False";
    public static String TeleActiveOutpost = "False";
    public static String TeleInactiveOutpost = "False";
    public static String TeleActiveDepot = "False";
    public static String TeleInactiveDepot = "False";
    public static String TeleActiveStoring = "False";
    public static String TeleInactiveStoring = "False";



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
        final Button BeachOtherB = (Button) findViewById(R.id.TeleBeached_B);

//        final SeekBar FuelSeekBar = (SeekBar) findViewById(R.id.SeekBarFuelTele);

        RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
        StallOtherB.setBackgroundColor(ContextCompat.getColor(StallOtherB.getContext(), R.color.grey_button));

        final Button TeleActiveScoringCB = findViewById(R.id.TeleActiveScoring_CB);
        final Button TeleInactiveScoringCB = findViewById(R.id.TeleInactiveScoring_CB);
        final Button TeleActivePushCB = findViewById(R.id.TeleActivePush_CB);
        final Button TeleInactivePushCB = findViewById(R.id.TeleInactivePush_CB);
        final Button TeleActiveShootCB = findViewById(R.id.TeleActiveShoot_CB);
        final Button TeleInactiveShootCB = findViewById(R.id.TeleInactiveShoot_CB);
        final Button TeleActiveDefenseCB = findViewById(R.id.TeleActiveDefense_CB);
        final Button TeleInactiveDefenseCB = findViewById(R.id.TeleInactiveDefense_CB);

        final Button TeleActiveOutpostCB = findViewById(R.id.TeleActiveOutpost_CB);
        final Button TeleInactiveOutpostCB = findViewById(R.id.TeleInactiveOutpost_CB);
        final Button TeleActiveDepotCB = findViewById(R.id.TeleActiveDepot_CB);
        final Button TeleInactiveDepotCB = findViewById(R.id.TeleInactiveDepot_CB);
        final Button TeleActiveStoringCB = findViewById(R.id.TeleActiveStoring_CB);
        final Button TeleInactiveStoringCB = findViewById(R.id.TeleInactiveStoring_CB);


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


        BeachOtherB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) BeachOtherB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    BeachOtherB.setBackgroundColor(ContextCompat.getColor(BeachOtherB.getContext(), R.color.colorPrimary));
                    BeachOtherB.setTag("#FFE600");
                    Beach = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    BeachOtherB.setBackgroundColor(ContextCompat.getColor(BeachOtherB.getContext(), R.color.grey_button));
                    BeachOtherB.setTag("D7D7D7D5");
                    Beach= "false";
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

        TeleActiveScoringCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveScoringCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveScoringCB.getContext(), R.color.colorPrimary));
                    TeleActiveScoringCB.setTag("#FFE600");
                    TeleActiveScoring = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveScoringCB.getContext(), R.color.grey_button));
                    TeleActiveScoringCB.setTag("D7D7D7D5");
                    TeleActiveScoring= "false";
                }

            }

        });

        TeleInactiveScoringCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveScoringCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveScoringCB.getContext(), R.color.colorPrimary));
                    TeleInactiveScoringCB.setTag("#FFE600");
                    TeleInactiveScoring = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveScoringCB.getContext(), R.color.grey_button));
                    TeleInactiveScoringCB.setTag("D7D7D7D5");
                    TeleInactiveScoring= "false";
                }

            }

        });

        TeleActivePushCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActivePushCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActivePushCB.setBackgroundColor(ContextCompat.getColor(TeleActivePushCB.getContext(), R.color.colorPrimary));
                    TeleActivePushCB.setTag("#FFE600");
                    TeleActivePush = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActivePushCB.setBackgroundColor(ContextCompat.getColor(TeleActivePushCB.getContext(), R.color.grey_button));
                    TeleActivePushCB.setTag("D7D7D7D5");
                    TeleActivePush = "false";
                }

            }

        });

        TeleInactivePushCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactivePushCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactivePushCB.setBackgroundColor(ContextCompat.getColor(TeleInactivePushCB.getContext(), R.color.colorPrimary));
                    TeleInactivePushCB.setTag("#FFE600");
                    TeleInactivePush = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactivePushCB.setBackgroundColor(ContextCompat.getColor(TeleInactivePushCB.getContext(), R.color.grey_button));
                    TeleInactivePushCB.setTag("D7D7D7D5");
                    TeleInactivePush = "false";
                }

            }

        });


        TeleActiveScoringCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveScoringCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveScoringCB.getContext(), R.color.colorPrimary));
                    TeleActiveScoringCB.setTag("#FFE600");
                    TeleActiveScoring = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveScoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveScoringCB.getContext(), R.color.grey_button));
                    TeleActiveScoringCB.setTag("D7D7D7D5");
                    TeleActiveScoring = "false";
                }

            }

        });

        TeleActiveShootCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveShootCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveShootCB.setBackgroundColor(ContextCompat.getColor(TeleActiveShootCB.getContext(), R.color.colorPrimary));
                    TeleActiveShootCB.setTag("#FFE600");
                    TeleActiveShoot = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveShootCB.setBackgroundColor(ContextCompat.getColor(TeleActiveShootCB.getContext(), R.color.grey_button));
                    TeleActiveShootCB.setTag("D7D7D7D5");
                    TeleActiveShoot = "false";
                }

            }

        });

        TeleInactiveShootCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveShootCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveShootCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveShootCB.getContext(), R.color.colorPrimary));
                    TeleInactiveShootCB.setTag("#FFE600");
                    TeleInactiveShoot = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveShootCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveShootCB.getContext(), R.color.grey_button));
                    TeleInactiveShootCB.setTag("D7D7D7D5");
                    TeleInactiveShoot = "false";
                }

            }

        });

        TeleActiveDefenseCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveDefenseCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveDefenseCB.setBackgroundColor(ContextCompat.getColor(TeleActiveDefenseCB.getContext(), R.color.colorPrimary));
                    TeleActiveDefenseCB.setTag("#FFE600");
                    TeleActiveDefense = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveDefenseCB.setBackgroundColor(ContextCompat.getColor(TeleActiveDefenseCB.getContext(), R.color.grey_button));
                    TeleActiveDefenseCB.setTag("D7D7D7D5");
                    TeleActiveDefense = "false";
                }

            }

        });

        TeleInactiveDefenseCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveDefenseCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveDefenseCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveDefenseCB.getContext(), R.color.colorPrimary));
                    TeleInactiveDefenseCB.setTag("#FFE600");
                    TeleInactiveDefense = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveDefenseCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveDefenseCB.getContext(), R.color.grey_button));
                    TeleInactiveDefenseCB.setTag("D7D7D7D5");
                    TeleInactiveDefense = "false";
                }

            }

        });

        TeleActiveOutpostCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveOutpostCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveOutpostCB.setBackgroundColor(ContextCompat.getColor(TeleActiveOutpostCB.getContext(), R.color.colorPrimary));
                    TeleActiveOutpostCB.setTag("#FFE600");
                    TeleActiveOutpost = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveOutpostCB.setBackgroundColor(ContextCompat.getColor(TeleActiveOutpostCB.getContext(), R.color.grey_button));
                    TeleActiveOutpostCB.setTag("D7D7D7D5");
                    TeleActiveOutpost = "false";
                }

            }

        });

        TeleInactiveOutpostCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveOutpostCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveOutpostCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveOutpostCB.getContext(), R.color.colorPrimary));
                    TeleInactiveOutpostCB.setTag("#FFE600");
                    TeleInactiveOutpost = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveOutpostCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveOutpostCB.getContext(), R.color.grey_button));
                    TeleInactiveOutpostCB.setTag("D7D7D7D5");
                    TeleInactiveOutpost = "false";
                }

            }

        });

        TeleActiveDepotCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveDepotCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveDepotCB.setBackgroundColor(ContextCompat.getColor(TeleActiveDepotCB.getContext(), R.color.colorPrimary));
                    TeleActiveDepotCB.setTag("#FFE600");
                    TeleActiveDepot = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveDepotCB.setBackgroundColor(ContextCompat.getColor(TeleActiveDepotCB.getContext(), R.color.grey_button));
                    TeleActiveDepotCB.setTag("D7D7D7D5");
                    TeleActiveDepot = "false";
                }

            }

        });

        TeleActiveStoringCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleActiveStoringCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleActiveStoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveStoringCB.getContext(), R.color.colorPrimary));
                    TeleActiveStoringCB.setTag("#FFE600");
                    TeleActiveStoring = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleActiveStoringCB.setBackgroundColor(ContextCompat.getColor(TeleActiveStoringCB.getContext(), R.color.grey_button));
                    TeleActiveStoringCB.setTag("D7D7D7D5");
                    TeleActiveStoring = "false";
                }

            }

        });

        TeleInactiveDepotCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveDepotCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveDepotCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveDepotCB.getContext(), R.color.colorPrimary));
                    TeleInactiveDepotCB.setTag("#FFE600");
                    TeleInactiveDepot = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveDepotCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveDepotCB.getContext(), R.color.grey_button));
                    TeleInactiveDepotCB.setTag("D7D7D7D5");
                    TeleInactiveDepot = "false";
                }

            }

        });

        TeleInactiveStoringCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TeleInactiveStoringCB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleInactiveStoringCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveStoringCB.getContext(), R.color.colorPrimary));
                    TeleInactiveStoringCB.setTag("#FFE600");
                    TeleInactiveStoring = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TeleInactiveStoringCB.setBackgroundColor(ContextCompat.getColor(TeleInactiveStoringCB.getContext(), R.color.grey_button));
                    TeleInactiveStoringCB.setTag("D7D7D7D5");
                    TeleInactiveStoring = "false";
                }

            }

        });

//        FuelSeekBar.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
//
//
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                FuelTeleNum = (i + 1);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });


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