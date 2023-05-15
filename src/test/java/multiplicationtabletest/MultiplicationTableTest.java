package multiplicationtabletest;


import multiplicationtable.MultiplicationTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]*/
public class MultiplicationTableTest {

    @Test
    public void testMultiplicationTable() {
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };

        int[][] result = MultiplicationTable.multiplicationTable(3);

        assertArrayEquals(expected, result);
    }

}