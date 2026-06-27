import java.util.Scanner;
class Bus_Booking_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bus[] = new int[10]; 
        int bookedSeats = 0;
        while (true) {
            System.out.println("\nDo you want to book a seat? (Y/N): ");
            String choice = sc.next();

            if (choice.equals("Y")) {

                if (bookedSeats == 10) {
                    System.out.println("All seats are already booked!");
                    break;
                }
                System.out.print("Enter seat number (1-10): ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); 
                    continue;
                }
                int seat = sc.nextInt();
                if (seat < 1 || seat > 10) {
                    System.out.println("Invalid seat number! Choose between 1 and 10.");
                    continue;
                }
                if (bus[seat - 1] == 1) {
                    System.out.println("Seat already booked!");
                } else {
                    bus[seat - 1] = 1;
                    bookedSeats++;
                    System.out.println("Seat " + seat + " booked successfully!");
                }
            } else if (choice.equals("N")) {
                System.out.println("Booking stopped.");
                break;
            } else {
                System.out.println("Invalid choice! Enter Y or N.");
                continue;
            }
            int availableSeats = 0;
            System.out.println("\nSeat Status:");
            for (int i = 0; i < 10; i++) {
                if (bus[i] == 0) {
                    System.out.print(" " + (i + 1) + " "); 
                    availableSeats++;
                } else {
                    System.out.print(" X "); 
                }
            }
            System.out.println("\nAvailable Seats: " + availableSeats);
            System.out.println("Booked Seats: " + bookedSeats);
        }

        sc.close();
    }
}