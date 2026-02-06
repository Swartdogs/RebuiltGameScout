package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            //Below are all the variables that need to be reset back to "False" or "0" after each form is filled out
            @Override
            public void onClick(View v) {


                Data_Collection_Page_1.Team_Num = 0;
                Data_Collection_Page_1.Match_Num = 0;
                data_Collection_sandstorm.cycles = 0;
                data_Collection_sandstorm.depot = "False";
                data_Collection_sandstorm.neutral_zone = "False";
                data_Collection_sandstorm.outpost = "False";
                data_Collection_sandstorm.hanged = "False";
                data_Collection_sandstorm.Fuel010Auto = "False";
                data_Collection_sandstorm.Fuel1120Auto = "False";
                data_Collection_sandstorm.Fuel2130Auto = "False";
                data_Collection_sandstorm.Fuel3140Auto = "False";
                data_Collection_sandstorm.Fuel4150Auto = "False";
                data_Collection_sandstorm.Fuel5160Auto = "False";
                data_Collection_sandstorm.Fuel6170Auto = "False";
                data_Collection_sandstorm.Fuel70PlusAuto = "False";
                data_collection_TeleOP.Tipped = "False";
                data_collection_TeleOP.Stall = "False";
                data_collection_TeleOP.DefenseActive = "False";
                data_collection_TeleOP.Fuel1120 = "False";
                data_collection_TeleOP.Fuel2130 = "False";
                data_collection_TeleOP.Fuel3140 = "False";
                data_collection_TeleOP.Fuel4150 = "False";
                data_collection_TeleOP.Fuel5160 = "False";
                data_collection_TeleOP.Fuel6170 = "False";
                data_collection_TeleOP.Fuel70Plus = "False";
                data_collection_TeleOP.Fouls = "False";
                data_collection_TeleOP.DefenseInactive = "False";
                data_collection_TeleOP.ScoreFuel = "False";
                data_collection_TeleOP.FerryInactive = "False";
                data_collection_TeleOP.FerryActive = "False";
                data_collection_TeleOP.NoneInactive = "False";
                data_collection_TeleOP.NoneActive = "False";
                data_collection_TeleOP.cyclesTele = 0;
                data_collection_TeleOP.percent = 0;
                data_collection_end_game.hangL2 = "False";
                data_collection_end_game.hangL3 = "False";
                data_collection_end_game.hangNone = "False";
                data_collection_end_game.Defense = "False";
                data_collection_end_game.ferryEnd = "False";
                data_collection_end_game.scoreFuelEnd = "False";
                data_collection_end_game.noneEnd = "False";
                data_collection_end_game.fouledEnd = "False";
                data_collection_end_game.tippedEnd = "False";
                data_collection_end_game.stalledEnd = "False";
                Data_Collection_Page_1.Initials = "False";
                Data_Collection_Page_1.NoShow = "False";



                Intent teamnumintent = new Intent(getApplicationContext(), Data_Collection_Page_1.class);
                startActivity(teamnumintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}