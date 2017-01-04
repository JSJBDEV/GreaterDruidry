package uk.co.conclipsegames.greaterdruidry;

import elucent.roots.RegistryManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

/**
 * Created by James on 03/01/2017.
 */
public class ModRecipes {
    public static void init() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemTankard), "   ", "G G", " G ",'G',Blocks.GLASS_PANE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trancePowder), " P ", "OAG", " I ",'P', RegistryManager.pestle,'O',RegistryManager.oldRoot,'A',Items.PAPER,'I',Items.POISONOUS_POTATO,'G',Items.GUNPOWDER);

    }


}

