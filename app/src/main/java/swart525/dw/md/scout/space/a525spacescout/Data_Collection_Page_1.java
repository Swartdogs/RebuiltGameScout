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
//import java.util.


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int Team_Num = 0;
    public static int Match_Num = 0;
    public static int Match_Num_Real = 0;
    public static String Team_Num_Display = "NA";
    public static String Initials = "We got a runner";
    public static String NoShow = "false";
    public static ArrayList<String> MatchSchedule;



    //List<List<String>> records = new ArrayList<>();
   // try BufferedReader br = new BufferedReader(new FileReader("matchschedule.csv"));{
      //  String line;
        // try this
      //  while (true) {
        //    try {
      //          if (!((line = br.readLine()) != null)) break;
        //    } catch (IOException e) {
        //        throw new RuntimeException(e);
       //     }
        //    String[] values = line.split(",");
        //    records.add(Arrays.asList(values));
      //  }
  //  }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = 125; //Match must be less than 150
        final int Compare_Team_Num = 1; //Team must be greater than 1

        //Defines text boxes for Match/Team Number
        final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_txt);
        final EditText Team_Num_txt = (EditText) findViewById(R.id.Team_Num_txt);
        final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines checkboxes
        final CheckBox NoShowCB = (CheckBox) findViewById(R.id.No_Show_CB);



        EditText et = (EditText)findViewById(R.id.Team_Num_txt);
        et.setVisibility(View.INVISIBLE);

        TextView tv = (TextView)findViewById(R.id.TeamNumTB);
        tv.setVisibility(View.VISIBLE);

        MatchSchedule = new ArrayList<>();
        MatchSchedule.add("3136");
        MatchSchedule.add("2875");
        MatchSchedule.add("4020");
        MatchSchedule.add("4766");
        MatchSchedule.add("2642");
        MatchSchedule.add("5126");
        MatchSchedule.add("2959");
        MatchSchedule.add("3647");
        MatchSchedule.add("2375");
        MatchSchedule.add("7419");
        MatchSchedule.add("494");
        MatchSchedule.add("3637");
        MatchSchedule.add("201");
        MatchSchedule.add("4405");
        MatchSchedule.add("8738");
        MatchSchedule.add("1683");
        MatchSchedule.add("8");
        MatchSchedule.add("4112");
        MatchSchedule.add("589");
        MatchSchedule.add("3061");
        MatchSchedule.add("4342");
        MatchSchedule.add("5584");
        MatchSchedule.add("5010");
        MatchSchedule.add("4381");
        MatchSchedule.add("1899");
        MatchSchedule.add("1683");
        MatchSchedule.add("9579");
        MatchSchedule.add("1701");
        MatchSchedule.add("201");
        MatchSchedule.add("5587");
        MatchSchedule.add("2642");
        MatchSchedule.add("4381");
        MatchSchedule.add("1816");
        MatchSchedule.add("7419");
        MatchSchedule.add("801");
        MatchSchedule.add("7021");
        MatchSchedule.add("1747");
        MatchSchedule.add("2851");
        MatchSchedule.add("9120");
        MatchSchedule.add("5587");
        MatchSchedule.add("4188");
        MatchSchedule.add("8738");
        MatchSchedule.add("7419");
        MatchSchedule.add("3193");
        MatchSchedule.add("589");
        MatchSchedule.add("2582");
        MatchSchedule.add("4944");
        MatchSchedule.add("2959");
        MatchSchedule.add("5010");
        MatchSchedule.add("9128");
        MatchSchedule.add("1768");
        MatchSchedule.add("525");
        MatchSchedule.add("9758");
        MatchSchedule.add("5665");
        MatchSchedule.add("1756");
        MatchSchedule.add("973");
        MatchSchedule.add("2438");
        MatchSchedule.add("9785");
        MatchSchedule.add("3647");
        MatchSchedule.add("4451");
        MatchSchedule.add("2429");
        MatchSchedule.add("2877");
        MatchSchedule.add("2659");
        MatchSchedule.add("4118");
        MatchSchedule.add("5406");
        MatchSchedule.add("4391");
        MatchSchedule.add("2642");
        MatchSchedule.add("973");
        MatchSchedule.add("1796");
        MatchSchedule.add("1768");
        MatchSchedule.add("1684");
        MatchSchedule.add("1477");
        MatchSchedule.add("1816");
        MatchSchedule.add("3132");
        MatchSchedule.add("9644");
        MatchSchedule.add("5126");
        MatchSchedule.add("973");
        MatchSchedule.add("9593");
        MatchSchedule.add("5584");
        MatchSchedule.add("1684");
        MatchSchedule.add("9579");
        MatchSchedule.add("2659");
        MatchSchedule.add("3061");
        MatchSchedule.add("1683");
        MatchSchedule.add("3136");
        MatchSchedule.add("9785");
        MatchSchedule.add("2035");
        MatchSchedule.add("9545");
        MatchSchedule.add("4450");
        MatchSchedule.add("3647");
        MatchSchedule.add("9128");
        MatchSchedule.add("6017");
        MatchSchedule.add("5813");
        MatchSchedule.add("4611");
        MatchSchedule.add("4391");
        MatchSchedule.add("4952");
        MatchSchedule.add("4118");
        MatchSchedule.add("7021");
        MatchSchedule.add("4381");
        MatchSchedule.add("973");
        MatchSchedule.add("1796");
        MatchSchedule.add("7312");
        MatchSchedule.add("1756");
        MatchSchedule.add("9128");
        MatchSchedule.add("3637");
        MatchSchedule.add("1787");
        MatchSchedule.add("2582");
        MatchSchedule.add("2875");
        MatchSchedule.add("4188");
        MatchSchedule.add("801");
        MatchSchedule.add("4611");
        MatchSchedule.add("1683");
        MatchSchedule.add("1747");
        MatchSchedule.add("4381");
        MatchSchedule.add("4342");
        MatchSchedule.add("9120");
        MatchSchedule.add("1706");
        MatchSchedule.add("8738");
        MatchSchedule.add("325");
        MatchSchedule.add("9593");
        MatchSchedule.add("1477");
        MatchSchedule.add("4020");
        MatchSchedule.add("4451");
        MatchSchedule.add("4145");




        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override

            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });

        //MatchSchedule = new ArrayList<>();
        //MatchSchedule.add("706");
        //MatchSchedule.add("4021");
       // try (BufferedReader br = new BufferedReader(new FileReader("MatchSchedule.csv"))) {
           // String line;
           // while ((line = br.readLine()) != null) {
           //     String[] values = line.split(",");
           //     recor
          //  }
      //  }









        Match_Num_txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Match_Num_txt.getText().toString().isEmpty()){
                    Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());
                    Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
                    if (Compare_Match_Num < Match_Num_Real){
                        Toast.makeText(Data_Collection_Page_1.this, "That is not a valid match number. Please try again!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        TextView TeamNumTB = findViewById(R.id.TeamNumTB);
                        TeamNumTB.setText(MatchSchedule.get(Match_Num_Real - 1));
                    }
                }

            }
        });
        Button OverrideTeamnum = (Button) findViewById(R.id.Override_Teamnum_B);
        OverrideTeamnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.Team_Num_txt);
                et.setVisibility(View.VISIBLE);

                TextView tv = (TextView)findViewById(R.id.TeamNumTB);
                tv.setVisibility(View.INVISIBLE);
                Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
            }
        });

        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (Initials_txt.getText().toString().isEmpty() || Match_Num_txt.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                } else {
                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());

                    if (NoShowCB.isChecked()) {
                        NoShow = "True";
                    }

                    if (Compare_Match_Num > Match_Num_Real) {

                        if(et.getText().toString().isEmpty() ) {
                            Team_Num = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1));
                            //Sets team num data to txt box information
                        }
                        else {
                            Team_Num = Integer.parseInt(et.getText().toString());
                        }
                        Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                        Initials = Initials_txt.getText().toString();






                        //Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                        //startActivity(startintent);


                    } else {
                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                    }

                    //Defines Start button and takes to next page as well as recording data
                    Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
                    Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button ~ an onclick listener is when the code is looking for you to click(event) so that it can make something visible
                        @Override
                        public void onClick(View v) {
                            TextView TeamNumTB = findViewById(R.id.TeamNumTB);
                            TeamNumTB.setText(MatchSchedule.get(Match_Num_Real - 1));
                            int Team_Num_Real = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1));
                            if (Compare_Team_Num < Team_Num_Real) {
                                Team_Num = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1)); //Sets team num data to txt box information
                                String teamnumpls = Integer.toString(Team_Num);
                                Intent teamnumintent = new Intent(Data_Collection_Page_1.this, data_Collection_sandstorm.class);
                                teamnumintent.putExtra(Team_Num_Display, teamnumpls);
                                startActivity(teamnumintent);
                            } else {
                                Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();

                            }

                        }
                    });

                }
            }
        });}}