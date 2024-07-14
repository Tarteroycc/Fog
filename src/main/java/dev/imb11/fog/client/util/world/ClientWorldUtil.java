package dev.imb11.fog.client.util.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class ClientWorldUtil {
	public static boolean isFogDenseAtPosition(@NotNull final ClientWorld clientWorld, @NotNull final BlockPos blockPosition) {
		return clientWorld.getDimensionEffects().useThickFog(
				blockPosition.getX(), blockPosition.getZ()) || MinecraftClient.getInstance().inGameHud.getBossBarHud().shouldThickenFog();
	}
}