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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
//import java.util.


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int Team_Num = 0;
    public static int Match_Num = 0;
    public static int Match_Num_Real = 0;
    public static String Team_Num_Display = "NA";
    public static String Initials = "We got a runner";
    public static String NoShow = "false";
    public static int[] MatchSchedule = {3, 525, 7, 42, 1252, 9960};








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = MatchSchedule.length; //Match must be less than 150
        final int Compare_Team_Num = 1; //Team must be greater than 1

        //Defines text boxes for Match/Team Number
        final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_txt);
        //final EditText Team_Num_txt = (EditText) findViewById(R.id.Team_Num_txt);
        final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines checkboxes
        final CheckBox NoShowCB = (CheckBox) findViewById(R.id.No_Show_CB);



        final EditText editTeamNum = (EditText)findViewById(R.id.Team_Num_txt);
        editTeamNum.setVisibility(View.INVISIBLE);

        TextView tv = (TextView)findViewById(R.id.TeamNumTB);
        tv.setVisibility(View.VISIBLE);

        /*MatchSchedule = new ArrayList<>();
        MatchSchedule.add("706");*/




        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override

            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });







        Match_Num_txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Match_Num_txt.getText().toString().isEmpty()){
                    Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());
                    Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
                    if (Compare_Match_Num < Match_Num){
                        Toast.makeText(Data_Collection_Page_1.this, "That is not a valid match number. Please try again!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        tv.setText(String.valueOf(MatchSchedule[Match_Num_Real - 1]));


                    }
                }

            }
        });
        Button OverrideTeamnum = (Button) findViewById(R.id.Override_Teamnum_B);
        OverrideTeamnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTeamNum = (EditText)findViewById(R.id.Team_Num_txt);
                editTeamNum.setVisibility(View.VISIBLE);

                TextView tv = (TextView)findViewById(R.id.TeamNumTB);
                tv.setVisibility(View.INVISIBLE);

                //editTeamNum.setText(String.valueOf(MatchSchedule[i]));
            }
        });

        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (Initials_txt.getText().toString().isEmpty() || Match_Num_txt.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Jump Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                }
                else {
                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());

                    if (NoShowCB.isChecked()) {
                        NoShow = "True";

                        Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
                        startActivity(startintent);
                            //comment = commenttxt.getText().toString();


                    }

                    else if (Compare_Match_Num > Match_Num_Real) {

                        if(!tv.getText().toString().isEmpty()) {

                            Team_Num = Integer.parseInt(tv.getText().toString());
                            //Sets team num data to txt box information
                        }
                        else if(!editTeamNum.getText().toString().isEmpty() ) {
                            Team_Num = Integer.parseInt(editTeamNum.getText().toString());
                        }

                        //the freak down here is the problem line
                        else {
                            Toast.makeText(Data_Collection_Page_1.this, "Crouch Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                        }
                        Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                        Initials = Initials_txt.getText().toString();


                        String teamnumpls = Integer.toString(Team_Num);
                        Intent teamnumintent = new Intent(Data_Collection_Page_1.this, data_Collection_sandstorm.class);
                        teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                        startActivity(teamnumintent);

                    }
                    else {
                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                    }




                    //Defines Start button and takes to next page as well as recording data


                }
            }
        });}}