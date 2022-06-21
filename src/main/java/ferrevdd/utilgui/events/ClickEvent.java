package ferrevdd.utilgui.events;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

import javax.swing.text.html.parser.Entity;
import java.util.Set;

public class ClickEvent implements Listener {
    @EventHandler
    public void ClickEvent(InventoryClickEvent inv) {

        if (inv.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Utility Gui")) {
            Player player = (Player) inv.getWhoClicked();

            switch (inv.getCurrentItem().getType()){
                case END_CRYSTAL:
                    player.setHealth(0.0);
                    player.sendMessage(ChatColor.RED+"U have committed suicide");
                    break;
                case GOLDEN_APPLE:
                    player.setHealth(20.0);
                    player.sendMessage(ChatColor.GOLD+"U have been healed");
                    break;
                case BEDROCK:
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.DARK_AQUA+"Ur gamemode has been changed to creative");
                    break;
                case APPLE:
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.DARK_AQUA+"Ur gamemode has been changed to survival");
                    break;
                case END_ROD:
                    Block targetblock =  player.getTargetBlock(null,100);
                       Location loc = targetblock.getLocation();
                    player.getWorld().spawnEntity(loc, EntityType.LIGHTNING);
                    player.sendMessage(ChatColor.DARK_AQUA+"lightning has been spawned");
                    break;
            }
            inv.setCancelled(true);
        }
    }
}
