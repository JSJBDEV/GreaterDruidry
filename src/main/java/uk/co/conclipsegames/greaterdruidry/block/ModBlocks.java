package uk.co.conclipsegames.greaterdruidry.block;

import elucent.roots.Roots;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**Swire
 * Created by James on 03/01/2017.
 */
public class ModBlocks {
    public static WyrrdTravel wyrrdTravel;
    public static WyrrdLevi wyrrdLevi;
    public static WyrrdRegen wyrrdRegen;
    public static void init() {
        wyrrdTravel = register(new WyrrdTravel("wyrrdTravel").setCreativeTab(Roots.tab));
        wyrrdLevi = register(new WyrrdLevi("wyrrdLevi").setCreativeTab(Roots.tab));
        wyrrdRegen = register(new WyrrdRegen("wyrrdRegen").setCreativeTab(Roots.tab));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }
        if (block instanceof WyrrdTravel) {
            ((WyrrdTravel)block).registerItemModel(itemBlock);
        }
        if (block instanceof WyrrdLevi) {
            ((WyrrdLevi)block).registerItemModel(itemBlock);
        }
        if (block instanceof WyrrdRegen) {
            ((WyrrdRegen)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
