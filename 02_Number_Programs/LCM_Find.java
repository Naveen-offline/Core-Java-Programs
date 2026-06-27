public class LCM_Find {
    static int LCM(int a,int b){
        int lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm++;
        }
    }
    public static void main(String[] args) {
        int a=12;
        int b=15;
        
        /* 
        int lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        */

        System.out.println(LCM(a,b));
    }
    
}
