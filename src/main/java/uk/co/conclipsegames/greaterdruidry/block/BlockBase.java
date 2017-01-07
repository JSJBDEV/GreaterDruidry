package uk.co.conclipsegames.greaterdruidry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James on 03/01/2017.
 */
public class BlockBase extends Block {
    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        GreaterDruidry.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
    @Override
    public BlockBase setLightLevel(float value)
    {
        super.setLightLevel(value);
        return this;
    }
    @Override
    public BlockBase setLightOpacity(int opacity)
    {
        super.setLightOpacity(opacity);
        return this;
    }

}
