package andreapascarella.u5d2homework;

import andreapascarella.u5d2homework.entities.Item;
import andreapascarella.u5d2homework.entities.Order;
import andreapascarella.u5d2homework.entities.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
class U5d2homeworkApplicationTests {

    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Test
    void contextLoads() {
    }

    @Test
    void nullOrderTest() {
        Order o1 = new Order(List.of((Item) ctx.getBean("pizza_margherita")), (Table) ctx.getBean("table"));
        assertNotNull("L'ordine non dovrebbe essere vuoto", o1);
    }

    @Test
    void nullTableTest() {
        Order o1 = new Order(List.of((Item) ctx.getBean("pizza_margherita")), (Table) ctx.getBean("table"));
        assertNotNull("Il tavolo in un ordine non dovrebbe essere null", o1.getTable());
    }
}
