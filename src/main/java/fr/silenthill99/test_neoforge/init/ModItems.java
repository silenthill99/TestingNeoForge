package fr.silenthill99.test_neoforge.init;

import fr.silenthill99.test_neoforge.Main;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

    public static final DeferredItem<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties()));

}
