package uk.co.conclipsegames.greaterdruidry;

import elucent.roots.RegistryManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.conclipsegames.greaterdruidry.block.ModBlocks;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

/**
 * Created by James on 03/01/2017.
 */
public class ModRecipes {
    public static void init() {


        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemTankard), "   ", "G G", " G ",'G',Blocks.GLASS_PANE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trancePowder), " P ", "OAG", " I ",'P', RegistryManager.pestle,'O',RegistryManager.oldRoot,'A',Items.PAPER,'I',Items.POISONOUS_POTATO,'G',Items.GUNPOWDER);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdTravel),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkTrav);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdRegen),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkRegen);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdLevi),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkLevi);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.chalkBase)," D ","BRB","GEG",'D',Items.DIAMOND,'B',new ItemStack(Items.DYE,1,15),'R',RegistryManager.runeStoneBrick,'E',Items.EMERALD,'G',Items.GLOWSTONE_DUST);

        //Nomadic tablet recipes//
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),Blocks.LOG,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),Blocks.LOG2,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.SLIME_BALL),new ItemStack(Items.DYE,1,10),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,1),new ItemStack(Blocks.STONE,1,0),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,2),new ItemStack(Blocks.STONE,1,1),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,3),new ItemStack(Blocks.STONE,1,2),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,4),new ItemStack(Blocks.STONE,1,3),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,5),new ItemStack(Blocks.STONE,1,4),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,6),new ItemStack(Blocks.STONE,1,5),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,0),new ItemStack(Blocks.STONE,1,6),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,1),new ItemStack(Blocks.SAPLING,1,0),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,2),new ItemStack(Blocks.SAPLING,1,1),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,3),new ItemStack(Blocks.SAPLING,1,2),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,4),new ItemStack(Blocks.SAPLING,1,3),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,5),new ItemStack(Blocks.SAPLING,1,4),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAPLING,1,0),new ItemStack(Blocks.SAPLING,1,5),Items.GOLD_INGOT,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BROWN_MUSHROOM,1,0),new ItemStack(Blocks.SAPLING,1,0),new ItemStack(Items.DYE,1,3),ModItems.itemRunedTabletNomadic);
        



    }


}

