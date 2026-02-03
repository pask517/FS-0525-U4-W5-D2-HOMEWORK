package andreapascarella.u5d2homework.runners;

import andreapascarella.u5d2homework.U5d2homeworkApplication;
import andreapascarella.u5d2homework.entities.*;
import andreapascarella.u5d2homework.enums.OrderState;
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

        Table table = (Table) ctx.getBean("table");

        Order o = new Order(List.of((Pizza) ctx.getBean("pizza_margherita"), (Pizza) ctx.getBean("hawaiian_pizza"), (Drink) ctx.getBean("lemonade"), (Drink) ctx.getBean("water")), OrderState.IN_CORSO, (Table) ctx.getBean("table"));

        o.printOrder();
    }
}
