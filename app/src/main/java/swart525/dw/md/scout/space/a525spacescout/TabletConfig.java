package swart525.dw.md.scout.space.a525spacescout;

import android.os.Environment;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class TabletConfig {

    public static String allianceColor = "red";
    public static int teamNumber = 1;

    public static void loadConfig() {

        try {
            File file = new File(
                    Environment.getExternalStorageDirectory(),
                    "DCIM/scouting_config.json"
            );

            if (file.exists()) {

                FileInputStream fis = new FileInputStream(file);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();

                byte[] buffer = new byte[1024];
                int length;

                while ((length = fis.read(buffer)) != -1) {
                    bos.write(buffer, 0, length);
                }

                fis.close();

                String jsonString = bos.toString("UTF-8");

                JSONObject jsonObject = new JSONObject(jsonString);

                allianceColor = allianceColor = jsonObject.getString("alliancecolor")
                        .trim();
                teamNumber = jsonObject.getInt("teamnumber");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}