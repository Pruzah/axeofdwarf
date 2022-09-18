package com.pruzah.axeofdwarfmod.entity;

import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.custom.DrakeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegister {
    public static final DeferredRegister<EntityType<?>> ENTITTIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Main.MODID);

    public static final RegistryObject<EntityType<DrakeEntity>> DRAKE =
            ENTITTIES.register("drake",
            () -> EntityType.Builder.of(DrakeEntity::new, MobCategory.CREATURE)
                    .sized(2.8F, 2.6F)
                    .build(new ResourceLocation(Main.MODID, "drake").toString()));


    public static void register(IEventBus eventBus)     {
        ENTITTIES.register(eventBus);
    }
}
