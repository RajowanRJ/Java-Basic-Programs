import java.util.Scanner;

public class CodeOfDivision 
{
    public static void main(String[] args)
            {
                Scanner x = new Scanner(System.in);
                int divisor, division = 0, divider, i;

                System.out.print("Enter The Divisor Number : ");
                divisor = x.nextInt();

                System.out.print("Enter The Divider Number : ");
                divider = x.nextInt();

                int divisor_2 = divisor;

                while(divisor_2 >= divider) 
                {
                    divisor_2 -= divider;
                    division = division + 1;
                }

                System.out.println("The Division of "+divisor+" / "+divider+" = "+division);
                if(divisor_2 != 0) 

                    {
                        System.out.println("The Reminder is "+divisor_2);
                    }   
            }
}
