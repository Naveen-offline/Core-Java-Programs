public class Perfect_Number_Check {
    public static void main(String[] args) {
        int a = 28;
        int sum = 0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum = sum + i;
            }
        }
        if(sum==a){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
