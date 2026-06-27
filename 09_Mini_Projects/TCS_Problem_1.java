import java.util.Scanner;
public class TCS_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int n2 = sc.nextInt();
        int sum=0;
        for (int i = n1; i <= n2; i++) {
            sum+=i*i*i;
        }
        System.out.println("The Sum of Cube is :"+sum);
    }
}
