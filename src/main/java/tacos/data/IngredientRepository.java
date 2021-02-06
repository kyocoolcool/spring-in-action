package tacos.data;

import tacos.bean.Ingredient;

import java.util.List;
import java.util.Optional;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 4:28 PM
 */
public interface IngredientRepository {

    List<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
