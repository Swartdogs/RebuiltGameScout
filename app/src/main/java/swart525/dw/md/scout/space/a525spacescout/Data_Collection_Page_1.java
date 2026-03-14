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
            1,2530,2987,7531,2977,4143,4646,5914,3284,4663,3928,7850,695,3061,2531,7850,7531,2530,3061,6419,2358,2531,3090,4143,2358,4859,11246,5576,7850,2987,167,11246,5576,5339,2290,111,2977,3090,3061,5541,3928,3206,11246,525,5847,3284,2508,112,2987,2290,9082,5822,2549,2508,6420,3284,5822,4065,5576,2549,695,112,4065,4859,9082,7531,2220,3055,112,3284,7531,167,112,3061,5822,695
    };

    public static int[] MatchScheduleRed2 = {
            1,112,4663,2549,5847,7858,2508,4174,7531,525,3206,2977,5914,111,3055,3928,2290,2220,5339,4646,6420,111,3206,3055,5339,9082,5541,525,4143,2358,9082,6419,2667,6420,4174,5847,3206,967,4859,4646,6419,2530,2531,5914,3061,967,5576,167,5339,4859,11246,3284,2358,4143,2220,4663,2358,7858,6419,6420,5847,2987,5576,525,695,2667,5541,3090,525,5847,2508,7858,3090,2977,5339,4663
    };

    public static int[] MatchScheduleRed3 = {
            1,6419,9082,4065,4859,2667,2220,967,6420,2530,11246,4065,4646,2987,2549,4174,167,2549,2508,4859,967,3284,2290,4663,6419,4065,695,111,5914,5847,2530,967,2977,3055,2531,167,2358,695,3055,6420,5822,4174,4065,3090,7850,9082,5822,2220,7531,3928,525,3055,7858,112,4174,3928,2530,3206,2220,2667,2290,4174,4646,3206,5822,7850,2531,7858,2358,4646,111,5914,5541,11246,2220,7531
    };

    public static int[] MatchScheduleBlue1 = {
            1,1,967,6420,2290,525,3090,5339,5541,2531,3090,7858,167,2358,5847,2667,4663,7858,5914,2667,3055,4174,2987,2220,7850,7858,3928,4646,2508,7858,4065,5822,3928,4663,2508,4143,9082,2530,525,7858,2220,2667,2977,111,7531,2667,4143,6419,695,4663,111,5847,3206,4646,4065,6419,5914,111,5541,167,5339,2977,2530,5914,2358,5847,5339,967,11246,9082,4174,3206,3055,2549,6420,4859,4174
    };

    public static int[] MatchScheduleBlue2 = {
            1,2531,695,3055,3284,111,3928,5822,5576,4143,9082,4174,4859,5541,2220,3090,695,4065,5822,112,7531,167,5914,2549,5822,2977,2530,4174,3061,112,7531,2220,4646,3284,4859,5914,11246,4065,2508,2987,112,2549,4663,3055,2987,2290,6420,2358,2977,5541,5576,3061,7850,167,2667,11246,4646,7850,3061,967,2531,3928,6419,167,2549,2290,2508,2987,3928,4065,7850,967,2290,2530,2531,7858
    };

    public static int[] MatchScheduleBlue3 = {
            1,3206,5576,11246,7850,2358,167,3061,112,6419,2290,5822,2508,5339,9082,5576,525,3284,11246,2977,5847,525,3061,112,5847,6420,2667,2549,2531,2290,3090,695,3206,5541,7531,2549,5576,5339,4663,7850,3284,5339,4859,5541,3928,4646,7858,4174,5914,2530,967,695,2531,3090,525,7531,3055,9082,4143,4859,3090,2508,111,4663,4143,3284,2977,6420,3061,4663,6419,2667,5576,4143,2987,111
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