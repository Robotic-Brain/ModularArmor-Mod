package de.roboticbrain.marmor.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Modular Armor Mod
 * 
 * Item Configuration Class
 * 
 * @author Robotic-Brain
 * @license GNU Public License v3 (http://www.gnu.org/licenses/)
 */
public class ModItems {
    
    public static Item modularHelmet;
    
    public static void init() {
        modularHelmet = new ItemModularHelmet(ItemIds.MODULAR_HELMET);
        
        GameRegistry.addRecipe(new ItemStack(modularHelmet), new Object[] { "d", Character.valueOf('d'), Block.dirt } );
    }
}
