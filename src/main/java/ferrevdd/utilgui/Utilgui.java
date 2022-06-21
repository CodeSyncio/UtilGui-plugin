package ferrevdd.utilgui;
import ferrevdd.utilgui.events.ClickEvent;
import ferrevdd.utilgui.commands.guicom;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Utilgui extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {

        getCommand("gui").setExecutor(new guicom());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
    }
    @Override
    public void onDisable() {

    }
}
