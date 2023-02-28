import java.util.Scanner;
class ternary
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a , b , max;
        System.out.println("Enter 2 numbers ::");
        a = sc.nextInt();
        b = sc.nextInt();
        max = a>b?a:b;
        System.out.println("Max number is "+max);
    }
}