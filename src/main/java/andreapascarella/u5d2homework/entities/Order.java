package andreapascarella.u5d2homework.entities;

import andreapascarella.u5d2homework.enums.OrderState;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Order {

    private int counter = 1;

    private int orderNumber;

    private List<Item> items;

    private OrderState orderState;

    private Table table;

    private double importoOrdine;

    @Value("${order.costoCoperto}")
    private int coperto;

    private String oraOrdine;


    public Order(List<Item> items, OrderState orderState, Table table) {
        this.items = items;
        this.orderState = orderState;
        this.table = table;
        this.orderNumber = counter;
        counter++;
        this.importoOrdine = items.stream().mapToDouble(Item::getPrice).sum() + coperto;
        this.oraOrdine = LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute();
    }

    public void addToOrder(Item item) {
        this.items.add(item);
    }


    public void printOrder() {
        System.out.println("Order{" +
                "orderNumber=" + orderNumber +
                ", items=" + items +
                ", orderState=" + orderState +
                ", table=" + table +
                ", importo totale=" + importoOrdine +
                ", ora ordine=" + oraOrdine +
                '}');
    }
}
