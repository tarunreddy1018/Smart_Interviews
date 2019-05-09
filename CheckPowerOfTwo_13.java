import java.util.Scanner;

public class CheckPowerOfTwo_13
{
    private static boolean isPowerOf2(long number)
    {
        long k = number & (number-1);
        return k == 0?true:false;
    }

    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);
	   StringBuilder outputString = new StringBuilder();

	   int testCases = s.nextInt();
	   while(testCases --> 0)
       {
           long number = s.nextLong();

           if(isPowerOf2(number))
               outputString.append("True\n");
           else
               outputString.append("False\n");
       }

       System.out.println(outputString);
    }
}
