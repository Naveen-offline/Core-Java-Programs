import java.util.Scanner;
class Max_Min_3 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();   
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int d = sc.nextInt();
        System.out.println("Enter the fifth number: ");
        int e = sc.nextInt();
        int max=(a>b?a:b);
        max=(max>c?max:c);
        max=(max>d?max:d);
        max=(max>e?max:e);
        System.out.println("The greatest number is: " + max);

    }
}