import java.util.Scanner;

public class PrintRightAngledTrianglePattern_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int t = 1;t <= testCases;t++)
        {
            int lines = s.nextInt();
            System.out.println("Case #" + t + ":");
            for(int i = 1;i <= lines;i++)
            {
                int spaces = lines-i;
                for(int j = 1;j <= spaces;j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1;j <= i;j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}