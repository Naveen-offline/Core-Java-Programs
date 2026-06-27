class Co_Prime
{
    public static void main(String args [])
    {
       /*int a = 10;
        int b = a++ + ++a + a++ - a-- - --a + --a + a++ + ++a - a-- - --a + --a ;
        System.out.println(b); b= 10 + 12 + 12 - 12 - 11 + 11 + 11 + 13 - 13 - 12 + 12
         */ 


         int a = 11;
         int b = 25;
         //int m = (a<b) ? a : b;           // GCD 
         /*for(int i=1;i<=m;i++){
            if(a%i==0 && b%i==0){
                System.out.println(i) ;

            }
    }*/

   int temp = 0;
            while(b!=0){
                temp=a%b;
                a=b;
                b=temp;
            }
            System.out.println((a==1)? "coprime" : "not coprime");    
    }
}