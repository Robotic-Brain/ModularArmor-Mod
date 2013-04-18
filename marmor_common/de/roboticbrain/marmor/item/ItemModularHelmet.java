package de.roboticbrain.marmor.item;

import java.util.logging.Level;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.roboticbrain.marmor.Constants;
import de.roboticbrain.marmor.ModularArmorMod;
import de.roboticbrain.marmor.core.helper.LogHelper;
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
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Constants.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
