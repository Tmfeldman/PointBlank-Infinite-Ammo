package net.steakboi.pointblankinfiniteammo.mixin;

import com.vicmatskiv.pointblank.item.GunItem;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

//net.minecraft.world.entity.player.Player
@Mixin(GunItem.class)
public abstract class PointBlankInfiniteAmmoMixin {
	@Redirect(method = "canReloadGun", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;isCreative()Z"))
	private boolean injected(PlayerEntity player) {
		return true;
	}

	@Redirect(method = "reloadGun", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;isCreative()Z"))
	private boolean injected2(PlayerEntity player) {
		return true;
	}
}