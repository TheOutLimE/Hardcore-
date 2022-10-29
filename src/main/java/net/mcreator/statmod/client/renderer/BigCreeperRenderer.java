
package net.mcreator.statmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.statmod.entity.BigCreeperEntity;
import net.mcreator.statmod.client.model.ModelCreeperBig;

public class BigCreeperRenderer extends MobRenderer<BigCreeperEntity, ModelCreeperBig<BigCreeperEntity>> {
	public BigCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCreeperBig(context.bakeLayer(ModelCreeperBig.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigCreeperEntity entity) {
		return new ResourceLocation("stat_mod:textures/entities/creeper.png");
	}
}
