public class Magic_Number {
    public static void main(String[] args) {
        int a=1234;
        int sum=0;
        while(a>0 || sum>9){
            if(a==0){
                a=sum;
                sum=0;
            }
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println((sum==1)?"magic number":"not magic number");
    }
}



