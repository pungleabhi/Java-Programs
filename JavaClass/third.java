import java.util.Scanner;
class ternery
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a , b , max;
        System.out.println("Enyter 2 numbers ::");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
        System.out.println("Max number is " + max);
    }
}