import java.util.Scanner;
class alphabet
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        int a;
        System.out.println("Enter a character");
        ch = sc.next().charAt(0);
        a=ch;
        if(a>=65 && a<=90 )
        {
            System.out.println("it is alphabet");
        }
        else if(a>=97 && a<=122 )
        {
            System.out.println("it is alphabet");
        }
        else
        {
            System.out.println("it is not alphabet");
        }
    }
}