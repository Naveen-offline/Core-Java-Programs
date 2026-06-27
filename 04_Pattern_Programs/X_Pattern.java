public class X_Pattern {
    public static void main(String[] args) {
        int n = 15;
        for(int i=1; i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                System.out.print((i==j || i+j==n+1)?"* ":"  ");
            }
            System.out.println();
        }
    }    
}
