import java.util.Scanner;
public class Sum_of_Odd_Even_Number {
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");     
        int n = s1.nextInt();
        int os = 0;
        int es = 0;
        int i = 1;
        while (i <= n)
        {
            if (i % 2 == 0) 
            {
                es = es + i;
                System.out.println(i + " is an even number.");
            } 
            else 
            {
                os = os + i;
                System.out.println(i + " is an odd number.");
            }
            i++;
        }
        System.out.println("Sum of odd numbers: " + os);
        System.out.println("Sum of even numbers: " + es);
    }
}