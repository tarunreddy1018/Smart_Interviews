import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Interleavings_23
{
    private static ArrayList<String> interleavings;

    private static void findInterleavings(String a,String b,String c,int startA,int startB)
    {
        if((startA == a.length()) && (startB == b.length()))
        {
            interleavings.add(c);
            return;
        }

        if(startA < a.length())
        {
            findInterleavings(a, b, c + a.charAt(startA), startA + 1, startB);
        }

        if(startB < b.length())
        {
            findInterleavings(a, b, c + b.charAt(startB), startA, startB + 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        for(int t = 1;t <= testCases;t++)
        {
            String a = s.next();
            String b = s.next();

            interleavings = new ArrayList<>();

            findInterleavings(a,b,"",0,0);

            Collections.sort(interleavings);

            outputString.append("Case #" + t + ":").append("\n");

            for(String value:interleavings)
            {
                 outputString.append(value).append("\n");
            }
        }

        System.out.println(outputString);
    }
}
