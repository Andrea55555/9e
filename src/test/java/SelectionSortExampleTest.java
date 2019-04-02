import org.junit.*;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class SelectionSortExampleTest {

    @Test
    public void testSortingSorted() {
        int[] array = {1, 2, 3};
        int[] act = SelectionSortExample.selectionSort(array);
        int[] exp = {1, 2, 3};
        Assert.assertArrayEquals(act, exp);
    }
    @Ignore
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }
    @Test(expected = NullPointerException.class)
    public void testToHexStringWrong() {
        SelectionSortExample.selectionSort(null);
    }
    @Test
    public void numbers() {
        System.out.println("сравнить цифры вручную");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};assertEquals("[I@5123a213", SelectionSortExample.selectionSort(array).toString());
    }

    @Test
    public void checkExpectedException () {
        final int factorialOf = -5;
        int[] array = {1, 2, 3, 4};
        System.out.println(factorialOf + "! = " + SelectionSortExample.selectionSort(array).toString());
    }
}