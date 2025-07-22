package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeveloperTest {

    @Test
    void calculateBonus_returnsCorrectBonus() {
        Developer dev = new Developer();
        dev.setSalary(1000);
        double bonus = dev.calculateBonus();
        assertEquals(150,bonus);
    }
}
