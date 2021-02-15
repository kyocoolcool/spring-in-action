package tacos.data;

import org.springframework.data.cassandra.repository.CassandraRepository;
import tacos.bean.Ingredient;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 4:28 PM
 */
public interface IngredientRepository extends CassandraRepository<Ingredient, String> {

}



