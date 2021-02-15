package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import tacos.bean.Taco;
import tacos.bean.TacoOrder;
import tacos.bean.TacoUDRUtils;
import tacos.data.OrderRepository;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/2/5 10:52 AM
 */
@Controller
@RequestMapping("/orders")
@SessionAttributes(names = {"tacoOrder","taco"})
public class OrderController {
    private OrderRepository orderRepo;

    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }


    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("tacoOrder", new TacoOrder());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(Taco taco, TacoOrder order, Errors errors, SessionStatus sessionStatus) {
        System.out.println(taco);
        if (errors.hasErrors()) {
            return "orderForm";
        }
        order.addTaco(TacoUDRUtils.toTacoUDT(taco));
        orderRepo.save(order);
        sessionStatus.setComplete();

        return "redirect:/";
    }

}
