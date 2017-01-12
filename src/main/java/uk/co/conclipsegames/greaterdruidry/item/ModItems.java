package uk.co.conclipsegames.greaterdruidry.item;

/**
 * Created by James on 02/01/2017.
 */
import elucent.roots.Roots;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemBase itemTankard;
    public static TranceSmoke trancePowder;
    public static ItemBase chalkTrav;
    public static ItemBase chalkLevi;
    public static ItemBase chalkRegen;
    public static ItemBase chalkBase;
    public static itemEverflame itemEverflame;
    public static EnhancedTablet itemRunedTabletNomadic;
    public static brewBirch brewBirch;
    public static brewOak brewOak;
    public static brewRoot brewRoot;
    public static TranceHomeComing tranceHomeComing;
    public static ItemBase itemStonewain;
    public static ItemBase ingotEntropy;
    public static itemCatalyst itemCatalyst;
    public static itemCatalyst itemCircuitCatalyst;
    public static itemCatalyst itemPistonCatalyst;
    public static ItemBase itemLifewater;

    public static void init() {
        itemTankard = register(new ItemBase("itemTankard").setCreativeTab(Roots.tab));
        trancePowder = register(new TranceSmoke());
        chalkTrav = register(new ItemBase("chalkTrav").setCreativeTab(Roots.tab));
        chalkLevi = register(new ItemBase("chalkLevi").setCreativeTab(Roots.tab));
        chalkRegen = register(new ItemBase("chalkRegen").setCreativeTab(Roots.tab));
        chalkBase = register(new ItemBase("chalkBase").setCreativeTab(Roots.tab));
        itemEverflame = register(new itemEverflame("itemEverflame").setCreativeTab(Roots.tab).setMaxDamage(1000));
        itemRunedTabletNomadic = register(new EnhancedTablet("itemRunedTabletNomadic").setCreativeTab(Roots.tab));
        brewBirch = register(new brewBirch("brewBirch").setCreativeTab(Roots.tab));
        brewOak = register(new brewOak("brewOak").setCreativeTab(Roots.tab));
        brewRoot = register(new brewRoot("brewRoot").setCreativeTab(Roots.tab));
        tranceHomeComing = register(new TranceHomeComing());
        itemStonewain = register(new ItemBase("itemStonewain").setCreativeTab(Roots.tab));
        ingotEntropy = register(new ItemBase("ingotEntropy"));
        itemCatalyst = register(new itemCatalyst("itemCatalyst").setCreativeTab(Roots.tab));
        itemCircuitCatalyst = register(new itemCatalyst("itemCircuitCatalyst").setCreativeTab(Roots.tab));
        itemPistonCatalyst = register(new itemCatalyst("itemPistonCatalyst").setCreativeTab(Roots.tab));
        itemLifewater = register(new ItemBase("itemLifewater").setCreativeTab(Roots.tab));

    }


    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }
        if (item instanceof itemEverflame) {
            ((itemEverflame)item).registerItemModel();
        }
        if (item instanceof EnhancedTablet) {
            ((EnhancedTablet)item).registerItemModel();
        }
        if (item instanceof brewBirch) {
            ((brewBirch)item).registerItemModel();
        }
        if (item instanceof brewOak) {
            ((brewOak)item).registerItemModel();
        }
        if (item instanceof brewRoot) {
            ((brewRoot)item).registerItemModel();
        }
        if (item instanceof itemCatalyst) {
            ((itemCatalyst)item).registerItemModel();
        }



        return item;
    }

}