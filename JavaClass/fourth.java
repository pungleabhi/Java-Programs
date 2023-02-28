import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double c , f;
        System.out.println("Enter temperature in fahreinheit::");
        f=sc.nextInt();
        c=(5.0/9.0)*(f-32);
        System.out.println("temperature in celcius ::"+c);
    }
}