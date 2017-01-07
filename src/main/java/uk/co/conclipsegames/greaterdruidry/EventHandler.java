package uk.co.conclipsegames.greaterdruidry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import uk.co.conclipsegames.greaterdruidry.item.ModItems;

/**
 * Created by James on 07/01/2017.
 */
public class EventHandler {
    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent e) {

        for(int i=0; i < e.craftMatrix.getSizeInventory(); i++)
        {
            if(e.craftMatrix.getStackInSlot(i) != null)
            {
                ItemStack j = e.craftMatrix.getStackInSlot(i);
                if(j.getItem() != null && j.getItem() == ModItems.itemRunedTabletNomadic)
                {

                    e.craftMatrix.setInventorySlotContents(i,new ItemStack(ModItems.itemRunedTabletNomadic));
                }
            }
        }
    }
}
