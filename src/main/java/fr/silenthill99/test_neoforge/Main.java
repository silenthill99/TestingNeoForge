package fr.silenthill99.test_neoforge;

import fr.silenthill99.test_neoforge.init.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "test_neoforge";
    
    public Main(IEventBus bus) {
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::addToCreativeTab);
        ModItems.ITEMS.register(bus);
    }
    
    private void setup(FMLCommonSetupEvent event) {
        
    }
    
    private void clientSetup(FMLClientSetupEvent event) {
        
    }

    private void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.URANIUM);
        }
    }
    @SubscribeEvent
    public void onServerStart(ServerStartingEvent event) {

    }

}
