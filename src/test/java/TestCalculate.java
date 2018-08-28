import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void testAdditionCalc() {
        Addition ecotest = new Addition();
        Assert.assertEquals("Неправильно складывем числа",10, ecotest.getSumNum(4, 6), 0);
    }
    @Test
    public void testDivisionCalc() {
        Division ecotest = new Division();
        Assert.assertEquals("Неправильно вычитаем числа", 48, ecotest.getDivNum(148, 100), 0);
    }
    @Test
    public void testMultiplicCalc() {
        Multiplication ecotest = new Multiplication();
        Assert.assertEquals("Неправильно умножаем числа", 42.886, ecotest.getMultiNum(5.23, 8.2), 0);
    }
    @Test
    public void testSustractCalc() {
        Substraction ecotest = new Substraction();
        Assert.assertEquals("Неправильно делим числа", 64.5, ecotest.getSubNum(258, 4), 0);
    }
}
