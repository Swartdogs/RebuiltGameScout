package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;


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
    public static String TeleAmpScore = "0";
    public static String TeleSpeakerScore = "0";
    public static String TeleAmpMiss = "0";
    public static String TeleSpeakerMiss = "0";

    public static String Add_TeleAmpScore = "0";
    public static String Add_TeleSpeakerScore = "0";
    public static String Add_TeleAmpMiss = "0";
    public static String Add_TeleSpeakerMiss = "0";
    public static String Team_Num_Display = "NA";
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



        //Defines "Elegant" Number Blocks
        final ElegantNumberButton TeleAmpScoredEB = (ElegantNumberButton) findViewById(R.id.TeleAmpScore_EB);
        final ElegantNumberButton TeleAmpMissedEB = (ElegantNumberButton) findViewById(R.id.TeleAmpMissed_EB);
        final ElegantNumberButton TeleSpeakerMissedEB = (ElegantNumberButton) findViewById(R.id.TeleSpeakerMissed_EB);
        final ElegantNumberButton TeleSpeakerScoredEB = (ElegantNumberButton) findViewById(R.id.TeleSpeakerScore_EB);

        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.toSubmission);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
           @Override
           public void onClick(View v) {

                TeleAmpScore = Integer.toString(Integer.parseInt(TeleAmpScoredEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleAmpScore));
                TeleAmpMiss = Integer.toString(Integer.parseInt(TeleAmpMissedEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleAmpMiss));
                TeleSpeakerMiss = Integer.toString(Integer.parseInt(TeleSpeakerMissedEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleSpeakerMiss));
                TeleSpeakerScore = Integer.toString(Integer.parseInt(TeleSpeakerScoredEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleSpeakerScore));

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

                if (RobotTipCB.isChecked()) {
                   RobotTip = "True";
                }

                   // Intent intent4 = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                   // intent4.putExtra(Team_Num_Display_3,teleopteamnumstring);
                   // startActivity(intent4);
                    Intent intent3 = new Intent(data_collection_TeleOP.this, data_collection_end_game.class);
                    intent3.putExtra(Team_Num_Display, teleopteamnumstring);
                    startActivity(intent3);
                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });
    }
}
