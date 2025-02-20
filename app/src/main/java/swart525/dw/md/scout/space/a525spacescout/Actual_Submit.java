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
            Data_Collection_Page_1.Team_Num + "," +
            Data_Collection_Page_1.Match_Num + "," +
                    data_Collection_sandstorm.autoMoved + "," +
            data_Collection_sandstorm.autoCoralL1 + "," +
            data_Collection_sandstorm.autoCoralL2 + "," +
            data_Collection_sandstorm.autoCoralL3 + "," +
            data_Collection_sandstorm.autoCoralL4 + "," +
            data_Collection_sandstorm.autoAlgaeKnockedOff + "," +
            data_Collection_sandstorm.autoProcessed + "," +
            data_collection_TeleOP.teleCoralL1 + "," +
            data_collection_TeleOP.teleCoralL2 + "," +
            data_collection_TeleOP.teleCoralL3 + "," +
            data_collection_TeleOP.teleCoralL4 + "," +
            data_collection_TeleOP.teleAlgaeKnockedOff + "," +
            data_collection_TeleOP.teleProcessed + "," +
            data_collection_TeleOP.teleRobotNet + "," +
            data_collection_end_game.shallow + "," +
            data_collection_end_game.deep + "," +
            data_collection_end_game.parked + "," +
            data_collection_end_game.noAttempt + "," +
            data_collection_end_game.Defense + "," +
            data_collection_end_game.Fouls + "," +
            data_collection_end_game.RobotTip + "," +
            data_collection_end_game.RobotStall + "," +
            Data_Collection_Page_1.Initials + "," +
            Data_Collection_Page_1.NoShow + ",";


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










