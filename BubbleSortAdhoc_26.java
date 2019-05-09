import java.util.Scanner;

public class BubbleSortAdhoc_26
{
    private static int bubbleSortSwaps(int array[],int size)
    {
        int totalSwaps = 0;

        for(int i = 0;i < size-1;i++)
        {
            for(int j = 0;j < size-1-i;j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    totalSwaps++;
                }
            }
        }

        return totalSwaps;
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

           int swaps = bubbleSortSwaps(array,size);

           outputString.append(swaps).append("\n");
       }

       System.out.println(outputString);
    }
}
