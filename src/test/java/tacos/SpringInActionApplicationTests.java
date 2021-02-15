package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tacos.data.OrderRepository;

@SpringBootTest
class SpringInActionApplicationTests {
    @Autowired
    OrderRepository orderRepository;

//    @Test
//    void contextLoads() {
//        List<TacoOrder> tacoOrders = orderRepository.readOrdersDeliveredInSeattle();
//        System.out.println(tacoOrders);
//    }

}
