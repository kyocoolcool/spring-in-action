package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tacos.bean.TacoOrder;
import tacos.data.OrderRepository;

import java.util.List;

@SpringBootTest
class SpringInActionApplicationTests {
    @Autowired
    OrderRepository orderRepository;

    @Test
    void contextLoads() {
        List<TacoOrder> tacoOrders = orderRepository.readOrdersDeliveredInSeattle();
        System.out.println(tacoOrders);
    }

}
