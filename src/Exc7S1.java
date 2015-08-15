/**
 * Created by guangshuozang on 8/15/15.
 */
public class Exc7S1 {
    static int[][] matrix ={{2,2,2,2,2,0},
            {1,1,1,1,1,1},
            {3,3,3,3,3,1},
            {4,4,4,4,4,1},
            {5,5,5,5,5,1}} ;
    public boolean convertMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        for(int i = 0; i < matrix.length; i++)
            if(row[i])
                for(int j = 0; j < matrix[0].length; j++)
                    matrix[i][j] = 0;

        for(int j = 0; j < matrix[0].length; j++)
            if(column[j])
                for(int i = 0; i < matrix.length; i++)
                    matrix[i][j] = 0;
        return true;

    }
    public void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.print('|');
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print('|');
            }
            System.out.println();
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print("--");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Exc7S1 instance = new Exc7S1();
        System.out.println("Before convert:");
        instance.printMatrix(matrix);
        System.out.println("After convert");
        instance.convertMatrix(matrix);
        instance.printMatrix(matrix);

    }
}
