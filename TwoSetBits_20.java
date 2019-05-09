import java.util.Scanner;

public class TwoSetBits_20
{
    private static int MOD = 1000000007;

    private static long binarySearch(long low,long high,long N)
    {
        if(low <= high)
        {
            long mid = (low + high)/2;

            long functionValue = (mid*(mid+1))/2;

            if(low == high)
            {
                if(functionValue < N)
                    return low;
                else
                    return low-1;
            }

            if(functionValue < N)
            {
                return binarySearch(mid+1,high,N);
            }
            else
            {
                return binarySearch(low,mid-1,N);
            }
        }
        return high;
    }

    private static long aPowerB(int a,long b)
    {
        long result = 1,multiplier = a;

        while(b != 0)
        {
            long lsb = b&1;
            if(lsb != 0)
            {
                result = (result*multiplier)%MOD;
            }

            multiplier = (multiplier*multiplier)%MOD;
            b = b>>1;
        }

        return  result%MOD;
    }

    private static long findNumber(long N)
    {
        long index = binarySearch(0,1000000000,N);

        long offset = N - (index*(index+1))/2;

        System.out.println(index + " " + offset);

        index++;
        long res1 = aPowerB(2,index);

        offset--;
        long res2 = aPowerB(2,offset);

        //long result = ((1<<(index+1))%MOD + (1<<(offset-1))%MOD)%MOD;
        long result = (res1 + res2)%MOD;

        return result;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            long N = s.nextLong();

            outputString.append(findNumber(N)).append("\n");
        }

        System.out.println(outputString);
    }
}
