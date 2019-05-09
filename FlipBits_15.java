import java.util.Scanner;

public class FlipBits_15
{
    private static int countFlipBits(int a,int b)
    {
        int count = 0;
        while(a != 0 || b!= 0)
        {
            int lsbA = a&1;
            int lsbB = b&1;

            if(lsbA != lsbB)
                count++;

            a=a>>1;
            b=b>>1;
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
           int a = s.nextInt();
           int b = s.nextInt();

           int count = countFlipBits(a,b);

           outputString.append(count).append("\n");
       }

       System.out.println(outputString);
    }
}
