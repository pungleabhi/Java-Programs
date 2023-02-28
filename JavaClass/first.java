import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num , a,b,c,d,e;
        System .out.println("Enter a three digit number ::");
        num=sc.nextInt();
        a=num/100;
        b=num%100;
        c=b/10;
        d=b%10;
        e=(a*a*a)+(b*b*b)+(c*c*c);
        if(e==num)
        {
            System.out.println("number is an armstrong number");
        }
        else
        {
            System.out.println("number is not an armstrong number");
        }
    }
}