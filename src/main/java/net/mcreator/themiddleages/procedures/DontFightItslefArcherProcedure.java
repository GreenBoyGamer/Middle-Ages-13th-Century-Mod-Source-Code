package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.SoldierEntity;
import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;
import net.mcreator.themiddleages.entity.KnightEntity;
import net.mcreator.themiddleages.entity.ArcherEntity;

public class DontFightItslefArcherProcedure {
	public static boolean execute() {
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if (!(target instanceof ArcherEntity) && !(target instanceof SoldierEntity) && !(target instanceof KnightEntity) && !(target instanceof KnightRidingHorseEntity)) {
			return true;
		}
		return false;
	}
}