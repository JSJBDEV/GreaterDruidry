package uk.co.conclipsegames.greaterdruidry;

import elucent.roots.RegistryManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import uk.co.conclipsegames.greaterdruidry.block.ModBlocks;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

/**
 * Created by James on 03/01/2017.
 */
public class ModRecipes {
    public static void init() {


        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemTankard), "G G", "G G", " G ",'G',Blocks.GLASS_PANE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trancePowder), " P ", "OAG", " I ",'P', RegistryManager.pestle,'O',RegistryManager.oldRoot,'A',Items.PAPER,'I',Items.POISONOUS_POTATO,'G',Items.GUNPOWDER);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdTravel,4),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkTrav);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdRegen,4),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkRegen);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wyrrdLevi,4),"RRR","RCR","RRR",'R',RegistryManager.runeStoneBrick,'C',ModItems.chalkLevi);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.chalkBase)," D ","BRB","GEG",'D',Items.DIAMOND,'B',new ItemStack(Items.DYE,1,15),'R',RegistryManager.runeStoneBrick,'E',Items.EMERALD,'G',Items.GLOWSTONE_DUST);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brewOak),RegistryManager.oakTreeBark,Items.WATER_BUCKET,Items.FERMENTED_SPIDER_EYE,ModItems.itemTankard);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brewBirch),RegistryManager.birchTreeBark,Items.WATER_BUCKET,Items.FERMENTED_SPIDER_EYE,ModItems.itemTankard);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brewRoot),RegistryManager.oldRoot,Items.WATER_BUCKET,Items.FERMENTED_SPIDER_EYE,ModItems.itemTankard);

        GameRegistry.addShapedRecipe(new ItemStack(RegistryManager.pestle)," SS","SCS","SS ",'S',Blocks.STONE,'C',Blocks.COBBLESTONE);

        //Lifewater Recipes//
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS,1),Blocks.DIRT,ModItems.itemLifewater);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS,1),Blocks.CACTUS,Blocks.CACTUS,ModItems.itemLifewater);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.BEETROOT_SEEDS,1),Items.WHEAT_SEEDS,ModItems.itemLifewater);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EGG,1),Items.EMERALD,ModItems.itemLifewater);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.POTATO,1),Items.GOLD_INGOT,ModItems.itemLifewater);

        //Stonewain ore recipes//
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemStonewain,8),RegistryManager.oldRoot,Items.POTIONITEM,Items.FERMENTED_SPIDER_EYE,Items.SLIME_BALL);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT,2),Blocks.IRON_ORE,ModItems.itemStonewain);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT,2),Blocks.GOLD_ORE,ModItems.itemStonewain);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE,5,4),Blocks.LAPIS_ORE,ModItems.itemStonewain);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND,2),Blocks.DIAMOND_ORE,ModItems.itemStonewain);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE,5),Blocks.REDSTONE_ORE,ModItems.itemStonewain);

        //Catalyst Recipes//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemPistonCatalyst)," C ","GBL"," R ",'C',Items.CLOCK,'G',Items.GOLD_INGOT,'L',new ItemStack(Items.DYE,1,4),'R',Items.REDSTONE,'B',ModItems.itemCatalyst);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCircuitCatalyst)," C ","GBL"," R ",'G',Blocks.GLOWSTONE,'C',Items.REPEATER,'L',new ItemStack(Items.DYE,1,4),'R',Items.COMPARATOR,'B',ModItems.itemCatalyst);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.PISTON),"LLL"," C "," L ",'L',new ItemStack(Items.DYE,1,4),'C',ModItems.itemPistonCatalyst);
        GameRegistry.addShapedRecipe(new ItemStack(Items.CLOCK)," L ","LCL"," L ",'L',new ItemStack(Items.DYE,1,4),'C',ModItems.itemPistonCatalyst);
        GameRegistry.addShapedRecipe(new ItemStack(Items.COMPARATOR)," L ","LCL","L L",'L',new ItemStack(Items.DYE,1,4),'C',ModItems.itemCircuitCatalyst);
        GameRegistry.addShapedRecipe(new ItemStack(Items.REPEATER)," L "," C ","L L",'L',new ItemStack(Items.DYE,1,4),'C',ModItems.itemCircuitCatalyst);




        //Nomadic tablet recipes//
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),Blocks.LOG,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),new ItemStack(Blocks.LOG,1,1),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),new ItemStack(Blocks.LOG,1,2),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),new ItemStack(Blocks.LOG,1,3),ModItems.itemRunedTabletNomadic);

        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),Blocks.LOG2,ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER),new ItemStack(Blocks.LOG2,1,1),ModItems.itemRunedTabletNomadic);

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

        GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING,4),new ItemStack(Blocks.WOOL,1,0),ModItems.itemRunedTabletNomadic);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING,2),new ItemStack(Blocks.VINE,1),ModItems.itemRunedTabletNomadic);
        



    }


}

