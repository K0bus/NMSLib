package fr.k0bus.nmslib;

import org.bukkit.Bukkit;

public class Minecraft {
    public static String getVersion()
    {
        String path = Bukkit.getServer().getClass().getPackage().getName();
        String version = path.substring(path.lastIndexOf(".") + 1, path.length());
        return version;
    }
}
