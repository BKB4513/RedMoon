package com.github.ericliucn.redmoon.handlers;

import ic2.api.event.TeBlockFinalCallEvent;
import ic2.core.block.TeBlockRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    public EventHandler(){
        MinecraftForge.EVENT_BUS.register(this);
    }


}
