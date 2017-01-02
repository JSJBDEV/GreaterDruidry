package uk.co.conclipsegames.greaterdruidry.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James Swire on 02/01/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(GreaterDruidry.modId + ":" + id, "inventory"));
    }
}
