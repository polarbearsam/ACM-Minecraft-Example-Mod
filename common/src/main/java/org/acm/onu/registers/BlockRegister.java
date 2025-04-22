package org.acm.onu.registers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static org.acm.onu.ExampleMod.MOD_ID;

/**
 * This class registers all of our blocks with Minecraft.
 */
public class BlockRegister {
	// Creates a register for us to send all our newly created blocks to
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

	// Blocks
	public static final RegistrySupplier<Block> TEST_BLOCK = BLOCKS.register("test_block", () ->
			new Block(BlockBehaviour.Properties.of()
					// We can define our block's behavior here, such as the sound it makes and how strong it is.
			));
}
