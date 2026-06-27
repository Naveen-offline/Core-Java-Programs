public class Left_Triangle_Pattern {    
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print((j<i)?"_":"*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                System.out.print((j<i)?"_":"*");
            }
            System.out.println();
        }
    }
}