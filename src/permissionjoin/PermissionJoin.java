package permissionjoin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PermissionJoin extends JavaPlugin
  implements Listener
{
    public void onEnable(){
        getLogger().info("插件加载成功");
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable(){
        getLogger().info("插件加载失败");
    }

  @EventHandler
  public void VJ1(PlayerJoinEvent e)
  {
    Player ps = e.getPlayer();
    if (ps.hasPermission("minez.vipjoin")) {
    }else{
        Player p = e.getPlayer();
        p.kickPlayer("PvE线路禁止PvP且只允许MineZ VIP玩家进入，请加群53733806查看特权并决定是否购买");
  }
    }
      }