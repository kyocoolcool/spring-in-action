package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.bean.Ingredient;

import java.util.List;
import java.util.Optional;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 4:28 PM
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    List<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}



