package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int Team_Num = 0;
    public static int Match_Num = 0;
    public static int Match_Num_Real = 0;
    public static String Team_Num_Display = "NA";
    public static String Initials = "We got a runner";
    public static String NoShow = "False";

    //doing the list for the robots schedule i guess
    public static int[] MatchScheduleRed1 = {
            5690,2239,3298,2177,5232,4166,4360,7048,4009,2383,1410,111,3883,6132,112
            ,4623,2512,3691,6160,2513,5913,5720,4418,1716,2531,5253,3691,2240,10474
            ,525,2512,5232,2052,2450,1716,2977,5720,4009,112,7041,1716,2450,4593,5339
            ,4166,2240,2052,2290,2501,2491,1816,7021,5913,3023,4531,10173,5690,3054,2239
            ,4230,3298,6758,6044,6420,5232,3023,3691,4418,2383,2531,4215,3212,1816,4360
            ,2512,2513,3042,6420,7048,3212,7041,2052,5232,111,6132,3883,7021,2052,111
            ,2052,2501,5232,6758,5232,111,111
    };

    public static int[] MatchScheduleRed2 = {
            2290,1410,10173,1816,525,6160,3061,3054,6420,2290,3023,4230,3298,2240,3042,
            4418,2052,5339,10173,4230,3298,3883,2239,525,4215,2977,6044,4623,5720,3212,
            4009,5253,4360,6132,2491,4531,1410,3054,7021,5232,3061,3042,6758,6132,6047
            ,4009,5253,2239,2512,3212,3691,4230,5339,2531,4360,2512,6420,2513,7048,525
            ,7041,7021,111,1716,10474,4166,5913,6047,7041,2977,2472,10474,2450,5913,
            2501,6132,2239,4623,112,3061,2472,5253,2383,2531,1816,3061,4360,3061,525,
            2472,4009,2472,5253,5253
    };

    public static int[] MatchScheduleRed3 = {
            3212,6758,111,3023,5913,3883,6132,4531,6044,2472,10173,6160,2513,2177,4593,
            6044,6047,6420,10474,7021,2472,3023,4593,2450,2491,6047,2052,111,4418,3054,
            4166,2501,2290,7041,3691,1816,5690,4623,4360,4230,4215,2977,2501,2512,7048,
            3054,2472,2450,10474,2177,3298,6758,6047,6044,1410,4009,3042,2491,1816,3061,
            2240,4623,5720,3883,2290,2513,525,112,3042,3061,10173,4593,7021,4531,2383,
            2531,3061,5253,2177,4215,6758,4230,2491,2240,5913,4531,112,4230,2240,4230,
            2290,2491,4593,2491,2240,2240
    };

    public static int[] MatchScheduleBlue1 = {
            2501,2472,4230,2491,7021,2052,10474,5339,4623,3212,1816,5253,5690,3061,
            4166,2450,2977,4009,111,4531,112,6132,3061,6758,3042,5339,7041,1410,7021,
            10173,2531,7048,6758,6047,3061,3042,525,10474,2383,4418,2290,2177,3298,5913,
            111,4360,10173,3883,4531,2513,6420,6132,2977,4215,3883,4593,2472,2501,2290
            ,6160,6047,4215,5253,2472,2177,3054,4230,1410,2239,6044,2240,4623,6160,3023
            ,3054,525,6047,4593,6044,2491,5720,3883,6758,7021,2501,6758,6132,5232,2501,
            6132,6758,111,6132,6132,6132,5913
    };

    public static int[] MatchScheduleBlue2 = {
            6047,2513,2512,5253,4593,2240,7041,2450,1716,2491,6758,4215,7021,4531,3054,
            2501,7048,2531,2383,3212,2177,4623,1816,5690,4009,5232,6420,2472,2177,3883,
            3023,2383,5339,4215,4593,6044,3023,2240,2531,2472,2513,3691,6160,6044,1816,
            5720,4418,3042,4593,6160,3061,7048,4166,112,2052,2177,10474,111,2977,112,
            4418,4166,5913,4360,4531,2450,2052,2491,5690,6758,2501,5720,1716,3691,2290,
            111,1410,10173,3883,3298,5232,2531,4009,1816,525,6420,2383,2472,525,2383,4009,
            5253,2383,2383,2383,2383
    };

    public static int[] MatchScheduleBlue3 = {
            112,3691,5720,2383,4215,2977,2531,4418,3042,5720,5913,2239,10474,525,7041,
            4360,1716,5232,1410,2240,3054,2501,2512,4166,7048,4360,2290,112,6160,2239,
            5690,2513,4230,6420,5913,3298,2239,5253,2052,3883,10173,3212,4531,2491,6420,
            2531,2383,1410,1716,7041,5232,111,4623,525,1716,2450,5232,7021,6132,3023,3691,
            5339,3212,2512,4009,6160,1816,6132,3298,5253,5339,7048,4009,4166,4230,4418,
            5339,5690,2240,2052,2977,4531,4593,112,2290,4593,5913,2491,2290,5913,4593,2240,
            5913,5913,5913,6132
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        // Load tablet config
        TabletConfig.loadConfig();

        // ----- Alliance Header -----
        TextView textView24 = findViewById(R.id.textView24);

        String alliance = TabletConfig.allianceColor;
        int team = TabletConfig.teamNumber;

        textView24.setText(alliance + " " + team + " Robot");

        if (alliance.equalsIgnoreCase("red")) {
            textView24.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        } else if (alliance.equalsIgnoreCase("blue")) {
            textView24.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
        }

        int[][] redSchedules = { MatchScheduleRed1, MatchScheduleRed2, MatchScheduleRed3 };
        int[][] blueSchedules = { MatchScheduleBlue1, MatchScheduleBlue2, MatchScheduleBlue3 };

        int[] MatchSchedule;

        if (alliance.equalsIgnoreCase("Red")) {
            MatchSchedule = redSchedules[team - 1];
        } else {
            MatchSchedule = blueSchedules[team - 1];
        }

        //Sets up comparison numbers
        final int Compare_Match_Num = MatchSchedule.length + 1;
        final int Compare_Team_Num = 1;

        //Defines text boxes
        final EditText Match_Num_txt = findViewById(R.id.Match_Num_txt);
        final EditText Initials_txt = findViewById(R.id.Init_Txt);

        //Defines checkboxes
        final CheckBox NoShowCB = findViewById(R.id.No_Show_CB);

        final EditText editTeamNum = findViewById(R.id.Team_Num_txt);
        editTeamNum.setVisibility(View.INVISIBLE);

        final TextView tv = findViewById(R.id.TeamNumTB);
        tv.setVisibility(View.VISIBLE);

        // Cancel Button
        Button Cancel_Collection = findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });

        // Match Number Logic
        Match_Num_txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (!Match_Num_txt.getText().toString().isEmpty()) {

                    Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());
                    Match_Num = Match_Num_Real;

                    if (Compare_Match_Num < Match_Num + 1) {

                        Toast.makeText(
                                Data_Collection_Page_1.this,
                                "That is not a valid match number. Please enter less than " + Compare_Match_Num,
                                Toast.LENGTH_LONG
                        ).show();

                    } else {

                        tv.setText(String.valueOf(MatchSchedule[Match_Num_Real - 1]));

                    }
                }
            }
        });

        // Override Button
        Button OverrideTeamnum = findViewById(R.id.Override_Teamnum_B);
        OverrideTeamnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTeamNum.setVisibility(View.VISIBLE);
                tv.setText("");
                tv.setVisibility(View.INVISIBLE);
            }
        });

        // Start Button
        Button Start_Collection = findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Initials_txt.getText().toString().isEmpty()
                        || Match_Num_txt.getText().toString().isEmpty()) {

                    Toast.makeText(
                            Data_Collection_Page_1.this,
                            "Jump Now! Cannot Continue. Please Enter ALL Information!",
                            Toast.LENGTH_LONG
                    ).show();

                } else {

                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());

                    if (Match_Num_Real < Compare_Match_Num) {

                        if (NoShowCB.isChecked()) {

                            NoShow = "True";
                            Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
                            startActivity(startintent);

                        } else if (!tv.getText().toString().isEmpty()) {

                            Initials = Initials_txt.getText().toString();
                            Team_Num = Integer.parseInt(tv.getText().toString());
                            Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());

                            String teamnumpls = Integer.toString(Team_Num);
                            Intent teamnumintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                            startActivity(teamnumintent);

                        } else if (!editTeamNum.getText().toString().isEmpty()) {

                            Team_Num = Integer.parseInt(editTeamNum.getText().toString());
                            Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
                            Initials = Initials_txt.getText().toString();

                            String teamnumpls = Integer.toString(Team_Num);
                            Intent teamnumintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                            startActivity(teamnumintent);

                        } else {

                            Toast.makeText(
                                    Data_Collection_Page_1.this,
                                    "Crouch Cannot Continue. Please Enter ALL Information!",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
            }
        });
    }
}