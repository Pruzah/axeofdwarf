package com.pruzah.axeofdwarfmod;

import com.pruzah.axeofdwarfmod.entity.EntityRegister;
import com.pruzah.axeofdwarfmod.base.ItemRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod.EventBusSubscriber
@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "axeofdwarf";
    public Main()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        ItemRegister.register(modEventBus);

        EntityRegister.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
