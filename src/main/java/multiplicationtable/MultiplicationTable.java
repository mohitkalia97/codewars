package multiplicationtable;

/*Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]*/
public class MultiplicationTable {
    public static int [][] multiplicationTable(int n){
        int [][] finalIntArray = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                finalIntArray[i-1][j-1] = i*j;
            }
        }
        return finalIntArray;
    }
}


