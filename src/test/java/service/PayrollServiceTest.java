package service;

import model.Designer;
import model.Developer;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollServiceTest {
    @Test
    void calculateTotalPayroll_returnsCorrectTotalPayroll(){
        Developer dev = new Developer();
        dev.setSalary(1000);
        Designer des = new Designer();
        des.setSalary(800);

        PayrollService payrollService = new PayrollService();
        double total = payrollService.calculateTotalPayroll(List.of(dev,des));

        assertEquals(1000 + 150 + 800 + 80,total);
    }
}
