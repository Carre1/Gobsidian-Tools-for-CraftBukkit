package com.gobsidian.toolsForBukkit;

/**
 * Created by carre on 2017/8/13.
 * FirstBukkitPlugins
 */

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        System.out.println("Hello,world!");
    }
    @Override
    public void onDisable(){
        System.out.println("");
    }
}
