import java.util.Scanner;

public class PrintHollowDiamondPattern_2
{
    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);

	   int testCases = s.nextInt();
	   for(int t = 1;t <= testCases;t++)
       {
           int totalLines = s.nextInt();

           System.out.println("Case #" + t + ":");

           int mid = (totalLines/2)+1;
           int middleSpaces = -1;
           for(int line = 1;line <= totalLines;line++)
           {
               int spacesBefore = Math.abs(mid-line);

               for(int spaces = 1;spaces <= spacesBefore;spaces++)
               {
                   System.out.print(" ");
               }

               System.out.print("*");

               if(middleSpaces != -1)
               {
                   for(int spaces = 1;spaces <= middleSpaces;spaces++)
                   {
                       System.out.print(" ");
                   }

                   System.out.print("*");
               }

               if(line < mid)
                   middleSpaces += 2;
               else
                   middleSpaces -= 2;

               System.out.println();
           }
       }
    }
}
