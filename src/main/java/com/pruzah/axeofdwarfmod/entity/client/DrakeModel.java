package com.pruzah.axeofdwarfmod.entity.client;

import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.custom.DrakeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DrakeModel extends AnimatedGeoModel<DrakeEntity> {
    @Override
    public ResourceLocation getModelResource(DrakeEntity object) {
        return new ResourceLocation(Main.MODID, "geo/drake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrakeEntity object) {
        return new ResourceLocation(Main.MODID, "textures/entity/drake.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrakeEntity animatable) {
        return new ResourceLocation(Main.MODID, "animations/drake.animation.json");
    }
}
