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
                data_Collection_sandstorm.autoCoralL1 = 0;
                data_Collection_sandstorm.autoCoralL2 = 0;
                data_Collection_sandstorm.autoCoralL3 = 0;
                data_Collection_sandstorm.autoCoralL4 = 0;
                data_Collection_sandstorm.autoAlgaeKnockedOff = "False";
                data_Collection_sandstorm.autoProcessed = 0;
                data_collection_TeleOP.teleCoralL1 = 0;
                data_collection_TeleOP.teleCoralL2 = 0;
                data_collection_TeleOP.teleCoralL3 = 0;
                data_collection_TeleOP.teleCoralL4 = 0;
                data_collection_TeleOP.teleAlgaeKnockedOff = "False";
                data_collection_TeleOP.teleProcessed = 0;
                data_collection_TeleOP.teleRobotNet = 0;
                data_collection_end_game.shallow = "False";
                data_collection_end_game.deep = "False";
                data_collection_end_game.parked = "False";
                data_collection_end_game.noAttempt = "False";
                data_collection_TeleOP.RobotTip = "False";
                data_collection_TeleOP.RobotStall = "False";
                data_collection_TeleOP.Defense = "False";
                data_collection_TeleOP.Fouls = "False";
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