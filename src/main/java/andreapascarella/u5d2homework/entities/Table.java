package andreapascarella.u5d2homework.entities;

import andreapascarella.u5d2homework.enums.TableState;
import lombok.Getter;

@Getter
public class Table {

    private int counter = 1;

    private int number;

    private int maxCoperti;

    private TableState tableState;

    public Table(int maxCoperti, TableState tableState) {
        this.maxCoperti = maxCoperti;
        this.tableState = tableState;
        this.number = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", maxCoperti=" + maxCoperti +
                ", tableState=" + tableState +
                '}';
    }
}
