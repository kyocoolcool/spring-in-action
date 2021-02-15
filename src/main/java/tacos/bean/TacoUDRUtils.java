package tacos.bean;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/13 2:16 PM
 */
public class TacoUDRUtils {
    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }

    public static TacoUDT toTacoUDT(Taco taco) {
        return new TacoUDT(taco.getName(), taco.getIngredients());
    }
}
