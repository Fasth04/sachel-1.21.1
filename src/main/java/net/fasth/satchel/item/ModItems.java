package net.fasth.satchel.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fasth.satchel.Satchel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SATCHEL = registerItem("satchel", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Satchel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Satchel.LOGGER.info("Registering Mod Items for " + Satchel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SATCHEL);
        });
    }
}
