import java.io.*;
import java.util.*;

public class SwapBits_17
{
    public static int swapBits(int n)
    {
        for (int i = 0; i < 32; i+=2)
        {
            n = swapBitsUtil(n, i, i+1);
        }

        return n;
    }

    public static int swapBitsUtil(int n, int i, int j)
    {
        int a = (n >> i) & 1;
        int b = (n >> j) & 1;

        if ((a ^ b) != 0)
        {
            return n ^= (1 << i) | (1 << j);
        }

        return n;
    }
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int number = s.nextInt();

            long reverseNumber = swapBits(number);

            outputString.append(reverseNumber).append("\n");
        }

        System.out.println(outputString);
    }
}