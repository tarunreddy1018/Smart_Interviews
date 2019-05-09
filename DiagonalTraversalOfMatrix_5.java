import java.util.Scanner;

public class DiagonalTraversalOfMatrix_5
{
    private static void diagonalTraversal(int matrix[][],int size)
    {
        int startX = 0;
        int startY = size-1;

        for(int diagonal = 1;diagonal <= (2*size-1);diagonal++)
        {
            int sum = 0;
            int i = startX,j = startY;
            while(i < size && j < size)
            {
                sum += matrix[i][j];
                i++;
                j++;
            }

            System.out.print(sum + " ");

            if(startY != 0)
            {
                startY--;
            }
            else
            {
                startX++;
            }
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);

	   int testCases = s.nextInt();
	   while(testCases --> 0)
       {
           int size = s.nextInt();

           int matrix[][] = new int[size][size];

           for(int i = 0;i < size;i++)
           {
               for(int j = 0;j < size;j++)
               {
                   matrix[i][j] = s.nextInt();
               }
           }

           diagonalTraversal(matrix,size);
       }
    }
}
