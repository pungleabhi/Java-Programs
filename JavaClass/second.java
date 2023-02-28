import java.util.Scanner;
class triangleAngles
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter angle a ::");
        a = sc.nextInt();
        System.out.println("Enter angle b ::");
        b = sc.nextInt();
        System.out.println("Enter angle c ::");
        c = sc.nextInt();
        if (a+b+c==180)
        {
            System.out.println("It is a triangle");
        }
        else
        {
            System.out.println("It is not a triangle");
        }
    }
}