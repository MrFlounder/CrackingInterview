package ChapterFive;

/**
 * Created by guangshuozang on 9/10/15.
 */
public class Exc5S1 {
    public static void main(String arg[]){
        int N = 0b10000000000;
        int M = 0b10011;
        Exc5S1 ins = new Exc5S1();
        System.out.println(Integer.toBinaryString(ins.insertMtoN(M, N, 2, 6)));
        System.out.println(Integer.toBinaryString(ins.updateBits(M, N, 2, 6)));

    }
    public int insertMtoN(int M, int N, int p2, int p1){
        int mask = ~((-1 << p2)- (-1 << p1+1));
        System.out.println(Integer.toBinaryString(-1<<p1));
        System.out.println(Integer.toBinaryString(-1 << p2));
        System.out.println("mask: "+Integer.toBinaryString(mask));
        M = M << p2;
        System.out.println("M: "+Integer.toBinaryString(M));
        return (M + (N&mask));
    }
    public int updateBits(int m, int n, int i, int j){
        int allOnes = ~0;
        int left = allOnes << (j+1);
        int right = ((i<<i) - 1);
        int mask = left | right;
        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }
}
