package andreapascarella.u5d2homework.runners;

import andreapascarella.u5d2homework.U5d2homeworkApplication;
import andreapascarella.u5d2homework.entities.Item;
import andreapascarella.u5d2homework.entities.Menu;
import andreapascarella.u5d2homework.entities.Order;
import andreapascarella.u5d2homework.entities.Table;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d2homeworkApplication.class);

        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();

        Table table1 = (Table) ctx.getBean("table");

        Order o = new Order(List.of((Item) ctx.getBean("pizza_margherita"), (Item) ctx.getBean("hawaiian_pizza"), (Item) ctx.getBean("lemonade"), (Item) ctx.getBean("water")), table1);

        System.out.println(o.getTable().getCostoCoperto());

        o.printOrder();

        ctx.close();
    }
}
