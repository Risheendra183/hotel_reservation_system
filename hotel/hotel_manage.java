import java.util.Scanner;

class hotel_manage{
    
 public static void main(String[] args) {
       
      Scanner scanner = new Scanner(System.in);

        hotel_details n = new hotel_details();
        n.details();

        room_details r = new room_details();

        System.out.print("Enter number of single rooms to book: ");
        int rooms = scanner.nextInt();
          r.room(rooms,"single");
        scanner.nextLine(); 
        System.out.print("Enter number of suite rooms to book: ");
        int rooms1 = scanner.nextInt();
          r.room(rooms1, "suite");

        

        reservation_details rd = new reservation_details();

        System.out.print("Enter your name: ");
        rd.setName(scanner.nextLine());
     scanner.nextLine(); 
        System.out.print("Enter your age: ");
        rd.setAge(scanner.nextInt());
         scanner.nextLine();  
        

        System.out.print("Enter your phone number: ");
        rd.setPhone_no(scanner.nextLine());

        System.out.print("Enter your address: ");
        rd.setAddress(scanner.nextLine());

        System.out.print("Enter entry date (dd/mm/yyyy): ");
        rd.setEntryDate(scanner.nextLine());

        System.out.print("Enter exit date (dd/mm/yyyy): ");
        rd.setExitDate(scanner.nextLine());

        System.out.print("Enter entry time : ");
        rd.setEntryTime(scanner.nextLine());

        System.out.print("Enter exit time : ");
        rd.setExitTime(scanner.nextLine());

        System.out.println("________________Customer Details_______________");
        System.out.println("Name      : " + rd.getName());
        System.out.println("Age       : " + rd.getAge());
        System.out.println("Address   : " + rd.getAddress());
        System.out.println("Entry date: " + rd.getEntryDate());
        System.out.println("Exit date : " + rd.getExitDate());
        System.out.println("Entry Time: " + rd.getEntryTime());
        System.out.println("Exit Time : " + rd.getExitTime());

     
       
        System.out.println("Choose payment method (upi/cash/card):");
        String paymentMethod = scanner.nextLine();

        booking_method bm = null;

        switch (paymentMethod.toLowerCase()) {
            case "upi":
                bm = new upi();
                break;
            case "cash":
                bm = new cash();
                break;
            case "card":
                bm = new card();
                break;
            default:
                System.out.println("Invalid payment method selected.");
                return;  // Exit if invalid input
        }

        bm.booking("single",rooms,"suite",rooms1);
        
    }

       
    }


         
