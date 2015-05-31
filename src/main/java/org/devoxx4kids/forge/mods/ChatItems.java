package org.devoxx4kids.forge.mods;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {

	@SubscribeEvent
	public void giveItems(ServerChatEvent event){
		if (event.message.contains("diamond")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(Items.diamond, 64));
		}
		else if (event.message.contains("mobs")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(Blocks.mob_spawner, 64));
		}
		else if (event.message.contains("torch")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(Blocks.torch, 64));
		}
		else if (event.message.contains("nether")) {
			event.player.dimension= -1;
		}
	}
}
