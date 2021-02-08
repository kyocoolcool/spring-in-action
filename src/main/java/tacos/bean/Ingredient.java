package tacos.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 10:20 AM
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
public class Ingredient {
    @Id
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
