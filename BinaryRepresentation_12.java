import java.util.Scanner;

public class BinaryRepresentation_12
{
    private static String convertToBinary(int number)
    {
        String binaryString = "";
        while(number != 0)
        {
            int lsb = number & 1;
            if(lsb != 0)
            {
                binaryString = "1" + binaryString;
            }
            else
                binaryString = "0" + binaryString;

            number = number>>1;
        }

        if(binaryString.equals(""))
            return "0";

        return binaryString;
    }

    public static void main(String[] args)
    {
	   Scanner s = new Scanner(System.in);
	   StringBuilder outputString = new StringBuilder();

	   int testCases = s.nextInt();
	   while(testCases --> 0)
       {
           int number = s.nextInt();

           String binaryString = convertToBinary(number);

           outputString.append(binaryString).append("\n");
       }

       System.out.println(outputString);
    }
}
