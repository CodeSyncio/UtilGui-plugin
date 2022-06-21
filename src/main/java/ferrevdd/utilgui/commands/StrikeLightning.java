package ferrevdd.utilgui.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class StrikeLightning implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("Util.*")) {
                Block targetblock = player.getTargetBlock(null, 100);
                Location loc = targetblock.getLocation();
                for (int i=0;i<9;i++){
                player.getWorld().spawnEntity(loc, EntityType.LIGHTNING);}

                player.sendMessage(ChatColor.DARK_AQUA + "lightning has been spawned");
                return true;

            }
        }
    return true;}
}
