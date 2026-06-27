class Palindrom_program {
    static int rev(int a)
    {
        int r =0;
        while(a!=0){
            int d = a%10;
            r = r*10+d;
            a=a/10;
        }
        return r;
    } 
       public static void main(String [] args)
    {    
        int a = 12345;
        int n = rev(a);
        System.out.println(a);
        System.out.println(n);
        if (a==n){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}