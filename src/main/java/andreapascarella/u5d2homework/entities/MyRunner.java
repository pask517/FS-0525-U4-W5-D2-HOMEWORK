package andreapascarella.u5d2homework.entities;

import andreapascarella.u5d2homework.U5d2homeworkApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d2homeworkApplication.class);

        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();

        Order o = (Order) ctx.getBean("order");

        o.printOrder();
    }
}
