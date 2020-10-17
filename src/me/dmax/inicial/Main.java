package me.dmax.inicial;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Plugin iniciado com sucesso!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin desligado com sucesso!");
	}

}
