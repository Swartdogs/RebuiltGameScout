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
    public static String NoShow = "False";
    public static int[] MatchSchedule = {4859,8821,3313,7541,9576,2839,3928,3723,1625,5275,8024,4260,8824,5914,9570,648,9543,4646,3723,5914,967,9576,9579,4859,9092,5275,6455,171,4021,9061,9579,6420,4959,9570,10476,6419,3134,7848,4859,8824,648,4539,9508,3723,1625,8770,2839,3134,9570,6455,9543,4260,10476,525,6391,6420,5442,5041,5837,9082,3275,1785,8821,8024,8766,6419,10439,4646,6420,9551,5576,9092,167,5041,9508,1706,9445};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = MatchSchedule.length+1; //Match must be less than 150
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
                    if (Compare_Match_Num < Match_Num + 1){
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
                tv.setText("");

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
                    Toast.makeText(Data_Collection_Page_1.this, "Jump Now! Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                }
                else {
                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());

                    if (Match_Num_Real < Compare_Match_Num) {
//                        if (NoShowCB.isChecked()) {
//                            NoShow = "True";
//
//                            Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
//                            startActivity(startintent);
//
//                        }

                        if(!tv.getText().toString().isEmpty()) {

                            Team_Num = Integer.parseInt(tv.getText().toString());
                            //Sets team num data to txt box information
                            Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                            Initials = Initials_txt.getText().toString();

                            String teamnumpls = Integer.toString(Team_Num);
                            Intent teamnumintent = new Intent(Data_Collection_Page_1.this, data_Collection_sandstorm.class);
                            teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                            startActivity(teamnumintent);
                        }
                        else if(!editTeamNum.getText().toString().isEmpty() ) {
                            Team_Num = Integer.parseInt(editTeamNum.getText().toString());
                            Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                            Initials = Initials_txt.getText().toString();


                            String teamnumpls = Integer.toString(Team_Num);
                            Intent teamnumintent = new Intent(Data_Collection_Page_1.this, data_Collection_sandstorm.class);
                            teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                            startActivity(teamnumintent);
                        }
                        //the freak down here is the problem line
                        else {
                            Toast.makeText(Data_Collection_Page_1.this, "Crouch Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                        }
                    }

                    if (NoShowCB.isChecked()) {
                        NoShow = "True";

                        Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
                        startActivity(startintent);

                    }

//                    else {
//                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
//                    }




                    //Defines Start button and takes to next page as well as recording data


                }
            }
        });}}