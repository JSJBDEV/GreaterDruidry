package uk.co.conclipsegames.greaterdruidry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.init.Blocks;
        import net.minecraft.potion.Potion;
        import net.minecraft.potion.PotionEffect;
        import net.minecraft.server.MinecraftServer;
        import net.minecraft.util.math.BlockPos;
        import net.minecraft.world.World;
        import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
        import net.minecraftforge.fml.common.gameevent.TickEvent;
        import uk.co.conclipsegames.greaterdruidry.block.ModBlocks;


//public class WyrrdStones {


 /*   @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

        MinecraftServer server = Minecraft.getMinecraft().getIntegratedServer();
        server.getCommandManager().executeCommand(server, "execute @a ~ ~ ~ detect ~ ~-1 ~ greaterdruidry:wyrrdTravel 0 effect @p minecraft:speed 10 10");
        //EntityPlayer living = Minecraft.getMinecraft().thePlayer;
        //BlockPos b1 = new BlockPos(living.posX,living.posY,living.posZ);
        //BlockPos b2 = new BlockPos(living.posX,(living.posY-1),living.posZ);
        //if(living.worldObj.getBlockState(b2).getBlock() == ModBlocks.wyrrdTravel)
        //{
        //    living.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 10, 10));
        //}
    }
}

*/