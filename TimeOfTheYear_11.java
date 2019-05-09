import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeOfTheYear_11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int p=0;p<t;p++)
        {
          long s=sc.nextLong();

          s=s*1000;

          Date d=new Date(s);

          SimpleDateFormat df=new SimpleDateFormat("dd-MMM-yyyy");

          SimpleDateFormat df2=new SimpleDateFormat("EEEE");

          System.out.println(df.format(d).toUpperCase()+" "+df2.format(d));
        }
    }
}
