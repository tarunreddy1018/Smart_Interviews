import java.util.Scanner;

public class TowerOfHanoiEasy_21
{
    private static StringBuilder moves;

    private static int totalMoves;

    private static void towerOfHanoi(int totalDisks,char src,char temp,char dest)
    {
        if(totalDisks == 0)
            return;

        towerOfHanoi(totalDisks-1,src,dest,temp);
        moves.append("Move " + totalDisks + " from " + src + " to " + dest).append("\n");
        totalMoves++;
        towerOfHanoi(totalDisks-1,temp,src,dest);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            int totalDisks = s.nextInt();

            moves = new StringBuilder();
            totalMoves = 0;

            towerOfHanoi(totalDisks,'A','B','C');

            outputString.append(totalMoves).append("\n").append(moves);
        }

        System.out.println(outputString);
    }
}
