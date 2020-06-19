package com.github.ericliucn.redmoon;

import com.github.ericliucn.redmoon.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = RedMoon.MOD_ID,
        name = RedMoon.MOD_NAME,
        version = RedMoon.VERSION
)
public class RedMoon {

    public static final String MOD_ID = "redmoon";
    public static final String MOD_NAME = "RedMoon";
    public static final String VERSION = "1.0";

    // 模组的实例
    @Mod.Instance(MOD_ID)
    public static RedMoon INSTANCE;

    // 模组的Proxy，用于在客户端或者服务端单方面调用代码
    @SidedProxy(clientSide = "com.github.ericliucn.redmoon.proxy.ClientProxy", serverSide = "com.github.ericliucn.redmoon.proxy.ServerProxy", modId = MOD_ID)
    public CommonProxy PROXY;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        PROXY.preinit(event);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.init(event);
    }


    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        PROXY.postinit(event);
    }

    @Mod.EventHandler
    public void serverstarting(FMLServerStartingEvent event){
        PROXY.serverstarting(event);
    }

}
