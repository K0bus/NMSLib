package fr.k0bus.nmslib.utils;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.v1_16_R3.MojangsonParser;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemSerialize {
    public static ItemStack deserializeItemStack(String json) {
        if (json == null || json.equals("empty")) {
            return null;
        }
        try {
            NBTTagCompound comp = MojangsonParser.parse(json);
            net.minecraft.server.v1_16_R3.ItemStack cis = net.minecraft.server.v1_16_R3.ItemStack.a(comp);
            return CraftItemStack.asBukkitCopy(cis);
        } catch (CommandSyntaxException ex) {
            ex.printStackTrace();
        }
        return new ItemStack(Material.PAPER);
    }
    public static String getText(String json) {
        if (json == null || json.equals("empty")) {
            return null;
        }
        try {
            NBTTagCompound comp = MojangsonParser.parse(json);
            net.minecraft.server.v1_16_R3.ItemStack cis = net.minecraft.server.v1_16_R3.ItemStack.a(comp);
            return CraftItemStack.asBukkitCopy(cis).getType().name() + " x" + CraftItemStack.asBukkitCopy(cis).getAmount();
        } catch (CommandSyntaxException ex) {
            ex.printStackTrace();
        }
        return "Invalide !";
    }
    public static String serializeItemStack(ItemStack is) {
        if (is == null)
            return "empty";
        net.minecraft.server.v1_16_R3.ItemStack nms = CraftItemStack.asNMSCopy(is);
        NBTTagCompound tag = new NBTTagCompound();
        nms.save(tag);
        return tag.toString();
    }
}
