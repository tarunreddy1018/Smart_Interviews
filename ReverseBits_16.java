import java.math.BigInteger;
import java.util.Scanner;

public class ReverseBits_16
{
    private static BigInteger reverseBits(int n)
    {
        BigInteger reverse = new BigInteger(String.valueOf(0));

        for (int i = 0; i < 16; i++)
        {
            reverse = reverse.add(swapBits(n, i, 32 - i - 1));
        }

        return reverse;
    }

    private static BigInteger aPowerB(int a,int b)
    {
        BigInteger result = new BigInteger(String.valueOf(1));
        BigInteger multiplier = new BigInteger(String.valueOf(a));

        while(b != 0)
        {
            int lsb = b&1;
            if(lsb != 0)
            {
                result = result.multiply(multiplier);
            }

            multiplier = multiplier.multiply(multiplier);
            b = b>>1;
        }

        return  result;
    }

    private static BigInteger swapBits(int n, int i, int j)
    {
        int a = (n >> i) & 1;
        int b = (n >> j) & 1;

        BigInteger res = new BigInteger(String.valueOf(1));
        if ((a ^ b) != 0)
        {
            if(a != 0)
            {
                res = aPowerB(2,j);
            }
            else
            {
                res = aPowerB(2,i);
            }
        }
        else
        {
            if(a != 0 && b != 0)
            {
                BigInteger b1 = new BigInteger(String.valueOf(1));
                BigInteger b2 = new BigInteger(String.valueOf(1));
                BigInteger result = new BigInteger(String.valueOf(0));

                b1 = aPowerB(2,i);

                b2 = aPowerB(2,j);

                res = result.add(b1).add(b2);
            }
            else
            {
                res = new BigInteger(String.valueOf(0));
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int number = s.nextInt();

            BigInteger reverseNumber = reverseBits(number);

            outputString.append(reverseNumber).append("\n");
        }

        System.out.println(outputString);
    }
}
