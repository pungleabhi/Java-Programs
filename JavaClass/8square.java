import java.util.Scanner;
class NumSquare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a , b ;
        System.out.println("Enter a number :: ");
        a=sc.nextInt();
        b=a*a;
        System.out.println("square of number is :: "+b);
    }
}