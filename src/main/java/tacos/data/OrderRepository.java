package tacos.data;

import tacos.bean.TacoOrder;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 6:17 PM
 */
public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
