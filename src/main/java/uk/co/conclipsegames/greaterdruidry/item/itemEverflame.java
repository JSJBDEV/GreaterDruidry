package uk.co.conclipsegames.greaterdruidry.item;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.*;
import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James on 02/01/2017.
 */
public class itemEverflame extends ItemFlintAndSteel {
    protected String name;

    public itemEverflame(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public itemEverflame setMaxDamage(int maxDamageIn) {
        super.setMaxDamage(maxDamageIn);
        return this;
    }

    public void registerItemModel() {
        GreaterDruidry.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public itemEverflame setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),500,10));
        //ResourceLocation location =
        //SoundEvent event = new SoundEvent(location);
        //world.playSound(player,(new BlockPos(player.posX,player.posY,player.posZ)),event,SoundCategory.BLOCKS,10F,10F);



        return new ActionResult(EnumActionResult.FAIL,stack);
    }
}
