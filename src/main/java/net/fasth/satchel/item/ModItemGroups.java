package net.fasth.satchel.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fasth.satchel.Satchel;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SACHEL_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Satchel.MOD_ID, "satchel_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.SATCHEL))
                    .displayName(Text.translatable("itemgroup.satchel.satchel_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SATCHEL);

                    }).build());

    public static void registerItemGroups() {
        Satchel.LOGGER.info("Registering Item for " + Satchel.MOD_ID);
    }
}
