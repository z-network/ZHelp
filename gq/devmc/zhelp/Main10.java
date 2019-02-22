package gq.devmc.zhelp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main10
  extends JavaPlugin
{
  @EventHandler
  public void onEnable()
  {
    loadConfig();
    
    getLogger().info("§6[Z] Config.");
    getLogger().info("§6[Z] Plugin Enabled");
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    String help = getConfig().getString("config.activated");
    if (cmd.getName().equalsIgnoreCase("help")) {
      if (help == "true")
      {
        if ((sender instanceof Player))
        {
          String prefix = getConfig().getString("config.prefix");
          String line1 = getConfig().getString("config.line1");
          String line2 = getConfig().getString("config.line2");
          String line3 = getConfig().getString("config.line3");
          String line4 = getConfig().getString("config.line4");
          String line5 = getConfig().getString("config.line5");
          String line6 = getConfig().getString("config.line6");
          String line7 = getConfig().getString("config.line7");
          String line8 = getConfig().getString("config.line8");
          String line9 = getConfig().getString("config.line9");
          String line10 = getConfig().getString("config.line10");
          
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line1));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line2));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line3));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line4));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line5));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line6));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line7));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line8));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line9));
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line10));
        }
      }
      else {
        sender.sendMessage(ChatColor.RED + "§8[§6§lZ§8] §7Command Disable");
      }
    }
    return false;
  }
  
  public void loadConfig()
  {
    FileConfiguration cfg = getConfig();
    cfg.options().copyDefaults(true);
    saveConfig();
  }
}
