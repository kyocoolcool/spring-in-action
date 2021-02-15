package tacos.bean;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/13 2:01 PM
 */
@Data
@UserDefinedType("taco")
public class TacoUDT {

    private final String name;
    private final List<IngredientUDT> ingredients;

}
