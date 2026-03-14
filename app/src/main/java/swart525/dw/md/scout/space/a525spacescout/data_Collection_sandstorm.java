package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String neutral_zone = "False";
    public static String outpost = "False";
    public static String depot = "False";

    public static String EndDepot = "False";
    public static String EndOutpost = "False";
    public static String EndNeutralZone = "False";
    public static String EndBump = "False";
    public static String EndTrench = "False";
    public static String EndTowerHubandTower = "False";

    public static String hangedYes = "False";
    public static String hangedNo = "False";
    public static String hangAttemptAuto = "False";
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

        //Defines and implements Button to continue along with variable savings
        Button DepotButton = findViewById(R.id.AutoDepot_B);
        Button OutpostButton = findViewById(R.id.AutoOutpost_B);
        Button NeutralZoneButton = findViewById(R.id.AutoNeutralZone_B);

        Button AutoEndDepot = findViewById(R.id.AutoEndDepot_B);
        Button AutoEndOutpost = findViewById(R.id.AutoEndOutpost_B);
        Button AutoEndNeutralZone = findViewById(R.id.AutoEndNeutralZone_B);
        Button AutoEndBump = findViewById(R.id.AutoEndBump_B);
        Button AutoEndTrench = findViewById(R.id.AutoEndTrench_B);
        Button AutoEndTowerHub = findViewById(R.id.AutoEndTowerHub_B);


        //RadioButton Instantiation
        RadioButton AutoHangL1YesRB = findViewById(R.id.AutoHangL1Yes_RB);
        RadioButton AutoHangL1NoRB = findViewById(R.id.AutoHangL1No_RB);
        RadioButton AutoHangL1AttemptRB = findViewById(R.id.AutoHangL1Attempt_RB);

        //Button to move to next page
        Button To_TeleOp = findViewById(R.id.To_Teleop_B);

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

        AutoEndOutpost.setOnClickListener(view -> {
            String colorCode = (String) AutoEndOutpost.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndOutpost.setBackgroundColor(ContextCompat.getColor(AutoEndOutpost.getContext(), R.color.colorPrimary));
                AutoEndOutpost.setTag("#FFE600");
                EndOutpost = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndOutpost.setBackgroundColor(ContextCompat.getColor(AutoEndOutpost.getContext(), R.color.grey_button));
                AutoEndOutpost.setTag("D7D7D7D5");
                EndOutpost = "false";
            }

        });
        AutoEndDepot.setOnClickListener(view -> {
            String colorCode = (String) AutoEndDepot.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndDepot.setBackgroundColor(ContextCompat.getColor(AutoEndDepot.getContext(), R.color.colorPrimary));
                AutoEndDepot.setTag("#FFE600");
                EndDepot = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndDepot.setBackgroundColor(ContextCompat.getColor(AutoEndDepot.getContext(), R.color.grey_button));
                AutoEndDepot.setTag("D7D7D7D5");
                EndDepot = "false";
            }

        });


        AutoEndBump.setOnClickListener(view -> {
            String colorCode = (String) AutoEndBump.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndBump.setBackgroundColor(ContextCompat.getColor(AutoEndBump.getContext(), R.color.colorPrimary));
                AutoEndBump.setTag("#FFE600");
                EndBump = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndBump.setBackgroundColor(ContextCompat.getColor(AutoEndBump.getContext(), R.color.grey_button));
                AutoEndBump.setTag("D7D7D7D5");
                EndBump = "false";
            }

        });
        AutoEndNeutralZone.setOnClickListener(view -> {
            String colorCode = (String) AutoEndNeutralZone.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndNeutralZone.setBackgroundColor(ContextCompat.getColor(AutoEndNeutralZone.getContext(), R.color.colorPrimary));
                AutoEndNeutralZone.setTag("#FFE600");
                EndNeutralZone = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndNeutralZone.setBackgroundColor(ContextCompat.getColor(AutoEndNeutralZone.getContext(), R.color.grey_button));
                AutoEndNeutralZone.setTag("D7D7D7D5");
                EndNeutralZone = "false";
            }

        });

        AutoEndTrench.setOnClickListener(view -> {
            String colorCode = (String) AutoEndTrench.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndTrench.setBackgroundColor(ContextCompat.getColor(AutoEndTrench.getContext(), R.color.colorPrimary));
                AutoEndTrench.setTag("#FFE600");
                EndTrench = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndTrench.setBackgroundColor(ContextCompat.getColor(AutoEndTrench.getContext(), R.color.grey_button));
                AutoEndTrench.setTag("D7D7D7D5");
                EndTrench = "false";
            }

        });
        AutoEndTowerHub.setOnClickListener(view -> {
            String colorCode = (String) AutoEndTowerHub.getTag();
            if (!"#FFE600".equals(colorCode)){
                AutoEndTowerHub.setBackgroundColor(ContextCompat.getColor(AutoEndTowerHub.getContext(), R.color.colorPrimary));
                AutoEndTowerHub.setTag("#FFE600");
                EndTowerHubandTower = "true";


            }
            else if("#FFE600".equals(colorCode)){
                AutoEndTowerHub.setBackgroundColor(ContextCompat.getColor(AutoEndTowerHub.getContext(), R.color.grey_button));
                AutoEndTowerHub.setTag("D7D7D7D5");
                EndTowerHubandTower = "false";
            }

        });
//
//        Auto_FuelSeekBar.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
//
//
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                FuelTxtAuto.setText( "Fuel: " + String.valueOf((i + 1)));
//                FuelNumAuto = (i + 1);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });




        //Makes onclick listener for button
        To_TeleOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            //Ending position variables
            //Because these are radio buttons, they may need to be changed to isChecked
            if (AutoHangL1YesRB.isChecked()) {
                hangedYes = "True";
            }
            if (AutoHangL1NoRB.isChecked()) {
                hangedNo = "True";
            }
            if (AutoHangL1AttemptRB.isChecked()) {
                hangAttemptAuto = "True";
            }


            if (hangedYes.equals("False") && hangedNo.equals("False") && hangAttemptAuto.equals("False"))
            {
                Toast.makeText(data_Collection_sandstorm.this, "Please select an ending position! Let's not give up", Toast.LENGTH_LONG).show();
            }
            else
            {
                Intent teamnumintent1 = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                teamnumintent1.putExtra(Team_Num_Display, sandstormteamnumstring);
                startActivity(teamnumintent1);
            }


        };


    });

        };

        };

