import java.util.Scanner;

class Point
{
    public long x;
    public long y;

    public Point(long x,long y)
    {
        this.x = x;
        this.y = y;
    }
}

class Rectangle
{
    public Point bottomLeft;
    public Point topRight;

    public Rectangle(Point bottomLeft,Point topRight)
    {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
}

public class OverlappingRectangles_10
{
    private static long totalArea(Rectangle r)
    {
        long area = ((r.topRight.x - r.bottomLeft.x)*(r.topRight.y - r.bottomLeft.y));

        return area;
    }

    private static boolean isOverlapping(Rectangle r1,Rectangle r2)
    {
        if((r1.topRight.x <= r2.bottomLeft.x) || (r1.bottomLeft.x >= r2.topRight.x))
            return false;

        if((r1.bottomLeft.y >= r2.topRight.y) || (r1.topRight.y <= r2.bottomLeft.y))
            return false;

        return true;
    }

    private static long overlappingArea(Rectangle r1,Rectangle r2)
    {
        long bottomLeftX = Math.max(r1.bottomLeft.x,r2.bottomLeft.x);
        long bottomLeftY = Math.max(r1.bottomLeft.y,r2.bottomLeft.y);

        long topRightX = Math.min(r1.topRight.x,r2.topRight.x);
        long topRightY = Math.min(r1.topRight.y,r2.topRight.y);

        Rectangle r = new Rectangle(new Point(bottomLeftX,bottomLeftY),new Point(topRightX,topRightY));

        long area = totalArea(r);

        return area;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringBuilder outputString = new StringBuilder();

        int testCases = s.nextInt();
        while(testCases --> 0)
        {
            Rectangle r1 = new Rectangle(new Point(s.nextLong(),s.nextLong()),new Point(s.nextLong(),s.nextLong()));
            Rectangle r2 = new Rectangle(new Point(s.nextLong(),s.nextLong()),new Point(s.nextLong(),s.nextLong()));

            long area = totalArea(r1) + totalArea(r2);

            if(isOverlapping(r1,r2))
            {
                area -= overlappingArea(r1,r2);
            }

            outputString.append(area).append("\n");
        }

        System.out.println(outputString);
    }
}
