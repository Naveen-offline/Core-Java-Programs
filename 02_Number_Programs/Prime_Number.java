import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i*i<=a;i++){
             c=((a%i==0)?c+1:c);
            if(c!=0){
                break;
            }
        }
        System.out.println((c!=0)?"not prime":"prime");
    }
    
}
