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
        if(a==97)
        {
            System.out.println("it is vowel");
        }
        else if(a==101)
        {
            System.out.println("it is vowel");
        }
        else if(a==105)
        {
            System.out.println("it is vowel");
        }
        else if(a==111)
        {
            System.out.println("it is vowel");
        }
        else if(a==117)
        {
            System.out.println("it is vowel");
        }
        else if(a==65)
        {
            System.out.println("it is vowel");
        }
        else if(a==69)
        {
            System.out.println("it is vowel");
        }
        else if(a==73)
        {
            System.out.println("it is vowel");
        }
        else if(a==79)
        {
            System.out.println("it is vowel");
        }
        else if(a==85)
        {
            System.out.println("it is vowel");
        }
        else if(a>=65 && a<=90)
        {
            System.out.println("it is consonent");
        }
        else if(a>=97 && a<=122)
        {
            System.out.println("it is consonent");
        }
        else
        {
            System.out.println("it is consonent");
        }
    }
}