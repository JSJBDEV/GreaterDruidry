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

@Mod(modid =GreaterDruidry.modId, name = GreaterDruidry.name, version = GreaterDruidry.version, acceptedMinecraftVersions = "[1.10.2]",dependencies="after:roots")
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

        RitualManager.rituals.add(new RitualCrafting("NomadTablet", 205, 86, 0)
                .setResult(new ItemStack(ModItems.itemRunedTabletNomadic,1))
                .addIncense(new ItemStack(RegistryManager.oakTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.oakTreeBark,1))
                .addIngredient(new ItemStack(RegistryManager.runedTablet,1))
                .addIngredient(new ItemStack(Items.MAP,1))
                .addIngredient(new ItemStack(Items.DYE,1,4)));

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

        RitualManager.rituals.add(new RitualCrafting("hctranceCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.tranceHomeComing,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.acaciaTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.acaciaTreeBark,1))
                .addIngredient(new ItemStack(ModItems.trancePowder,1))
                .addIngredient(new ItemStack(Items.ENDER_EYE,1))
                .addIngredient(new ItemStack(Items.EMERALD,1))
                .addBlock(RegistryManager.standingStoneT1, -3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, -3)
                );

        RitualManager.rituals.add(new RitualCrafting("basicCatalystCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.itemCatalyst,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.darkOakTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.darkOakTreeBark,1))
                .addIngredient(new ItemStack(RegistryManager.runeStoneSymbol,1))
                .addIngredient(new ItemStack(RegistryManager.livingPickaxe,1))
                .addIngredient(new ItemStack(RegistryManager.livingAxe,1))
                .addBlock(RegistryManager.standingStoneT1, -3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, -3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, -3, 0, 0)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, 3)
                .addBlock(RegistryManager.standingStoneT1, 0, 0, -3)

        );

        RitualManager.rituals.add(new RitualCrafting("LifewaterCrafting", 205, 86, 0)
                .setResult(new ItemStack(ModItems.itemLifewater,4))
                .addIncense(new ItemStack(RegistryManager.oakTreeBark,1))
                .addIncense(new ItemStack(RegistryManager.jungleTreeBark,1))
                .addIngredient(new ItemStack(Items.POTIONITEM,1))
                .addIngredient(new ItemStack(RegistryManager.verdantSprig,1))
                .addIngredient(new ItemStack(Items.EGG,1)));




        ResearchManager.globalResearches.add(new ResearchGroup("adv","Greater Druidry")
                .addResearch(new ResearchBase("beverages",new ItemStack(ModItems.itemTankard))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(Blocks.GLASS_PANE), null,new ItemStack(Blocks.GLASS_PANE), new ItemStack(Blocks.GLASS_PANE),null, new ItemStack(Blocks.GLASS_PANE),null, new ItemStack(Blocks.GLASS_PANE), null, new ItemStack(ModItems.itemTankard))
                        )
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.oakTreeBark),new ItemStack(ModItems.itemTankard),new ItemStack(Items.FERMENTED_SPIDER_EYE),new ItemStack(Items.WATER_BUCKET),null,null,null,null,null, new ItemStack(ModItems.brewOak))
                        )
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.birchTreeBark),new ItemStack(ModItems.itemTankard),new ItemStack(Items.FERMENTED_SPIDER_EYE),new ItemStack(Items.WATER_BUCKET),null,null,null,null,null, new ItemStack(ModItems.brewOak))
                        )
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.oldRoot),new ItemStack(ModItems.itemTankard),new ItemStack(Items.FERMENTED_SPIDER_EYE),new ItemStack(Items.WATER_BUCKET),null,null,null,null,null, new ItemStack(ModItems.brewRoot))
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
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(ModItems.chalkRegen),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick),new ItemStack(RegistryManager.runeStoneBrick), new ItemStack(ModBlocks.wyrrdRegen))

                        )
                )
                .addResearch(new ResearchBase("everflame",new ItemStack(ModItems.itemEverflame))
                        .addPage(new ResearchPage()
                                        .addDisplayItem(new ItemStack(ModItems.itemEverflame))
                                )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("EverflameCrafting")))
                        )

                .addResearch(new ResearchBase("nomad",new ItemStack(ModItems.itemRunedTabletNomadic))
                        .addPage(new ResearchPage()
                                .addDisplayItem(new ItemStack(ModItems.itemRunedTabletNomadic))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("NomadTablet")))
                )
                .addResearch(new ResearchBase("advTrances",new ItemStack(ModItems.tranceHomeComing))
                        .addPage(new ResearchPage()
                                .addDisplayItem(new ItemStack(ModItems.tranceHomeComing))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("hctranceCrafting")))
                )
                .addResearch(new ResearchBase("stonewain",new ItemStack(ModItems.itemStonewain))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(new ItemStack(Items.POTIONITEM),new ItemStack(RegistryManager.oldRoot),new ItemStack(Items.FERMENTED_SPIDER_EYE),new ItemStack(Items.SLIME_BALL),null,null,null,null,null, new ItemStack(ModItems.itemStonewain,8))
                        )
                )
                .addResearch(new ResearchBase("catalyst",new ItemStack(ModItems.itemCircuitCatalyst))
                        .addPage(new ResearchPage()
                                .addDisplayItem(new ItemStack(ModItems.itemCatalyst))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("basicCatalystCrafting")))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null,new ItemStack(Items.CLOCK),null,new ItemStack(Items.GOLD_INGOT),new ItemStack(ModItems.itemCatalyst),new ItemStack(Items.DYE,1,4),null,new ItemStack(Items.REDSTONE),null,new ItemStack(ModItems.itemPistonCatalyst))
                        )
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null,new ItemStack(Items.REPEATER),null,new ItemStack(Blocks.GLOWSTONE),new ItemStack(ModItems.itemCatalyst),new ItemStack(Items.DYE,1,4),null,new ItemStack(Items.COMPARATOR),null,new ItemStack(ModItems.itemPistonCatalyst))
                        )
                )
                .addResearch(new ResearchBase("lifewater",new ItemStack(ModItems.itemLifewater))
                        .addPage(new ResearchPage()
                                .addDisplayItem(new ItemStack(ModItems.itemLifewater))
                        )
                        .addPage(new ResearchPage()
                                .addAltarRecipe(RitualManager.getRitualFromName("LifewaterCrafting"))

                ))


        );




    }

    @SidedProxy(serverSide = "uk.co.conclipsegames.greaterdruidry.Proxy.CommonProxy", clientSide = "uk.co.conclipsegames.greaterdruidry.Proxy.ClientProxy")
    public static CommonProxy proxy;

}