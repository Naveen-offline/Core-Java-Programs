import java.util.Scanner;
class Bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        int  total_Deposite=0,total_withdraw=0,total_amount=0;
        for(int i =0;i<10;i++){
            System.out.println("Enter the Amount :");
            arr[i]= sc.nextInt();
            if(arr[i]>0){
                total_amount= total_amount+arr[i];
                total_Deposite = total_Deposite+arr[i];
            }
            else{
                total_amount=total_amount-Math.abs(arr[i]);
                total_withdraw = total_withdraw+Math.abs(arr[i]);  
            }
        }
        System.out.println("the Total Deposite :"+total_Deposite);
        System.out.println("the Total Withdrew :"+ total_withdraw);
        System.out.println("Final Balance : "+total_amount);
        System.out.println();
    }
}


