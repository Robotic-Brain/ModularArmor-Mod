package de.roboticbrain.marmor;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import de.roboticbrain.marmor.core.helper.LogHelper;
import de.roboticbrain.marmor.core.proxy.CommonProxy;
import de.roboticbrain.marmor.creativetab.MarmorCreativeTab;
import de.roboticbrain.marmor.item.ModItems;

/**
 * Modular Armor Mod
 * 
 * Modular Armor Mod Entry Point
 * 
 * @author Robotic-Brain
 * @license GNU Public License v3 (http://www.gnu.org/licenses/)
 *
 */
@Mod(modid = Constants.MOD_ID, version = Constants.VERSION_STRING)
@NetworkMod(
            channels = { Constants.CHANNEL_NAME },
            clientSideRequired = true,
            serverSideRequired = false
        )
public class ModularArmorMod {
    @Instance(Constants.MOD_ID)
    public static ModularArmorMod instance;
    
    @SidedProxy(
                clientSide = Constants.CLIENT_PROXY_CLASS,
                serverSide = Constants.SERVER_PROXY_CLASS
               )
    public static CommonProxy proxy;
    
    public static CreativeTabs creativeTab = new MarmorCreativeTab(CreativeTabs.getNextID(), Constants.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        LogHelper.init();
        
        ModItems.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        proxy.initRendering();
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.logger().info("Initialization finished");
    }
    
}
