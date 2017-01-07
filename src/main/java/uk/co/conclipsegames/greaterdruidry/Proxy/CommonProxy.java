package uk.co.conclipsegames.greaterdruidry.Proxy;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.greaterdruidry.EventHandler;
//import uk.co.conclipsegames.greaterdruidry.WyrrdStones;

/**
 * Created by James Swire on 02/01/2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        registerEvents();
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
    public void registerEvents()
    {
        MinecraftForge.EVENT_BUS.register(new EventHandler());


    }
}
