public class Sandglass_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print((j<i)?" ":"* ");
            } System.out.println();
        }
        for(int i=2; i<n+1;i++){
            for(int j = 0;j<n;j++){
                System.out.print((j<n-i)?" ":"* ");
            } System.out.println();
        }

        /* 
         for(int i=0; i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print((j<i)?" ":"* ");
            }
            System.out.println();
        }
        for(int i=0; i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
            */
    }
}