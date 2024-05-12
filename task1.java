import java.util.Scanner;
class temperatureconverter
{
    static float n, sum;
    static void keltocel()
    {
        sum=(n-273.15f);
        System.out.print(sum+"°c\n");
    }
    static void celtokel()
    {
        sum=(n+273.15f);
        System.out.print(sum+"°k\n");
    }
    static void celtofer()
    {
        sum=(n*(9.0f/5.0f)+32);
        System.out.print(sum+"°f\n");
    }
    static void fertocel()
    {
        sum=(n-32)*(5.0f/9.0f);
        System.out.print(sum+"°c\n");
    }
    static void keltofer()
    {
        sum=((n-273.15f)*(9.0f/5.0f)+32);
        System.out.print(sum+"°f\n");
    }
    static void fertokel()
    {
        sum=((n-32)*(5.0f/9.0f)+273.15f);
        System.out.print(sum+"°k\n");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.print("enter any temperature= ");
            n= sc.nextFloat();
            System.out.print("Enter the unit(C/F/K)= ");
            String u=sc.next();
            u= u.toLowerCase();
            if(u.equals("c"))
            {
                System.out.print("The equal ferenhite temperature measurement is= ");
                celtofer();
                System.out.print("The equal kevin temperature measurement of is= ");
                celtokel();
            }
            else if(u.equals("f"))
            {
                System.out.print("The equal celcius temperature measurement of is= ");
                fertocel();
                System.out.print("The equal kevin temperature measurement of is= ");
                fertokel();
            }
            else if(u.equals("k"))
            {
                System.out.print("The equal ferenhite temperature measurement of is= ");
                keltofer();
                System.out.print("The equal celcius temperature measurement of is= ");
                keltocel();
            }
            else
            {
                System.out.println("Invalid input...");
            }
            System.out.print("Do you want to measure again?(Yes/No)= ");
            String y=sc.next();
            y= y.toLowerCase();
            if(!y.equals("yes"))
            {
                System.exit(0);
            }
        }
    }
}
