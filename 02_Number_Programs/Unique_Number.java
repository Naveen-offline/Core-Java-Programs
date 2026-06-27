public class Unique_Number {
    public static void main(String[] args) {
        int n = 12321, n1 = n, c = 0, r=0;
        while (n1 > 0) {
            int rem = n1 % 10;
            int t = n;
            while (t > 0) {
                int rem2 = t % 10;
                if (rem == rem2) {
                    r=r+1;
                }
                t /= 10;
            }
            c++;
             n1 /= 10;
        }
        System.out.println(c + " " + r );
        if (c == r) {
            System.out.println("Unique number");
        } else {
            System.out.println("Not Unique number");
        }
    }
    
}
