package com.mazahs.tutorialmod;

import com.mazahs.tutorialmod.proxy.IProxy;
import com.mazahs.tutorialmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TutorialMod {
	
	
	@Mod.Instance(Reference.MOD_ID) 
    public static TutorialMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
	}
	    
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		    	
	}
	    
	    
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	   	
	}

}


	
    
    
   
    
   
    

