package net.fasth.sachel.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fasth.sachel.Sachel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SACHEL = registerItem("sachel", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Sachel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Sachel.LOGGER.info("Registering Mod Items for " + Sachel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SACHEL);
        });
    }
}