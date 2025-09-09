package net.feuermagie.pyromagie.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.feuermagie.pyromagie.FeuerMagie;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FIRE_STEEL_BLOCK = registerBlock("fire_steel_block",
            AbstractBlock.Settings.create().strength(4F).requiresTool().sounds(BlockSoundGroup.COPPER));
    public static final Block FIRE_ESSENCE_BLOCK = registerBlock("fire_essence_block",
            AbstractBlock.Settings.create().strength(4F).requiresTool().sounds(BlockSoundGroup.GRAVEL));


    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FeuerMagie.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FeuerMagie.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        FeuerMagie.LOGGER.info("Registering ModBlocks for " + FeuerMagie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.FIRE_STEEL_BLOCK);
            entries.add(ModBlocks.FIRE_ESSENCE_BLOCK);
        });
    }

}
