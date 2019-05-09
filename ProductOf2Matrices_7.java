import java.util.Scanner;

public class ProductOf2Matrices_7
{
    private static void multiplyMatrices(int matrix1[][],int rows1,int cols1,int matrix2[][],int rows2,int cols2)
    {
        int product[][] = new int[rows1][cols2];

        for(int i = 0;i < rows1;i++)
        {
            for(int j = 0;j < cols2;j++)
            {
                for(int k = 0;k < cols1;k++)
                {
                    product[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        for(int i = 0;i < rows1;i++)
        {
            for(int j = 0;j < cols2;j++)
            {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int rows1 = s.nextInt();
            int cols1 = s.nextInt();

            int matrix1[][] = new int[rows1][cols1];

            for(int i = 0;i < rows1;i++)
            {
                for(int j = 0;j < cols1;j++)
                {
                    matrix1[i][j] = s.nextInt();
                }
            }

            int rows2 = s.nextInt();
            int cols2 = s.nextInt();

            int matrix2[][] = new int[rows2][cols2];

            for(int i = 0;i < rows2;i++)
            {
                for(int j = 0;j < cols2;j++)
                {
                    matrix2[i][j] = s.nextInt();
                }
            }

            multiplyMatrices(matrix1,rows1,cols1,matrix2,rows2,cols2);
        }
    }
}
