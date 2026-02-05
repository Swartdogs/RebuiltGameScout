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

    public static String hangL1 = "False";
    public static String hangL2 = "False";
    public static String hangL3 = "False";
    public static String hangNone = "False";
    public static String Defense = "false";
    public static String ferryEnd = "false";
    public static String scoreFuelEnd = "false";
    public static String noneEnd = "false";
    public static String fouledEnd = "false";
    public static String tippedEnd = "false";
    public static String stalledEnd = "false";




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
        final RadioButton HangL3RB = (RadioButton) findViewById(R.id.EndL3_RB);
        final RadioButton HangL2RB = (RadioButton) findViewById(R.id.EndL2_RB);
        final RadioButton HangL1RB = (RadioButton) findViewById(R.id.EndL1_RB);
        final RadioButton HangNoneRB = (RadioButton) findViewById(R.id.EndNone_RB);
        final Button EndFerryB = (Button) findViewById(R.id.EndFerry_B);
        final Button EndScoreFuelB = (Button) findViewById(R.id.EndScoreFuel_B);
        final Button DefenseB = (Button) findViewById(R.id.EndDefense_B);
        final Button FoulsB = (Button) findViewById(R.id.EndNone_B);
        final Button TippedB = (Button) findViewById(R.id.EndTipped_B);
        final Button stalledB = (Button) findViewById(R.id.EndStalled_B);
        final Button noneB = (Button) findViewById(R.id.EndNone_B);

        TippedB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) noneB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    noneB.setBackgroundColor(ContextCompat.getColor(noneB.getContext(), R.color.colorPrimary));
                    noneB.setTag("#FFE600");
                    noneEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    noneB.setBackgroundColor(ContextCompat.getColor(noneB.getContext(), R.color.grey_button));
                    noneB.setTag("D7D7D7D5");
                    noneEnd= "false";
                }

            }

        });

        stalledB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) stalledB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    stalledB.setBackgroundColor(ContextCompat.getColor(stalledB.getContext(), R.color.colorPrimary));
                    stalledB.setTag("#FFE600");
                    stalledEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    stalledB.setBackgroundColor(ContextCompat.getColor(stalledB.getContext(), R.color.grey_button));
                    stalledB.setTag("D7D7D7D5");
                    stalledEnd= "false";
                }

            }

        });

        TippedB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) TippedB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TippedB.setBackgroundColor(ContextCompat.getColor(TippedB.getContext(), R.color.colorPrimary));
                    TippedB.setTag("#FFE600");
                    tippedEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    TippedB.setBackgroundColor(ContextCompat.getColor(TippedB.getContext(), R.color.grey_button));
                    TippedB.setTag("D7D7D7D5");
                    tippedEnd= "false";
                }

            }

        });

        EndScoreFuelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) EndScoreFuelB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    EndScoreFuelB.setBackgroundColor(ContextCompat.getColor(EndScoreFuelB.getContext(), R.color.colorPrimary));
                    EndScoreFuelB.setTag("#FFE600");
                    scoreFuelEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    EndScoreFuelB.setBackgroundColor(ContextCompat.getColor(EndScoreFuelB.getContext(), R.color.grey_button));
                    EndScoreFuelB.setTag("D7D7D7D5");
                    scoreFuelEnd= "false";
                }

            }

        });

        EndFerryB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) EndFerryB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    EndFerryB.setBackgroundColor(ContextCompat.getColor(EndFerryB.getContext(), R.color.colorPrimary));
                    EndFerryB.setTag("#FFE600");
                    ferryEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    EndFerryB.setBackgroundColor(ContextCompat.getColor(EndFerryB.getContext(), R.color.grey_button));
                    EndFerryB.setTag("D7D7D7D5");
                    ferryEnd= "false";
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
                    fouledEnd = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    FoulsB.setBackgroundColor(ContextCompat.getColor(FoulsB.getContext(), R.color.grey_button));
                    FoulsB.setTag("D7D7D7D5");
                    fouledEnd= "false";
                }

            }

        });
        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (HangL1RB.isChecked()) {
                    hangL1 = "True";
                }
                if (HangL2RB.isChecked()) {
                    hangL2 = "True";
                }
                if (HangL3RB.isChecked()) {
                    hangL3 = "True";
                }
                if (HangNoneRB.isChecked()) {
                    hangNone = "True";
                }

                if (hangL1.equals("False") && hangL2.equals("False") && hangL3.equals("False") && hangNone.equals("False"))
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