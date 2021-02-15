package tacos.data;

import org.springframework.data.cassandra.repository.CassandraRepository;
import tacos.bean.TacoOrder;

import java.util.UUID;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 6:17 PM
 */
public interface OrderRepository extends CassandraRepository<TacoOrder, UUID> {
    TacoOrder save(TacoOrder order);
//    List<TacoOrder> findByDeliveryZip(String deliveryZip);
//    List<TacoOrder> findByDeliveryNameAndDeliveryCityAllIgnoreCase(String deliveryTo, String deliveryCity);
//    List<TacoOrder> findByDeliveryCityOrderByDeliveryCity(String city);
//    @Query("from TacoOrder as o where o.deliveryCity='Seattle'")
//    List<TacoOrder> readOrdersDeliveredInSeattle();
}
