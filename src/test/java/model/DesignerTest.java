package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignerTest {
    @Test
    void calculateBonus_returnsCorrectBonus() {
        Designer des = new Designer();
        des.setSalary(800);
        double bonus = des.calculateBonus();
        assertEquals(80,bonus);
    }
}
