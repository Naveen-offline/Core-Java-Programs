import java.util.Scanner;
public class Sum_of_Even_odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.println("Enter the size :");
        int a = sc.nextInt();
        int arr[]= new int[a];
        int sum=0,sum_even=0,sum_odd=0;
        for(int i=0; i<a;i++){
            System.out.println("enter the elements "+(i+1)+" :");
            arr[i]= sc.nextInt();
            sum = sum+arr[i];

            if(arr[i]%2==0){
                sum_even=sum_even+arr[i];
            }
            else{
                sum_odd =sum_odd+arr[i];
            }
        }
        System.out.println("Element of array");
        for(int i =0 ; i<a;i++){
            System.out.println((arr[i]%2==0)?arr[i]+"--Even num":arr[i]+"--odd num ");
        }
        System.out.println();
     System.out.println("Sum of Element :"+sum);
     System.out.println("Sum of even num: "+sum_even);
     System.out.println("Sum of odd num: "+sum_odd);
*/ 
     System.out.println("Enter the size :");
        int n= sc.nextInt();
        int ar[]= new int[n];
        int sum1=0,i=0;
     while (i<n) {
        System.out.println("Enter the element");
        ar[i]=sc.nextInt();
        sum1=sum1+ar[i];
        i++;
     }
     int b= ar.length,c=0,sum_even2=1;
     System.out.println("Elements of array");
     while (b>c) {
        System.out.println((ar[c]%2==0)?ar[c]+"--Even Num" : ar[c]+"--Odd num");
        if(c%2==0){
            sum_even2 = sum_even2*ar[c];
            System.out.println(ar[c]+"  in " +c+" in even index value");
        }
        c++;
     }
     System.out.println("Sum of Array : "+sum1);
     System.out.println("product of even index value "+sum_even2);
}
}