package uk.co.conclipsegames.greaterdruidry;

/**
 * Created by James Swire on 02/01/2017.
 */
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.greaterdruidry.Proxy.CommonProxy;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

@Mod(modid =GreaterDruidry.modId, name = GreaterDruidry.name, version = GreaterDruidry.version, acceptedMinecraftVersions = "[1.10.2]")
public class GreaterDruidry {

    public static final String modId = "greaterdruidry";
    public static final String name = "Greater Druidry";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static GreaterDruidry instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SidedProxy(serverSide = "uk.co.conclipsegames.greaterdruidry.Proxy.CommonProxy", clientSide = "uk.co.conclipsegames.greaterdruidry.Proxy.ClientProxy")
    public static CommonProxy proxy;

}