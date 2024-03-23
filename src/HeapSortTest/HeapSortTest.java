import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {

    @Test
    public void testHeapSort() {
        double[] arr = {12, 11, 13, 5, 6, 7};
        Main.heapSort(arr);
        double[] expected = {5, 6, 7, 11, 12, 13};
        assertArrayEquals(expected, arr);
        System.out.println("Тестирование позитивного метода пройдено.");

    }

    @Test
    public void testEmptyArray() {
        double[] arr = {};
        Main.heapSort(arr);
        double[] expected = {};
        assertArrayEquals(expected, arr);
        System.out.println("Тестирование пустого массива пройдено.");

    }

    @Test
    public void testAlreadySortedArray() {
        double[] arr = {1, 2, 3, 4, 5};
        Main.heapSort(arr);
        double[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
        System.out.println("Тестирование уже отсортированного массива пройдено.");

    }

    @Test
    public void testDescendingArray() {
        double[] arr = {5, 4, 3, 2, 1};
        Main.heapSort(arr);
        double[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
        System.out.println("Тестирование обратно отсортированного массива пройдено.");

    }
    @Test
    public void testFractionalNumbers() {
        double[] arr = {3.14, 2.71, 1.618, 0.5, 0.001};
        double[] expected = {0.001, 0.5, 1.618, 2.71, 3.14};
        Main.heapSort(arr);
        assertArrayEquals(expected, arr, 0.0001);
        System.out.println("Тестирование чисел с плавающей точкой пройдено.");

    }

    @Test
    public void testNegativeNumbers() {
        double[] arr = {-5, -3, -8, -1, -10};
        double[] expected = {-10, -8, -5, -3, -1};
        Main.heapSort(arr);
        assertArrayEquals(expected, arr);
        System.out.println("Тестирование отрицательных чисел пройдено.");
    }

}
