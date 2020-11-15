package fr.k0bus.nmslib;

import org.bukkit.plugin.java.JavaPlugin;

public final class NMSLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("NMS load version " + Minecraft.getVersion());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
