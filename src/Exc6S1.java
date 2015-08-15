/**
 * Created by guangshuozang on 8/15/15.
 * I want to kill myself now
 * It's better solution then book solution
 * Time < O(n^2), Space O(n)
 */
public class Exc6S1 {
    static int[][] matrix ={{2,2,2,2,2},
                    {1,1,1,1,1},
                    {3,3,3,3,3},
                    {4,4,4,4,4},
                    {5,5,5,5,5}} ;
    public int[][] rotateMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length - i - 1; j++){
                int temp = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[i][j];
                matrix[i][j] = matrix[j][matrix[0].length-1-i];
                matrix[j][matrix[0].length-1-i] = matrix[matrix[0].length-1-i][matrix[0].length-1-j];
                matrix[matrix[0].length-1-i][matrix[0].length-1-j] = temp;
            }
        }
        return matrix;
    }
    public int[][] rotateMatrixWextraSpace(int[][] matrix){
        int[][] returnMatrix = new int[matrix.length][matrix[0].length];
        int length = returnMatrix.length;
        int lvllength = returnMatrix.length - 1;
        for(int i = 0; i < matrix.length/2 +1; i++){
            lvllength = lvllength - i;
            for(int j = i; j < lvllength; j++){
                returnMatrix[length-1-j][i] = matrix[i][j];
                returnMatrix[i][j] = matrix[j][length-1-i];
                returnMatrix[j][length-1-i] = matrix[length-1-i][length-1-j];
                returnMatrix[length-1-i][length-1-j] = matrix[length-1-j][i];
            }
        }
        return returnMatrix;
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
        Exc6S1 instance = new Exc6S1();
        instance.printMatrix(matrix);
        System.out.println("After rotate:");
        instance.printMatrix(instance.rotateMatrixWextraSpace(matrix));
        System.out.println("After rotate within space:");
        instance.printMatrix(instance.rotateMatrix());
    }
}
