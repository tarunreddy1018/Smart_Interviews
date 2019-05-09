import java.util.Scanner;

public class TrailingZerosEasy_8
{
    private static long countTrailingZeros(long number)
    {
        long count = 0;

        for(long k = 5;number/k>=1;k*=5)
        {
            count += number/k;
        }

        return count;
    }

    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);
	   StringBuilder outputString = new StringBuilder();

	   int testCases = s.nextInt();
	   while(testCases --> 0)
       {
           long number = s.nextLong();

           long trailingZeros = countTrailingZeros(number);
           outputString.append(trailingZeros).append("\n");
       }

       System.out.println(outputString);
    }
}
