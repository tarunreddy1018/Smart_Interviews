import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CustomCompare implements Comparator<ArrayList<Integer>>
{
    public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2)
    {
        int size1 = a1.size();
        int size2 = a2.size();

        int start1 = 0,start2 = 0;
        while((start1 < size1) && (start2 < size2))
        {
            if(a1.get(start1) != a2.get(start2))
                return (a1.get(start1) - a2.get(start2));

            start1++;
            start2++;
        }

        if((start1 == size1) && (start2 == size2))
            return 0;

        if(start1 < size1)
            return 1;

            return -1;

    }
}

public class SubsetsOfAnArray_19
{
    private static ArrayList<Integer> superSet[];

    private static int location;

    private static void generateSubsets(int set[],int size,int index,ArrayList<Integer> currentSet)
    {
        if(index == size)
        {
            if(currentSet.size() > 0)
            {
                ArrayList<Integer> al = new ArrayList<>(currentSet);
                superSet[location] = al;
                location++;
            }
            return;
        }

        generateSubsets(set,size,index+1,new ArrayList<>(currentSet));

        currentSet.add(set[index]);
        generateSubsets(set,size,index+1,new ArrayList<>(currentSet));
    }

    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);

	   int testCases = s.nextInt();
	   while(testCases --> 0)
       {
           int size = s.nextInt();

           int set[] = new int[size];
           for(int i = 0;i < size;i++)
           {
               set[i] = s.nextInt();
           }

           Arrays.sort(set);

           superSet = new ArrayList[(1<<size)-1];
           location = 0;

           generateSubsets(set,size,0,new ArrayList<Integer>());

           Arrays.sort(superSet,new CustomCompare());

           for(ArrayList<Integer> al:superSet)
           {
               for(int value:al)
               {
                   System.out.print(value + " ");
               }
               System.out.println();
           }
       }
    }
}
