package uk.co.conclipsegames.greaterdruidry;

/**
 * Created by James on 02/01/2017.
 */
import elucent.roots.RegistryManager;
import elucent.roots.research.ResearchBase;
import elucent.roots.research.ResearchGroup;
import elucent.roots.research.ResearchManager;
import elucent.roots.research.ResearchPage;
import elucent.roots.ritual.RitualManager;
import elucent.roots.ritual.rituals.RitualCrafting;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.greaterdruidry.Proxy.CommonProxy;
import uk.co.conclipsegames.greaterdruidry.block.ModBlocks;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

@Mod(modid =GreaterDruidry.modId, name = GreaterDruidry.name, version = GreaterDruidry.version, acceptedMinecraftVersions = "[1.10.2]")
public class GreaterDruidry {

    public static final String modId = "greaterdruidry";
    public static final String name = "Greater Druidry";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static GreaterDruidry instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        utils.info(name + " is loading!");
        ModItems.init();
        ModBlocks.init();
        //proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        proxy.Init(event);


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        utils.info(name + " injected a Roots tab!");

        RitualManager.rituals.add(new RitualCrafting("chalkTravCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.chalkTrav,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIngredient(new ItemStack(ModItems.chalkBase,1))
                .addIngredient(new ItemStack(ModItems.trancePowder,1))
                .addIngredient(new ItemStack(Items.GOLDEN_BOOTS,1)));

        RitualManager.rituals.add(new RitualCrafting("chalkRegenCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.chalkRegen,1))
                .addIncense(new ItemStack(RegistryManager.darkOakTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.acaciaTreeBark,1))
                .addIngredient(new ItemStack(ModItems.chalkBase,1))
                .addIngredient(new ItemStack(Items.GHAST_TEAR,1))
                .addIngredient(new ItemStack(Items.GOLDEN_CHESTPLATE,1)));

        RitualManager.rituals.add(new RitualCrafting("chalkLeviCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.chalkLevi,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIngredient(new ItemStack(ModItems.chalkBase,1))
                .addIngredient(new ItemStack(Items.ENDER_PEARL,1))
                .addIngredient(new ItemStack(Items.GOLDEN_LEGGINGS,1)));

        RitualManager.rituals.add(new RitualCrafting("EverflameCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.itemEverflame,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.darkOakTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.acaciaTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.birchTreeBark,1))
                .addIngredient(new ItemStack(Items.ENDER_EYE,1))
                .addIngredient(new ItemStack(Items.FLINT_AND_STEEL,1))
                .addIngredient(new ItemStack(Items.BLAZE_ROD,1))
                .addBlock(RegistryManager.standingStoneT1, -3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, -3)
                .addBlock(RegistryManager.standingStoneT2, 5, 1, 0)
                .addBlock(RegistryManager.standingStoneT2, -5, 1, 0)
                .addBlock(RegistryManager.standingStoneT2, 0, 1, 5)
                .addBlock(RegistryManager.standingStoneT2, 0, 1, -5));



        ResearchManager.globalResearches.add(new ResearchGroup("adv","Greater Druidry")
                .addResearch(new ResearchBase("beverages",new ItemStack(ModItems.itemTankard))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null, null, null, new ItemStack(Blocks.GLASS_PANE),null, new ItemStack(Blocks.GLASS_PANE),null, new ItemStack(Blocks.GLASS_PANE), null, new ItemStack(ModItems.itemTankard))
                        )
                )
                .addResearch(new ResearchBase("trances",new ItemStack(ModItems.trancePowder))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null, new ItemStack(RegistryManager.pestle), null, new ItemStack(RegistryManager.oldRoot), new ItemStack(Items.PAPER),new ItemStack(Items.GUNPOWDER), null,new ItemStack(Items.POISONOUS_POTATO), null, new ItemStack(ModItems.trancePowder))
                        )
                )

                .addResearch(new ResearchBase("chalk",new ItemStack(ModItems.chalkBase))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null, new ItemStack(Items.DIAMOND), null, new ItemStack(Items.DYE,1,15), new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(Items.DYE,1,15), new ItemStack(Items.GLOWSTONE_DUST),new ItemStack(Items.EMERALD), new ItemStack(Items.GLOWSTONE_DUST), new ItemStack(ModItems.chalkBase))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("chalkTravCrafting"))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("chalkLeviCrafting"))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("chalkRegenCrafting"))
                        )
                )
                .addResearch(new ResearchBase("wyrrd",new ItemStack(ModBlocks.wyrrdTravel))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(ModItems.chalkTrav),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick), new ItemStack(ModBlocks.wyrrdTravel))
                        )
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(ModItems.chalkLevi),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick), new ItemStack(ModBlocks.wyrrdLevi))

                        )
                )
                .addResearch(new ResearchBase("everflame",new ItemStack(ModItems.itemEverflame))
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("EverflameCrafting")))
                        )


        );




    }

    @SidedProxy(serverSide = "uk.co.conclipsegames.greaterdruidry.Proxy.CommonProxy", clientSide = "uk.co.conclipsegames.greaterdruidry.Proxy.ClientProxy")
    public static CommonProxy proxy;

}