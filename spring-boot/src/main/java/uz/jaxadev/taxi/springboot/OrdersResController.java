package uz.jaxadev.taxi.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OrdersResController {

    ArrayList<Order> orders = new ArrayList<>();


    @GetMapping("/getOrders")
    public ArrayList<Order> getOrders() {

        return orders;

    }

    @PostMapping("/postOrder")
    public Order postOrders(

            @RequestParam(required = true)
                    String startPoint,

            @RequestParam(required = true)
                    String endPoint,

            @RequestParam(required = true)
                    String price

    ) {

        Order order = new Order(startPoint, endPoint, price);

        orders.add(order);

        return order;

    }


}
