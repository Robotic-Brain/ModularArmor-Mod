package de.roboticbrain.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Modular Armor Mod
 * 
 * MarmorCreativeTab
 * 
 * @author Robotic-Brain
 * @license GNU Public License v3 (http://www.gnu.org/licenses/)
 */
public class MarmorCreativeTab extends CreativeTabs {

    public MarmorCreativeTab(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Item Id for displayed Item
     */
    public int getTabIconItemIndex() {
        return Item.diamond.itemID;
    }
    
}
