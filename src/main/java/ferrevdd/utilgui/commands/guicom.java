package ferrevdd.utilgui.commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class guicom implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("Util.*")) {
                Inventory gui = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Utility Gui");

                player.openInventory(gui);
                ItemStack kill = new ItemStack(Material.END_CRYSTAL);
                ItemStack heal = new ItemStack(Material.GOLDEN_APPLE);
                ItemStack creative = new ItemStack(Material.BEDROCK);
                ItemStack survival = new ItemStack(Material.APPLE);


                ItemMeta kill_itemdata = kill.getItemMeta();
                kill_itemdata.setDisplayName(ChatColor.DARK_RED + "Reset your character");
                kill.setItemMeta(kill_itemdata);

                ItemMeta heal_itemdata = heal.getItemMeta();
                heal_itemdata.setDisplayName(ChatColor.GOLD + "Heal ur character");
                heal.setItemMeta(heal_itemdata);

                ItemMeta creative_itemdata = creative.getItemMeta();
                creative_itemdata.setDisplayName(ChatColor.DARK_AQUA + "switch to gamemode creative");
                creative.setItemMeta(creative_itemdata);

                ItemMeta survival_itemdata = survival.getItemMeta();
                survival_itemdata.setDisplayName(ChatColor.GREEN + "switch to gamemode survival");
                survival.setItemMeta(survival_itemdata);

                ItemStack[] menuitems = {kill, heal, creative, survival};
                gui.setContents(menuitems);
                player.openInventory(gui);
            }
            return true;
        }
        return true;
    }
}

