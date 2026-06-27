public class Armstrong_Number {
    public static void main(String[] args) {
        int a = 153;
        int sum = 0;
        int temp = a;
        while(a!=0){
            int b = a%10;
            sum = sum + (b*b*b);
            a=a/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
