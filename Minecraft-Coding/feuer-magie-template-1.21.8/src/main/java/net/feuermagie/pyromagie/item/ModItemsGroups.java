package net.feuermagie.pyromagie.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.feuermagie.pyromagie.FeuerMagie;
import net.feuermagie.pyromagie.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {


    public static final ItemGroup  fire_magie_items = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FeuerMagie.MOD_ID, "fire_magie_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FIRE_ESSENCE))
                    .displayName(Text.translatable("itemgroup.feuer-magie.fire_magie_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FIRE_ESSENCE);
                        entries.add(ModItems.FIRE_STEEL_INGOT);
                    })
                    .build());
    public static final ItemGroup  fire_magie_blocks = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FeuerMagie.MOD_ID, "fire_magie_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.FIRE_ESSENCE_BLOCK))
                    .displayName(Text.translatable("itemgroup.feuer-magie.fire_magie_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FIRE_ESSENCE_BLOCK);
                        entries.add(ModBlocks.FIRE_STEEL_BLOCK);
                    })
                    .build());

    public static void registerItemGroups(){
        FeuerMagie.LOGGER.info("Registering Item Groups for" + FeuerMagie.MOD_ID);

    }

}
