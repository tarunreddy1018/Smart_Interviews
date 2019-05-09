import java.util.Scanner;

public class FindingMissingNumber_14
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int size = s.nextInt();

            int sum = 0;

            for(int i = 0;i < size;i++)
            {
                sum += s.nextInt();
            }
            int totalSum = ((size+1)*(size+2))/2;

            outputString.append(totalSum-sum).append("\n");
        }
        System.out.println(outputString);
    }
}
