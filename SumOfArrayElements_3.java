import java.util.Scanner;

public class SumOfArrayElements_3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
           int size = s.nextInt();

           long sum = 0;
           while(size --> 0)
           {
               sum += s.nextLong();
           }

           outputString.append(sum).append("\n");
        }

        System.out.println(outputString);
    }
}
