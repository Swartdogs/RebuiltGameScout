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
import android.widget.TextView;

    //Defines Variables

    public static String shallow = "False";
    public static String deep = "False";
    public static String parked = "False";
    public static String noAttempt = "False";









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
        final RadioButton shallowRB = (RadioButton) findViewById(R.id.shallowHang_RB);
        final RadioButton deepRB = (RadioButton) findViewById(R.id.deepHang_RB);
        final RadioButton parkedRB = (RadioButton) findViewById(R.id.park_RB);
        final RadioButton noAttemptRB = (RadioButton) findViewById(R.id.noAttempt_RB);

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
                if (parkedRB.isChecked()) {
                    parked = "True";
                }
                if (noAttemptRB.isChecked()) {
                    noAttempt = "True";
                }

                Intent teamnumintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(teamnumintent);
            }
        });
    }
}