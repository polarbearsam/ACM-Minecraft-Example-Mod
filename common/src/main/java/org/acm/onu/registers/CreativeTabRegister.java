package org.acm.onu.registers;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.acm.onu.ExampleMod;

/**
 *
 */
public class CreativeTabRegister {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(
			ExampleMod.MOD_ID, Registries.CREATIVE_MODE_TAB
	);

	public static final RegistrySupplier<CreativeModeTab> ACM_EXAMPLE_TAB = TABS.register(
			"acm_example_tab",
			() -> CreativeTabRegistry.create(
					Component.translatable("itemGroup.acmexamplemod.general"),
					() -> new ItemStack(ItemRegister.TEST_BLOCK.get())
			)
	);
}
