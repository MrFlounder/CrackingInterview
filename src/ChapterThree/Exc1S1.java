package ChapterThree;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by guangshuozang on 8/17/15.
 */
public class Exc1S1 {
        int stackSize = 2;
        int[] buffer = new int[stackSize * 3];
        int[] stackPointer = {0,0,0};

        void push(int stackNum, int value) throws Exception {
            if(stackPointer[stackNum] >= stackSize){
                throw new Exception("Stack is full");
            }
            buffer[stackPointer[stackNum]+stackNum*stackSize] = value;
            stackPointer[stackNum] ++;
        }
        int pop(int stackNum) throws Exception{
            if (stackPointer[stackNum] < 0) {
                throw new Exception("Stack is empty");
            }
            int temp = buffer[stackPointer[stackNum]];
            buffer[stackPointer[stackNum]+stackNum*stackSize]--;
            return temp;
        }

    public static void main(String arg[]) throws Exception{
        Scanner in = new Scanner(System.in);
        int stackNum;
        int value;
        Exc1S1 instance = new Exc1S1();
        while(true){
            stackNum = in.nextInt();
            value = in.nextInt();
            instance.push(stackNum,value);
            System.out.println(Arrays.toString(instance.buffer));
        }
    }
}
