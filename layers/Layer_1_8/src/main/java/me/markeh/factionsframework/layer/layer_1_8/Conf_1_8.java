package me.markeh.factionsframework.layer.layer_1_8;

import org.bukkit.ChatColor;

import com.massivecraft.factions.Conf;

import me.markeh.factionsframework.layer.ConfLayer;

public class Conf_1_8 extends ConfLayer {

	@Override
	public String getPrefixLeader() {
		return Conf.prefixLeader;
	}

	@Override
	public String getPrefixOfficer() {
		return Conf.prefixOfficer;
	}

	@Override
	public String getPrefixMember() {
		return Conf.prefixMember;
	}

	@Override
	public String getPrefixRecruit() {
		return Conf.prefixRecruit;
	}

	@Override
	public ChatColor getColorMember() {
		return Conf.colorMember;
	}

	@Override
	public ChatColor getColorAlly() {
		return Conf.colorAlly;
	}

	@Override
	public ChatColor getColorNeutral() {
		return Conf.colorNeutral;
	}

	@Override
	public ChatColor getColorTruce() {
		return Conf.colorTruce;
	}

	@Override
	public ChatColor getColorEnemy() {
		return Conf.colorEnemy;
	}
	
}
