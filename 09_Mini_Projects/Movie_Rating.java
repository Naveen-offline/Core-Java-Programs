import java.util.Scanner;
public class Movie_Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the users count :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        int total=0,avg,count=0;
        for(int i =0;i<n;i++){
            System.out.println("Enter the User Movie Rating out of 5 : ");
            arr[i]= sc.nextInt();
            total = total+arr[i];
            if(arr[i]==5){
                count++;
            }
        }
        avg = total/n;
        System.out.println("Avg Rating "+avg);
        System.out.println("5 Star Rating users count : "+count);

        
    }
}
