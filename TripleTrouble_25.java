import java.util.Scanner;

public class TripleTrouble_25
{
    private static int findElement(int array[],int size)
    {
        int a = 1,res = 0;
        for(int i = 0;i < 32;i++)
        {
            int count = 0;
            for(int j = 0;j < size;j++)
            {
                int k = array[j]&a;
                if(k != 0)
                    count++;
            }

            if(count%3 != 0)
                res = res|a;

            a = a<<1;
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
            int size = s.nextInt();

            int array[] = new int[size];
            for(int i = 0;i < size;i++)
            {
                array[i] = s.nextInt();
            }

            outputString.append(findElement(array,size)).append("\n");
        }

        System.out.println(outputString);
    }
}
