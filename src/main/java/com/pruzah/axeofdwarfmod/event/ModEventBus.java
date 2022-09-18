package com.pruzah.axeofdwarfmod.event;

import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.EntityRegister;
import com.pruzah.axeofdwarfmod.entity.custom.DrakeEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.GeckoLibMod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBus {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        if (!FMLEnvironment.production && !GeckoLibMod.DISABLE_IN_DEV) {
            event.put(EntityRegister.DRAKE.get(), DrakeEntity.setAttributes());
        }
    }
}
