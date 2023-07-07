
package net.mcreator.urth.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.urth.entity.TempEntity;

public class TempRenderer extends MobRenderer<TempEntity, SilverfishModel<TempEntity>> {
	public TempRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TempEntity entity) {
		return new ResourceLocation("urth:textures/entities/temp.png");
	}
}
