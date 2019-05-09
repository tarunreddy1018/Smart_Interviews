import java.util.Scanner;

public class RepeatedNumbers_24
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int N = s.nextInt();

            int array[] = new int[N];

            int max = Integer.MIN_VALUE;
            for(int i = 0;i < array.length;i++)
            {
                array[i] = s.nextInt();
                max = Math.max(max,array[i]);
            }

            int hash[] = new int[max+1];

            int repeatedNumber1 = -1,repeatedNumber2 = -1;
            for(int i = 0;i < array.length;i++)
            {
                if(hash[array[i]] == 1)
                {
                    if(repeatedNumber1 == -1)
                        repeatedNumber1 = array[i];
                    else
                    {
                        repeatedNumber2 = array[i];
                        break;
                    }
                }
                else
                {
                    hash[array[i]]++;
                }
            }

            if(repeatedNumber1 < repeatedNumber2)
                outputString.append(repeatedNumber1 + " " + repeatedNumber2).append("\n");
            else
                outputString.append(repeatedNumber2 + " " + repeatedNumber1).append("\n");
        }

        System.out.println(outputString);
    }
}
