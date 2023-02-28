import java.util.Scanner;
class reverseNUM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num , a,b,c,d,e,f,g;
        System.out.println("Enter a  3 digit number :: ");
        num = sc .nextInt();
        a=num/100;
        b=num%100;
        c=b/10;
        d=b%10;
        e=d*100;
        f=c*10;
        g=a+e+f;
        System.out.println("reverse of 3 digit number is :: "+g);
    }
}