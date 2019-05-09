import java.util.Scanner;

public class RotationOfMatrix_4
{
    private static int matrix[][];

    private static void rotateMatrix(int size)
    {
        int left = 0,right = size-1,bottom = size-1,top = 0;

        while(left < right && top < bottom)
        {
            for(int offset = 0;offset <= (right-left-1);offset++)
            {
                int value = matrix[top][left+offset];

                matrix[top][left+offset] = matrix[bottom-offset][left];
                matrix[bottom-offset][left] = matrix[bottom][right-offset];
                matrix[bottom][right-offset] = matrix[top+offset][right];
                matrix[top+offset][right] = value;
            }
            left++;
            top++;
            bottom--;
            right--;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int testCases = s.nextInt();
        for(int t = 1;t <= testCases;t++)
        {
            int size = s.nextInt();

            matrix = new int[size][size];

            for(int i = 0;i < size;i++)
            {
                for(int j = 0;j < size;j++)
                {
                    matrix[i][j] = s.nextInt();
                }
            }

            rotateMatrix(size);

            System.out.println("Test Case #" + t + ":");

            for(int i = 0;i < size;i++)
            {
                for(int j = 0;j < size;j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
