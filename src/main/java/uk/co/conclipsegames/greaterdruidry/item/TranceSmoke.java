package uk.co.conclipsegames.greaterdruidry.item;

import elucent.roots.Roots;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
        import net.minecraft.item.ItemStack;
        import net.minecraft.potion.Potion;
        import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
        import net.minecraftforge.client.model.ModelLoader;
        import net.minecraftforge.fml.relauncher.Side;
        import net.minecraftforge.fml.relauncher.SideOnly;
        import uk.co.conclipsegames.greaterdruidry.GreaterDruidry;

/**
 * Created by James on 04/01/2017.
 */
public class TranceSmoke extends ItemFood{
    public TranceSmoke(){
        super(0, 1.0F, false);
        setCreativeTab(Roots.tab);
        setUnlocalizedName("trancePowder");
        setRegistryName("trancePowder");
        setAlwaysEdible();
        GreaterDruidry.proxy.registerItemRenderer(this, 0, "trancePowder");
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving){
        super.onItemUseFinish(stack, worldIn, entityLiving);
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(8),1000,5));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(5),1000,5));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(11),1000,5));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(15),1000,5));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(1),1000,5));
        return stack;
    }


}

