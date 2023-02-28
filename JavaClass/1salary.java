import java.util.Scanner;
class GSalary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double BasicSalary , da , hra , GrossSalary;
        System.out.println("ENter Basic salary ::");
        BasicSalary = sc.nextDouble();
        da = (20.0/100.0)*BasicSalary;
        System.out.println("da is ::"+da);
        hra = (40.0/100.0)*BasicSalary;
        System.out.println("hra is ::"+hra);
        GrossSalary = BasicSalary + da + hra;
        System.out.println("Gross Salary is ::"+GrossSalary);
    }
}