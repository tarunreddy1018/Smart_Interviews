import java.util.Scanner;

public class ComputeAPowerB_18
{
    private static int MOD = 1000000007;

    private static long aPowerB(int a,int b)
    {
        long result = 1,multiplier = a;

        while(b != 0)
        {
            int lsb = b&1;
            if(lsb != 0)
            {
                result = (result*multiplier)%MOD;
            }

            multiplier = (multiplier*multiplier)%MOD;
            b = b>>1;
        }

        return  result%MOD;
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

           outputString.append(aPowerB(a,b)).append("\n");
       }

       System.out.println(outputString);
    }
}
