package net.feuermagie.pyromagie.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.feuermagie.pyromagie.FeuerMagie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item FIRE_ESSENCE = registerItem("fire_essence",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(FeuerMagie.MOD_ID+":fire_essence")))));
    public static final Item FIRE_INGOT = registerItem("fire_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(FeuerMagie.MOD_ID+":fire_ingot")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FeuerMagie.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FeuerMagie.LOGGER.info("Registering ModItems" + FeuerMagie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FIRE_ESSENCE);
            entries.add(FIRE_INGOT);
        });
    }

}
