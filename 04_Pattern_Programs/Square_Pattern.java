public class Square_Pattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("without spaces in between");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

            System.out.println("with spaces in between");
            System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i==1||i==n||j==1||j==n)?"* ":"  ");
            }
            System.out.println();
        }
    }
}
