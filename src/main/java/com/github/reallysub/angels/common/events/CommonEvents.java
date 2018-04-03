package com.github.reallysub.angels.common.events;

import com.github.reallysub.angels.common.WAObjects;
import com.github.reallysub.angels.common.WorldGenArms;
import com.github.reallysub.angels.common.capability.CapabilityAngelSickness;
import com.github.reallysub.angels.main.Utils;
import com.github.reallysub.angels.main.WeepingAngels;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber
public class CommonEvents {
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e) {
		EntityPlayer player = e.player;
		if (!player.world.isRemote) {
			
		}
	}
	
	@SubscribeEvent
	public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {

	    if (event.getEntity() instanceof EntityPlayer) {

	        EntityPlayer player = (EntityPlayer) event.getEntity();

			Utils.getAllAngels(player, 40, 40);


            if(Utils.getViewedTicks(player) >= 200)
            {
                //TODO Warn the player that the must look away/spam a button to keep eyes open
            }

            if(Utils.getViewedTicks(player) >= 400)
            {
                //TODO Infect the player
            }

		}
	}
	
	@SubscribeEvent
	public static void decorBiomeEvent(DecorateBiomeEvent e) {
		if (e.getWorld().getBiome(e.getPos()).isSnowyBiome()) {
			WorldGenArms arms = new WorldGenArms(WAObjects.angelArm);
			
			if (e.getRand().nextInt(30) <= 10) {
				arms.generate(e.getWorld(), e.getRand(), e.getPos());
			}
		}
	}
	
	// Capa
	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (!(event.getObject() instanceof EntityPlayer) || event.getObject().hasCapability(CapabilityAngelSickness.CAP, null)) return;
		event.addCapability(new ResourceLocation(WeepingAngels.MODID, "angelsickness"), new CapabilityAngelSickness.CapabilityAngelSicknessProvider(new CapabilityAngelSickness((EntityPlayer) event.getObject())));
	}
	
	@SubscribeEvent
	public void onPlayerStartTracking(net.minecraftforge.event.entity.player.PlayerEvent.StartTracking event) {
		if (event.getTarget().hasCapability(CapabilityAngelSickness.CAP, null)) {
			event.getTarget().getCapability(CapabilityAngelSickness.CAP, null).sync();
		}
	}
	
	@SubscribeEvent
	public void onPlayerClone(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
		NBTTagCompound nbt = (NBTTagCompound) CapabilityAngelSickness.CAP.getStorage().writeNBT(CapabilityAngelSickness.CAP, event.getOriginal().getCapability(CapabilityAngelSickness.CAP, null), null);
		CapabilityAngelSickness.CAP.getStorage().readNBT(CapabilityAngelSickness.CAP, event.getEntityPlayer().getCapability(CapabilityAngelSickness.CAP, null), null, nbt);
	}
	
}
