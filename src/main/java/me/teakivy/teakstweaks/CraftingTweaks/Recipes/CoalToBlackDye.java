package me.teakivy.teakstweaks.CraftingTweaks.Recipes;

import me.teakivy.teakstweaks.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CoalToBlackDye {

    static Main main = Main.getPlugin(Main.class);

    public static void registerRecipes() {
        NamespacedKey key = new NamespacedKey(main, "black_dye_vt_coal");
        ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.BLACK_DYE));
        recipe.addIngredient(Material.COAL);

        Bukkit.addRecipe(recipe);
    }
}