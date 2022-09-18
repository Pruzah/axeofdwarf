package com.pruzah.axeofdwarfmod.base;

import com.pruzah.axeofdwarfmod.Main;
import com.pruzah.axeofdwarfmod.entity.EntityRegister;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> PRUZAH = ITEMS.register("pruzah",
            () -> new AxeItem(Tiers.IRON, 25F, 0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> DRAKE_SPAWN_EGG = ITEMS.register("drake_spawn_egg",
            () ->   new ForgeSpawnEggItem(EntityRegister.DRAKE, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus)     {
        ITEMS.register(eventBus);
    }

}
