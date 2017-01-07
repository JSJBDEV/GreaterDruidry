package uk.co.conclipsegames.greaterdruidry.item;

import elucent.roots.item.ItemRunedTablet;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

public class EnhancedTablet extends ItemRunedTablet {
    protected String name;

    public EnhancedTablet(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        GreaterDruidry.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public EnhancedTablet setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public EnhancedTablet setContainerItem(Item containerItem) {
        super.setContainerItem(this);
        return this;
    }

}
