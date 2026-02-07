package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static int cycles = 0;
    public static String depot = "False";
    public static String neutral_zone = "False";
    public static String outpost = "False";
    public static String hanged = "Empty";
    public static String averageFuelScored = "Empty";

    //public static List<String> others = new ArrayList<>();

    public static String Team_Num_Display = "0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        TextView TeamNumSandy = findViewById(R.id.TeamNumSandyTV);
        Intent teamnumintent = getIntent();
        String sandstormteamnumstring = teamnumintent.getStringExtra(Data_Collection_Page_1.Team_Num_Display);
        TeamNumSandy.setText(sandstormteamnumstring);

        // int Team_Num_Real = bundle.getInt("code");
        final RadioButton Fuel010AutoRB = (RadioButton) findViewById(R.id.AutoCycles010_RB);
        final RadioButton Fuel1130AutoRB = (RadioButton) findViewById(R.id.AutoCycles1130_RB);
        final RadioButton Fuel3150AutoRB = (RadioButton) findViewById(R.id.AutoCycles3150_RB);
        final RadioButton Fuel5170AutoRB = (RadioButton) findViewById(R.id.AutoCycles5170_RB);
        final RadioButton Fuel70PlusAutoRB = (RadioButton) findViewById(R.id.AutoCyclesto71andbeyond_RB);
        //Defines and implements Button to continue along with variable savings
        Button CyclePlus = findViewById(R.id.AutoCyclesPlus_GB);
        Button CycleMinus = findViewById(R.id.AutoCyclesMinus_GB);
        Button DepotButton = findViewById(R.id.AutoDepot_B);
        Button OutpostButton = findViewById(R.id.AutoOutpost_B);
        Button NeutralZoneButton = findViewById(R.id.AutoNeutralZone_B);

        //RadioButton Instantiation
        RadioButton AutoHangL1YesRB = findViewById(R.id.AutoHangL1Yes_RB);
        RadioButton AutoHangL1NoRB = findViewById(R.id.AutoHangL1No_RB);

        //Button to move to next page
        Button To_TeleOp = findViewById(R.id.To_Teleop_B);

        TextView CyclesText = findViewById(R.id.AutoCyclesScored_TV);


        CyclePlus.setOnClickListener(view -> {
            cycles += 1;
            CyclesText.setText(String.valueOf(cycles));
        });


        CycleMinus.setOnClickListener(view -> {
                cycles -= 1;
                CyclesText.setText(String.valueOf(cycles));
        });

        DepotButton.setOnClickListener(view -> {
             String colorCode = (String) DepotButton.getTag();
             if (!"#FFE600".equals(colorCode)){
                 DepotButton.setBackgroundColor(ContextCompat.getColor(DepotButton.getContext(), R.color.colorPrimary));
                 DepotButton.setTag("#FFE600");
                 depot = "true";


                 }
             else if("#FFE600".equals(colorCode)){
                 DepotButton.setBackgroundColor(ContextCompat.getColor(DepotButton.getContext(), R.color.grey_button));
                 DepotButton.setTag("D7D7D7D5");
                 depot = "false";
                 }

        });
        OutpostButton.setOnClickListener(view -> {
            String colorCode = (String) OutpostButton.getTag();
            if (!"#FFE600".equals(colorCode)){
                OutpostButton.setBackgroundColor(ContextCompat.getColor(OutpostButton.getContext(), R.color.colorPrimary));
                OutpostButton.setTag("#FFE600");
                outpost = "true";


            }
            else if("#FFE600".equals(colorCode)){
                OutpostButton.setBackgroundColor(ContextCompat.getColor(OutpostButton.getContext(), R.color.grey_button));
                OutpostButton.setTag("D7D7D7D5");
                outpost = "false";
            }

        });
        NeutralZoneButton.setOnClickListener(view -> {
            String colorCode = (String) NeutralZoneButton.getTag();
            if (!"#FFE600".equals(colorCode)){
                NeutralZoneButton.setBackgroundColor(ContextCompat.getColor(NeutralZoneButton.getContext(), R.color.colorPrimary));
                NeutralZoneButton.setTag("#FFE600");
                neutral_zone = "true";


            }
            else if("#FFE600".equals(colorCode)){
                NeutralZoneButton.setBackgroundColor(ContextCompat.getColor(NeutralZoneButton.getContext(), R.color.grey_button));
                NeutralZoneButton.setTag("D7D7D7D5");
                neutral_zone = "false";
            }

        });


        //Makes onclick listener for button
        To_TeleOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            //Ending position variables
            //Because these are radio buttons, they may need to be changed to isChecked
            if (AutoHangL1YesRB.isChecked()) {
                hanged = "True";
            }
            if (AutoHangL1NoRB.isChecked()) {
                hanged = "False";
            }

            if (Fuel010AutoRB.isChecked()) {
                averageFuelScored = "0-10";
            }
            else if (Fuel1130AutoRB.isChecked()) {
                averageFuelScored= "11-30";
            }
            else if (Fuel3150AutoRB.isChecked()) {
                averageFuelScored = "31-50";
            }
            else if (Fuel5170AutoRB.isChecked()) {
                averageFuelScored = "51-70";
            }
            else if (Fuel70PlusAutoRB.isChecked()) {
                averageFuelScored = "70+";
            }

            if (averageFuelScored.equals("Empty"))
            {
                Toast.makeText(data_Collection_sandstorm.this, "Please Choose Avg. Fuel Scored Per Cycle!!!!!", Toast.LENGTH_LONG).show();
            }

            if (hanged.equals("Empty"))
            {
                Toast.makeText(data_Collection_sandstorm.this, "Please select an ending position!", Toast.LENGTH_LONG).show();
            }


            //add in data collection pieces from checkboxes
            Intent teamnumintent1 = new Intent(getApplicationContext(), data_collection_TeleOP.class);
            teamnumintent1.putExtra(Team_Num_Display, sandstormteamnumstring);
            startActivity(teamnumintent1);
            //Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
            //startActivity(startintent);
        };



                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
    });

        };

        };

