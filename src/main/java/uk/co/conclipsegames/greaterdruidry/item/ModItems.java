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

    public static void init() {
        itemTankard = register(new ItemBase("itemTankard").setCreativeTab(Roots.tab));
        trancePowder = register(new TranceSmoke());
        chalkTrav = register(new ItemBase("chalkTrav").setCreativeTab(Roots.tab));
        chalkLevi = register(new ItemBase("chalkLevi").setCreativeTab(Roots.tab));
        chalkRegen = register(new ItemBase("chalkRegen").setCreativeTab(Roots.tab));
        chalkBase = register(new ItemBase("chalkBase").setCreativeTab(Roots.tab));
        itemEverflame = register(new itemEverflame("itemEverflame").setCreativeTab(Roots.tab).setMaxDamage(1000));
        itemRunedTabletNomadic = register(new EnhancedTablet("itemRunedTabletNomadic").setCreativeTab(Roots.tab));
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



        return item;
    }

}