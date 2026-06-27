import java.util.Scanner;
public class Max_Min_1 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int max = 0;
        int min = 9;
        while (a>0) {
            int b = a%10;
            max = (max<b)?b:max;
            min = (min>b)?b:min;
            a = a/10;
        }
        System.out.println("The maximum digit is: " + max);
        System.out.println("The minimum digit is: " + min); 
        }
}
