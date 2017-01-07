package uk.co.conclipsegames.greaterdruidry.block;

import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James on 04/01/2017.
 */
public class WyrrdRegen extends BlockSoulSand {

    protected String name;

    public WyrrdRegen(String name) {


        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

    }

    public void registerItemModel(ItemBlock itemBlock) {
        GreaterDruidry.proxy.registerItemRenderer(itemBlock, 0, name);

    }

    @Override
    public WyrrdRegen setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        super.onEntityCollidedWithBlock(worldIn,pos,state,entityIn);
        if(entityIn instanceof EntityLivingBase) ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(Potion.getPotionById(10), 100, 0));
    }
}
