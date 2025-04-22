package org.acm.onu;

import org.acm.onu.registers.BlockRegister;
import org.acm.onu.registers.CreativeTabRegister;
import org.acm.onu.registers.ItemRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ExampleMod {
    public static final String MOD_ID = "acmexamplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        // We will make most of our code here and in new Java files in this folder.
        // Write common init code here.
        BlockRegister.BLOCKS.register();
        ItemRegister.ITEMS.register();
        CreativeTabRegister.TABS.register();
    }
}
