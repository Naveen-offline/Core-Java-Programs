import java.util.Scanner;
class Bus_Booking_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bus[]= new int[10];
        int  booked_seat=0;
        while(true) {
            System.out.println("User to Booked the Bus seat :(Y/N)");
            String M= sc.next();
            if(M.equals("Y")){
                if(booked_seat<10){
                    bus[booked_seat]=1;
                    booked_seat++;
                } 
                else{
                    System.out.println("All seats are booked!");
                    break;
                }
            }
            else{
                System.out.println("Booking cancelled.");
                break;
            }
            int count=0;
            System.out.println("Bus seats status :");
            for(int i=0;i<10;i++){
                System.out.print(" "+bus[i]);
               
            }
            System.out.println("\nAvailable Sites :"+count);
            System.out.println("Total Booked Site "+booked_seat);
        }
    }
}