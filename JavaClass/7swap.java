import java.util.Scanner;
class Swap7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a , b ;
        System.out.println("Eneter 2 numbers ::");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}