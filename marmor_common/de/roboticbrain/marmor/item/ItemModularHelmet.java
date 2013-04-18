package de.roboticbrain.marmor.item;

import net.minecraft.item.Item;
import de.roboticbrain.marmor.ModularArmorMod;
import de.roboticbrain.marmor.lib.Strings;

/**
 * Modular Armor Mod
 * 
 * Modular Helmet Class
 * 
 * @author Robotic-Brain
 * @license GNU Public License v3 (http://www.gnu.org/licenses/)
 */
public class ItemModularHelmet extends Item {

    public ItemModularHelmet(int id) {
        super(id);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModularArmorMod.creativeTab);
        this.setUnlocalizedName(Strings.MODULAR_HELMET_NAME);
    }
    
}
