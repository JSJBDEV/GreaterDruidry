package uk.co.conclipsegames.greaterdruidry.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James on 02/01/2017.
 */
public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        GreaterDruidry.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
