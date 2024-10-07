package net.steakboi.pointblankinfiniteammo.mixin;

import com.vicmatskiv.pointblank.item.GunItem;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


//net.minecraft.world.entity.player.Player
@Mixin(GunItem.class)
public abstract class InfiniteAmmoMixin {
    @Redirect(method = "canReloadGun", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;isCreative()Z"))
    private boolean injected(Player player) {
        return true;
    }

    @Redirect(method = "reloadGun", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;isCreative()Z"))
    private boolean injected2(Player player) {
        return true;
    }
}
