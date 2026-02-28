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

    public String Final_String;

    public Actual_Submit() {
        Final_String = Data_Collection_Page_1.Team_Num + ","+
                Data_Collection_Page_1.Match_Num + ","+
                Data_Collection_Page_1.Initials + "," +
                Data_Collection_Page_1.NoShow + "," +
                data_Collection_sandstorm.cycles + "," +
                data_Collection_sandstorm.FuelNumAuto + "," +
                data_Collection_sandstorm.depot + "," +
                data_Collection_sandstorm.neutral_zone + "," +
                data_Collection_sandstorm.outpost + "," +
                data_Collection_sandstorm.hangedYes + "," +
                data_Collection_sandstorm.hangedNo + "," +
                data_Collection_sandstorm.hangAttemptAuto + "," +
                data_collection_TeleOP.cyclesTele + "," +
                data_collection_end_game.PercentValue + "," +
                data_collection_TeleOP.FuelTeleNum + "," +
                data_collection_TeleOP.ScoreFuel + "," +
                data_collection_TeleOP.FerryActive + "," +
                data_collection_TeleOP.DefenseActive + "," +
                data_collection_TeleOP.NoneActive + "," +
                data_collection_TeleOP.FerryInactive + "," +
                data_collection_TeleOP.DefenseInactive + "," +
                data_collection_TeleOP.NoneInactive + "," +
                data_collection_end_game.hangL1 + "," +
                data_collection_end_game.hangL2 + "," +
                data_collection_end_game.hangL3 + "," +
                data_collection_end_game.hangNone + "," +
                data_collection_end_game.hangAttempt + ","+
                data_collection_end_game.scoreFuelEnd + "," +
                data_collection_end_game.ferryEnd + "," +
                data_collection_end_game.Defense + "," +
                data_collection_end_game.noneEnd + "," +
                data_collection_end_game.fouledEnd + "," +
                data_collection_end_game.tippedEnd + "," +
                data_collection_end_game.stalledEnd;
    }

    private boolean isExternalStorageWritable() {
        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }

    public void Press_Here(View v){

        if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

            TabletConfig.loadConfig();

            String alliance = TabletConfig.allianceColor.substring(0,1).toUpperCase()
                    + TabletConfig.allianceColor.substring(1).toLowerCase();

            int team = TabletConfig.teamNumber;

            String fileName = alliance + "_" + team + "_Data.csv";

            File directory = new File(Environment.getExternalStorageDirectory(), "DCIM");
            File scoutDataFile = new File(directory, fileName);

            try {
                final Button Press_Here = findViewById(R.id.Press_Here_B);

                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(scoutDataFile, true)));
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
    }

    public boolean checkPermission(String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);

        final Button Press_Here = findViewById(R.id.Press_Here_B);
        Press_Here.setVisibility(View.VISIBLE);
    }
}