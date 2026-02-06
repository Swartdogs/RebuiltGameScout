package swart525.dw.md.scout.space.a525spacescout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Actual_Submit extends AppCompatActivity {

    //Names the file it will be saved to

    public String fileName = "Blue_1_Data.csv";
    public String filePath = "/ScoutData/";
    //Compiles string for CSV file
    public String Final_String =
            Data_Collection_Page_1.Team_Num + ","+
            Data_Collection_Page_1.Match_Num + ","+
            data_Collection_sandstorm.cycles + "," +
            data_Collection_sandstorm.depot + "," +
            data_Collection_sandstorm.neutral_zone + "," +
            data_Collection_sandstorm.outpost + "," +
            data_Collection_sandstorm.hanged + "," +
            data_Collection_sandstorm.Fuel010Auto + "," +
            data_Collection_sandstorm.Fuel1120Auto + "," +
            data_Collection_sandstorm.Fuel2130Auto + "," +
            data_Collection_sandstorm.Fuel3140Auto + "," +
            data_Collection_sandstorm.Fuel4150Auto + "," +
            data_Collection_sandstorm.Fuel5160Auto + "," +
            data_Collection_sandstorm.Fuel6170Auto + "," +
            data_Collection_sandstorm.Fuel70PlusAuto + "," +
            data_collection_TeleOP.Tipped + "," +
            data_collection_TeleOP.Stall + "," +
            data_collection_TeleOP.DefenseActive + "," +
            data_collection_TeleOP.Fuel1120 + "," +
            data_collection_TeleOP.Fuel2130 + "," +
            data_collection_TeleOP.Fuel3140 + "," +
            data_collection_TeleOP.Fuel4150 + "," +
            data_collection_TeleOP.Fuel5160 + "," +
            data_collection_TeleOP.Fuel6170 + "," +
            data_collection_TeleOP.Fuel70Plus + "," +
            data_collection_TeleOP.Fouls + "," +
            data_collection_TeleOP.DefenseInactive + "," +
            data_collection_TeleOP.ScoreFuel + "," +
            data_collection_TeleOP.FerryInactive + "," +
            data_collection_TeleOP.FerryActive + "," +
            data_collection_TeleOP.NoneInactive + "," +
            data_collection_TeleOP.NoneActive + "," +
            data_collection_TeleOP.cyclesTele + "," +
            data_collection_TeleOP.percent + "," +
            data_collection_end_game.hangL1 + "," +
            data_collection_end_game.hangL2 + "," +
            data_collection_end_game.hangL3 + "," +
            data_collection_end_game.hangNone + "," +
            data_collection_end_game.Defense + "," +
            data_collection_end_game.ferryEnd + "," +
            data_collection_end_game.scoreFuelEnd + "," +
            data_collection_end_game.noneEnd + "," +
            data_collection_end_game.fouledEnd + "," +
            data_collection_end_game.tippedEnd + "," +
            data_collection_end_game.stalledEnd + "," +
            Data_Collection_Page_1.Initials + "," +
            Data_Collection_Page_1.NoShow;


    File externalStorageDir = Environment.getExternalStorageDirectory();
    public File Scout_Data = new File(externalStorageDir , "/DCIM/" + fileName);

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);
        Button Press_Here = (Button) findViewById(R.id.Press_Here);
        Button Click_to_go_Back = (Button) findViewById(R.id.Backto);

        Click_to_go_Back.setOnClickListener(new View.OnClickListener(){//Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
    } */


    //Checks for confirmation from external storage
        private boolean isExternalStorageWritable () {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                Log.i("State", "Yes, it is writable!");
                return true;
            } else {
                return false;
            }
        }

        public void Press_Here (View v){
            if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                if(Scout_Data.exists() && Scout_Data.isFile() ){
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Scout_Data, true)));
                        out.println(Final_String);
                        out.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    File textFile = new File(Environment.getExternalStorageDirectory().getPath() + "/DCIM", fileName);
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        FileOutputStream fos = new FileOutputStream(textFile);
                        Final_String = Final_String + "\n";
                        fos.write(Final_String.getBytes());
                        fos.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                //write an else if - turn on permissions
            }
        }

    public boolean checkPermission (String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actual__submit);
            final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
            Press_Here.setVisibility(View.VISIBLE);

    }
}










