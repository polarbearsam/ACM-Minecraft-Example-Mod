package org.acm.onu.registers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static org.acm.onu.ExampleMod.MOD_ID;
import static org.acm.onu.registers.CreativeTabRegister.ACM_EXAMPLE_TAB;

public class ItemRegister {
	// Creates a register for us to send all our newly created items to
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

	// Items
	public static RegistrySupplier<BlockItem> TEST_BLOCK = ITEMS.register("test_block", () ->
			new BlockItem(BlockRegister.TEST_BLOCK.get(), new Item.Properties()
					.arch$tab(ACM_EXAMPLE_TAB)
			));
}
