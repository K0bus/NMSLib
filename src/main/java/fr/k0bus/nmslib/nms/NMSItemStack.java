package fr.k0bus.nmslib.nms;

import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NMSItemStack {
    public static String getNMSName(ItemStack item)
    {
        return CraftItemStack.asNMSCopy(item).getName().getString();
    }
}
