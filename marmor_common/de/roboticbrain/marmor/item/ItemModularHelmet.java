package de.roboticbrain.marmor.item;

import java.util.logging.Level;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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
public class ItemModularHelmet extends ItemArmor {

    public ItemModularHelmet(int id) {
        // Id, material, renderIndex, armorType
        super(id, EnumArmorMaterial.IRON, 1, 0);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModularArmorMod.creativeTab);
        this.setUnlocalizedName(Strings.MODULAR_HELMET_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        //itemIcon = iconRegister.registerIcon(Constants.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        itemIcon = Item.arrow.getIcon(new ItemStack(arrow), 0);
    }
    
}
