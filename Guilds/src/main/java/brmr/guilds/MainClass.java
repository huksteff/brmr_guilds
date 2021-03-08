package brmr.guilds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass  extends JavaPlugin {

    private Context _context;

    @Override
    public void onEnable()
    {
        _context = new Context();
        _context.Logger = getLogger();
        _context.Logger.info("Huita Stared");

    }

    @Override
    public void onDisable()
    {
        _context.Logger.info("Huita Stopped");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (command.getName().equalsIgnoreCase("guild"))
        {
            sender.sendMessage("чото делаем");
            return true;
        }
        return false;
    }
}
