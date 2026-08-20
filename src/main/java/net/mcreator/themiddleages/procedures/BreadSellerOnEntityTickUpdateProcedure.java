package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.entity.BreadSellerEntity;

public class BreadSellerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof BreadSellerEntity _datEntI ? _datEntI.getEntityData().get(BreadSellerEntity.DATA_die) : 0) == 1) {
			entity.getPersistentData().putDouble("SellerDying", (entity.getPersistentData().getDoubleOr("SellerDying", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("SellerDying", 0) >= 20) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, (float) 1.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, (float) 1.3, 1, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}