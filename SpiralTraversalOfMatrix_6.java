import java.util.Scanner;

public class SpiralTraversalOfMatrix_6
{
    private static void spiralTraversal(int matrix[][],int size)
    {
        int left = 0,top = 0,right = size-1,bottom = size-1;

        while(left <= right && top <= bottom)
        {
            for(int j = left;j <= right;j++)
            {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            if(top < bottom)
            {
                for(int i = top;i <= bottom;i++)
                {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            }

            if(left < right)
            {
                for(int j = right;j >= left;j--)
                {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            if(top <= bottom)
            {
                for(int i = bottom;i >= top;i--)
                {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
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

            spiralTraversal(matrix,size);
        }
    }
}
