import java.util.Scanner;
class Taxi {
    public static void main( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter taxi number: ");
        String a = sc.nextLine();
        System.out.print("Enter distance travelled :");
        int b = sc.nextInt();
        int c = b,amount = 0;
        if(b<25){
            if (b>=5){
                amount = 100;
                b=b-5;
                amount = (b<10)?amount+(b*10):amount+100;
                b=b-10;
                amount = (b<10)?amount+(b*8):amount+80;
                b=b-10;
            }
        }
        else{
            amount=b*5;
        }
        System.out.println("Taxi no :"+a);
        System.out.println("Distance Travelled"+c);
        System.out.println("Amount"+amount);
    }
}
