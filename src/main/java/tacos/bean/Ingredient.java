package tacos.bean;

import lombok.Data;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 10:20 AM
 */

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
