import java.util.Scanner;
class RectArea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double length , breadth , area , perimeter;
        System.out.println("Enter length of rectangle ::");
        length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle ::");
        breadth = sc.nextDouble();
        area = length * breadth;
        System.out.println("area is ::"+area);
        perimeter = 2.0*(length * breadth);
        System.out.println("perimeter is ::"+perimeter);
    }
}