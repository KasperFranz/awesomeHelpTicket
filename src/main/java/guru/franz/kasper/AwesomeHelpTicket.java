package guru.franz.kasper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.MetricsLite;

/**
 * The main class for this bukkit plugin :)
 * @author Franz
 */
public class AwesomeHelpTicket extends JavaPlugin {
    private boolean DEBUG = false;

    /**
     * This enables this plugin :) 
     */
    @Override
    public void onEnable() {
     
        try {
            MetricsLite metrics = new MetricsLite(this);
            metrics.start();
        } catch (IOException e) {
            getLogger().info("Metrics not started");
        }

        getLogger().log(Level.INFO, "[{0}] {1} enabled.", new Object[]{getDescription().getName(), getDescription().getVersion()});
    }

    /**
     * the disable method for the plugin
     */
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "[{0}] {1} disabled.", new Object[]{getDescription().getName(), getDescription().getVersion()});
    }
}
