package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables

    public static String AttemptedHang = "False";
    public static String Parked = "False";
    public static String SoloHang = "False";
    public static String HarmonyHang = "False";
    public static String ScoredTrap = "False";
    public static String AttemptedTrap = "False";
    public static String NoneTrap = "False";
    public static String NoneHang = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        TextView TeamNumEndgame = (TextView) findViewById(R.id.TeamNumEndgameTV);
        Intent teamnumintent = getIntent();
        String endgameteamnumstring = teamnumintent.getStringExtra(data_collection_TeleOP.Team_Num_Display);
        TeamNumEndgame.setText(endgameteamnumstring);
        //Defines Page Elements
        //Defines All Radio Buttons
        final RadioButton SoloHangRB = (RadioButton) findViewById(R.id.End_SoloHang_RB);
        final RadioButton HarmonyHangRB = (RadioButton) findViewById(R.id.End_HarmonyHang_RB);
        final RadioButton AttemptedHangRB = (RadioButton) findViewById(R.id.End_AttemptedHang_RB);
        final RadioButton ParkRB = (RadioButton) findViewById(R.id.End_Park_RB);
        final RadioButton NoHangParkAttemptRB = (RadioButton) findViewById(R.id.End_NoHangParkAttempt_RB);
        final RadioButton TrapScoreRB = (RadioButton) findViewById(R.id.End_TrapScore_RB);
        final RadioButton TrapAttemptedRB = (RadioButton) findViewById(R.id.End_TrapAttempt_RB);
        final RadioButton NoTrapAttemptRB = (RadioButton) findViewById(R.id.End_NoTrapAttempt_RB);


        //final CheckBox AttemptedHangCB = (CheckBox) findViewById(R.id.AttemptedHang_CB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {



                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (AttemptedHangRB.isChecked()) {
                    AttemptedHang = "True";
                }
                if (ParkRB.isChecked()) {
                    Parked = "True";
                }
                if (SoloHangRB.isChecked()) {
                    SoloHang = "True";
                }
                if (HarmonyHangRB.isChecked()) {
                    HarmonyHang = "True";
                }
                if (TrapScoreRB.isChecked()) {
                    ScoredTrap = "True";
                }
                if (TrapAttemptedRB.isChecked()) {
                    AttemptedTrap = "True";
                }
                if (NoTrapAttemptRB.isChecked()) {
                    NoneTrap = "True";
                }
                if (NoHangParkAttemptRB.isChecked()) {
                    NoneHang = "True";
                }
                if (SoloHangRB.isChecked()) {
                    SoloHang = "True";
                }

                Intent teamnumintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(teamnumintent);
            }
        });


    }

}


