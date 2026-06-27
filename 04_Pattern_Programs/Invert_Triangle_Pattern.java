public class Invert_Triangle_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               System.out.print((j<n-i)?"*":" ");
             }
            System.out.println();}
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((i+j>=n-1)?"*":" ");
            }
            System.out.println();
        }
    }
}
