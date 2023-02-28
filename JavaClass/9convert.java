import java.util.Scanner;
class MFI
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double m , f , i;
        System.out.println("Enetr value in meters ::");
        m = sc.nextDouble();
        f = m*3.28084;
        i = 12*m;
        System.out.println("meter to feet :: "+f);
        System.out.println("meter to inches :: "+i);
    }
}