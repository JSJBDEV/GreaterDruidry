package uk.co.conclipsegames.greaterdruidry;
import elucent.roots.research.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;


/**
 * Created by James Swire on 02/01/2017.
 */
public class ExtendedRuneTablet extends ResearchManager {
    public static void init()
    {
        globalResearches.add(new ResearchGroup("Advancements","Greater Druidry")
                .addResearch(new ResearchBase("barkharvesting",new ItemStack(ModItems.ingotCopper))
                        .addPage(new ResearchPage()
                                .addCraftingRecipe(null, new ItemStack(Blocks.SAPLING), new ItemStack(Blocks.SAPLING), new ItemStack(Blocks.SAPLING), new ItemStack(Blocks.PLANKS), new ItemStack(Blocks.SAPLING), new ItemStack(Items.STICK), new ItemStack(Blocks.SAPLING), null, new ItemStack(ModItems.ingotCopper))
                        )
                )
        );
    }
}
