import java.math.BigInteger;
import java.util.Scanner;

public class LCMAndHCF_9
{
    private static int euclidsGCD(int a,int b)
    {
        return b == 0?a:euclidsGCD(b,a%b);
    }

    private static BigInteger LCM(int a,int b,int gcd)
    {
        BigInteger product = new BigInteger(String.valueOf(a)).multiply(new BigInteger(String.valueOf(b)));
        BigInteger lcm = product.divide(new BigInteger(String.valueOf(gcd)));

        return lcm;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int a = s.nextInt();
            int b = s.nextInt();

            int gcd = euclidsGCD(a,b);
            BigInteger lcm = LCM(a,b,gcd);

            outputString.append(lcm + " " + gcd).append("\n");
        }

        System.out.println(outputString);
    }
}
