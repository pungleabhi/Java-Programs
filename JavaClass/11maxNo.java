import java.util.Scanner;
class maximum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a , b , c;
        System.out.println("Enter 3 numbers :: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("a is maximum");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is maximum");
        }
        else
        {
            System.out.println("c is maximum");
        }
    }
}