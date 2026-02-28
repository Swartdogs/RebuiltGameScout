package swart525.dw.md.scout.space.a525spacescout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import swart525.dw.md.scout.space.a525spacescout.TabletConfig;

public class Start_Page extends AppCompatActivity {

    private TextView headerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);

        headerText = findViewById(R.id.robotLabelTV);

        // Check storage permission first
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        } else {
            // Permission already granted, load config
            loadAndApplyConfig();
        }

        //WARNING: Anything below this line do not edit

        // Your original buttons and onClickListeners remain exactly as before
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B);
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() {
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
                data_collection_TeleOP.cyclesTele = 0;
                data_collection_end_game.PercentValue = 0;
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

        //WARNING: Anything above this line do not edit
    }

    // Handle runtime permission result
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadAndApplyConfig();
            } else {
                Toast.makeText(this, "Storage permission needed to read config!", Toast.LENGTH_LONG).show();
            }
        }
    }

    // Load JSON and update header safely
    private void loadAndApplyConfig() {
        TabletConfig.loadConfig();

        headerText.setText(
                TabletConfig.allianceColor.substring(0, 1).toUpperCase()
                        + TabletConfig.allianceColor.substring(1).toUpperCase()
                        + " "
                        + TabletConfig.teamNumber
                        + " ROBOT"
        );

        if (TabletConfig.allianceColor.equals("red")) {
            headerText.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        } else if (TabletConfig.allianceColor.equals("blue")) {
            headerText.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
        }
    }
}