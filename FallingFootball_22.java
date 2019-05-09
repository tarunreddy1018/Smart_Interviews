import java.io.*;

public class FallingFootball_22
{
    private static char matrix[][];

    private static int offset = 100;

    private static int findRow(int col)
    {
        for(int i = 50;i >= 0;i--)
        {
            if(matrix[i][col] == ' ')
            {
                return i;
            }
        }
        return 0;
    }

    private static void insertFootball(int position)
    {
        int col = position + offset;

        int row = findRow(col);

        if(row == matrix.length-1)
        {
            matrix[row][col] = 'O';
        }
        else
        {
            while(true)
            {
                if(row == matrix.length-1)
                {
                    matrix[row][col] = 'O';
                    break;
                }

                if(matrix[row+1][col-1] != ' ' && matrix[row+1][col+1] != ' ')
                {
                    matrix[row][col] = 'O';
                    break;
                }
                else if((matrix[row+1][col+1] == ' ' && matrix[row+1][col-1] != ' ') || (matrix[row+1][col+1] == ' ' && matrix[row+1][col-1] == ' '))
                {
                    row++;
                    col++;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
    }

    private static int findLeftBoundary()
    {
        for(int j = 0;j < 201;j++)
        {
            if(matrix[matrix.length-1][j] == 'O')
                return j;
        }

        return 0;
    }

    private static int findRightBoundary()
    {
        for(int j = 200;j >= 0;j--)
        {
            if(matrix[matrix.length-1][j] == 'O')
                return j;
        }

        return 0;
    }

    private static int findUpperBoundary()
    {
        for(int i = 0;i < 51;i++)
        {
            for(int j = 0;j < 201;j++)
            {
                if(matrix[i][j] == 'O')
                    return i;
            }
        }

        return 0;
    }

    private static StringBuilder printMatrix()
    {
        StringBuilder result = new StringBuilder();

        int leftBoundary = findLeftBoundary();
        int rightBoundary = findRightBoundary();
        int upperBoundary = findUpperBoundary();
        int lowerBoundary = matrix.length-1;

        for(int i = upperBoundary;i <= lowerBoundary;i++)
        {
            for(int j = leftBoundary;j <= rightBoundary;j++)
            {
                if(matrix[i][j] == ' ')
                    result.append('.');
                else
                    result.append('O');
            }
            result.append("\n");
        }

        return result;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder outputString = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        for(int t = 1;t <= testCases;t++)
        {
            int totalFootballs = Integer.parseInt(br.readLine());

            matrix = new char[51][201];

            for(int i = 0;i < 51;i++)
            {
                for(int j = 0;j < 201;j++)
                {
                    matrix[i][j] = ' ';
                }
            }

            String positions[] = br.readLine().split(" ");

            for(int i = 0;i < totalFootballs;i++)
            {
                int position = Integer.parseInt(positions[i]);

                insertFootball(position);
            }

            outputString.append("Case " + t + ":\n");
            outputString.append(printMatrix());
        }

        bw.write(outputString.toString());
        bw.close();
    }
}
