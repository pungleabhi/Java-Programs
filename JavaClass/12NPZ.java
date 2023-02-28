import java.util.Scanner;
class npz
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number :: ");
        a = sc.nextInt();
        if (a>0)
        {
            System.out.println("a is positive number");
        }
        else if (a<0)
        {
            System.out.println("a is negative number");
        }
        else
        {
            System.out.println("a is Zero");
        }
    }
}