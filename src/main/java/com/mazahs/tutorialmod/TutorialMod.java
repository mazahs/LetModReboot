package com.mazahs.tutorialmod;

import com.mazahs.tutorialmod.handler.ConfigurationHandler;
import com.mazahs.tutorialmod.proxy.IProxy;
import com.mazahs.tutorialmod.reference.Reference;
import com.mazahs.tutorialmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class TutorialMod {
	
	
	@Mod.Instance(Reference.MOD_ID) 
    public static TutorialMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre Init Complete!");
	}
	    
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LogHelper.info("Init Complete!");    	
	}
	    
	    
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Init Complete!");
	}

}


	
    
    
   
    
   
    

