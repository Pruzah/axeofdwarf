package com.pruzah.axeofdwarfmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.custom.DrakeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DrakeRenderer extends GeoEntityRenderer<DrakeEntity> {
    public DrakeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DrakeModel());
        this.shadowRadius = 2.3f;
    }


    @Override
    public ResourceLocation getTextureLocation(DrakeEntity instance) {
        return new ResourceLocation(Main.MODID, "textures/entity/drake.png");
    }

    @Override
    public RenderType getRenderType(DrakeEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(2.8F, 2.8F, 2.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}