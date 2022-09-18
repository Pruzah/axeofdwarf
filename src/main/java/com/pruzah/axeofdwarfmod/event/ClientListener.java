package com.pruzah.axeofdwarfmod.event;

import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.EntityRegister;
import com.pruzah.axeofdwarfmod.entity.client.DrakeRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.GeckoLibMod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        if (!FMLEnvironment.production && !GeckoLibMod.DISABLE_IN_DEV) {
            event.registerEntityRenderer(EntityRegister.DRAKE.get(), DrakeRenderer::new);
        }
    }
}