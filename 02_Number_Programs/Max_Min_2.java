public class Max_Min_2 {
    public static void main(String [] args)
    {
        int a = 154683;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (a>0) {
            int b = a%10;
            if (b>max) {
                max = b;
            }
            if (b<min) {
                min = b;
            }
            a = a/10;
            
        }
        System.out.println("The maximum digit is: " + max);
        System.out.println("The minimum digit is: " + min); 
        }
    }
