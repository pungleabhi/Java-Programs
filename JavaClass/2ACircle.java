import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double radius , area , circumference;
        System.out.println("ENter radius of circle ::");
        radius = sc.nextInt();
        area = 3.14*radius*radius;
        System.out.println("Area of circle is ::"+area);
        circumference = 2*3.14*radius;
        System.out.println("circumference of circle is ::"+circumference);
    }
}