package swart525.dw.md.scout.space.a525spacescout;

import static swart525.dw.md.scout.space.a525spacescout.Tablet_IDKt.loadTabletConfig;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything below this line do not edit

            //WARNING: Anything above this line do not edit

        final Button robotLabel = (Button) findViewById(R.id.robotLabel_B);
        robotLabel.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public void onLongClick(View v) {
                TabletConfig config = Tablet_IDKt.loadTabletConfig(this);

                if (config != null) {
                    String displayText = config.getRobotColor() + " " + config.getRobotNumber();
                    robotLabel.setText(displayText);
                } else {
                    robotLabel.setText("Config not found");
                }
            }
        });;

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            //Below are all the variables that need to be reset back to "False" or "0" after each form is filled out
            @Override
            public void onClick(View v) {


                Data_Collection_Page_1.Team_Num = 0;
                Data_Collection_Page_1.Match_Num = 0;
                Data_Collection_Page_1.Initials = "False";
                Data_Collection_Page_1.NoShow = "False";
                data_Collection_sandstorm.cycles = 0;
                data_Collection_sandstorm.FuelNumAuto = 0;
                data_Collection_sandstorm.depot = "False";
                data_Collection_sandstorm.neutral_zone = "False";
                data_Collection_sandstorm.outpost = "False";
                data_Collection_sandstorm.hangedYes = "False";
                data_Collection_sandstorm.hangedNo = "False";
                data_Collection_sandstorm.hangAttemptAuto = "False";
                data_collection_TeleOP.Tipped = "False";
                data_collection_TeleOP.Stall = "False";
                data_collection_TeleOP.DefenseActive = "False";
                data_collection_TeleOP.FuelTeleNum = 0;
                data_collection_TeleOP.Fouls = "False";
                data_collection_TeleOP.DefenseInactive = "False";
                data_collection_TeleOP.ScoreFuel = "False";
                data_collection_TeleOP.FerryInactive = "False";
                data_collection_TeleOP.FerryActive = "False";
                data_collection_TeleOP.NoneInactive = "False";
                data_collection_TeleOP.NoneActive = "False";
                data_collection_end_game.hangL1 = "False";
                data_collection_end_game.hangL2 = "False";
                data_collection_end_game.hangL3 = "False";
                data_collection_end_game.PercentValue = 0;
                data_collection_end_game.hangNone = "False";
                data_collection_end_game.hangAttempt = "False";
                data_collection_end_game.Defense = "False";
                data_collection_end_game.ferryEnd = "False";
                data_collection_end_game.scoreFuelEnd = "False";
                data_collection_end_game.noneEnd = "False";
                data_collection_end_game.fouledEnd = "False";
                data_collection_end_game.tippedEnd = "False";
                data_collection_end_game.stalledEnd = "False";

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