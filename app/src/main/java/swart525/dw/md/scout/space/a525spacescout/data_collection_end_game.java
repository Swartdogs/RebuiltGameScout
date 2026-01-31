package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class data_collection_end_game extends AppCompatActivity {


    //Defines Variables

    public static String shallow = "False";
    public static String deep = "False";
    public static String attemptShallow = "False";
    public static String attemptDeep = "False";
    public static String parked = "False";
    public static String noAttempt = "False";
    public static String RobotTip = "false";
    public static String RobotStall = "false";
    public static String Defense = "false";
    public static String Fouls = "false";








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        TextView TeamNumEndgame = (TextView) findViewById(R.id.TeamNumEndgameTV);
        Intent teamnumintent = getIntent();
        String endgameteamnumstring = teamnumintent.getStringExtra(data_collection_TeleOP.Team_Num_Display);
        TeamNumEndgame.setText(endgameteamnumstring);
        //Defines Page Elements
        //Radio Buttons
        final RadioButton shallowRB = (RadioButton) findViewById(R.id.EndL3_RB);
        final RadioButton deepRB = (RadioButton) findViewById(R.id.EndL1_RB);
        final RadioButton attemptShallowRB = (RadioButton) findViewById(R.id.EndL2_RB);
        final RadioButton attemptDeepRB = (RadioButton) findViewById(R.id.EndNone_RB);
        final RadioButton parkedRB = (RadioButton) findViewById(R.id.park_RB);
        final RadioButton noAttemptRB = (RadioButton) findViewById(R.id.noAttempt_RB);
        final Button RobotTipB = (Button) findViewById(R.id.end_tipped_B);
        final Button RobotStallB = (Button) findViewById(R.id.end_stalled_B);
        final Button DefenseB = (Button) findViewById(R.id.end_defense_B);
        final Button FoulsB = (Button) findViewById(R.id.end_fouled_B);

        if (data_collection_TeleOP.RobotTip.equals("true")) {
            RobotTip = "true";
            RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.colorPrimary));
            RobotTipB.setTag("#FFE600");
        }
        else {
            RobotTip = "false";
            RobotTipB.setBackgroundColor(ContextCompat.getColor(RobotTipB.getContext(), R.color.grey_button));
            RobotTipB.setTag("D7D7D7D5");
        }

        if (data_collection_TeleOP.RobotStall.equals("true")) {
            RobotStall = "true";
            RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.colorPrimary));
            RobotStallB.setTag("#FFE600");
        }
        else {
            RobotStall = "false";
            RobotStallB.setBackgroundColor(ContextCompat.getColor(RobotStallB.getContext(), R.color.grey_button));
            RobotStallB.setTag("D7D7D7D5");
        }

        if (data_collection_TeleOP.Defense.equals("true")) {
            Defense = "true";
            DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.colorPrimary));
            DefenseB.setTag("#FFE600");
        }
        else {
            RobotStall = "false";
            DefenseB.setBackgroundColor(ContextCompat.getColor(DefenseB.getContext(), R.color.grey_button));
            DefenseB.setTag("D7D7D7D5");
        }

        if (data_collection_TeleOP.Fouls.equals("true")) {
            Fouls = "true";
            FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.colorPrimary));
            FoulsB.setTag("#FFE600");
        }
        else {
            Fouls = "false";
            FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.grey_button));
            FoulsB.setTag("D7D7D7D5");
        }

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
                if (!"#FFE600".equals(colorCode)){
                    FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.colorPrimary));
                    FoulsB.setTag("#FFE600");
                    Fouls = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.grey_button));
                    FoulsB.setTag("D7D7D7D5");
                    Fouls= "false";
                }

            }

        });
        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (shallowRB.isChecked()) {
                    shallow = "True";
                }
                if (deepRB.isChecked()) {
                    deep = "True";
                }
                if (attemptShallowRB.isChecked()) {
                    attemptShallow = "True";
                }
                if (attemptDeepRB.isChecked()) {
                    attemptDeep = "True";
                }
                if (parkedRB.isChecked()) {
                    parked = "True";
                }
                if (noAttemptRB.isChecked()) {
                    noAttempt = "True";
                }

                if (shallow.equals("False") && deep.equals("False") && parked.equals("False") && noAttempt.equals("False") && attemptShallow.equals("False") && attemptDeep.equals("False"))
                {
                    Toast.makeText(data_collection_end_game.this, "Please select an ending position!", Toast.LENGTH_LONG).show();
                }

                else
                {
                    Intent teamnumintent = new Intent(getApplicationContext(), Save_Page.class);
                    startActivity(teamnumintent);
                }
            }
        });
    }
}