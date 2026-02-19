package swart525.dw.md.scout.space.a525spacescout
import android.content.Context;
import java.io.File;
import  android.util.Log;
import com.google.gson.Gson


data class TabletConfig(
    val robotColor: String,
    val robotNumber: Int
)

fun loadTabletConfig(context: Context): TabletConfig? {
    val configFile = File("/storage/emulated/0/Tablet ID.json")

    if (!configFile.exists()) {
        Log.e("Config", "Config file not found")
        return null
    }

    return try {
        val json = configFile.readText()
        val gson = Gson()
        gson.fromJson(json, TabletConfig::class.java)
    } catch (e: Exception) {
        Log.e("Config", "Error reading config: ${e.message}")
        null
    }
}