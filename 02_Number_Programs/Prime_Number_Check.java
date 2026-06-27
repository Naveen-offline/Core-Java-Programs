public class Prime_Number_Check {
    public static void main(String[] args) {
        int a = 29;
        boolean isPrime = true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
