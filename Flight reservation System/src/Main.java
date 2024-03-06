import java.util.Scanner;

public class Main {

    private Scanner input;

    public Main() {
        this.input = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println("1.See all flights");
        System.out.println("2.Create a reservation");
        System.out.println("3.Display my reservations");
        System.out.println("4.Exit");
        System.out.println(" ");
        System.out.println("Enter your choice: ");
    }

    public void mainLoop() {
        FlightManagement flyobj = new FlightManagement();
        ReservationList bookings = new ReservationList();

        System.out.println("Welcome to the Flight Management System");
        System.out.println(" ");

        // Create an account
        System.out.println("Press 1 to create an account");
        int user1 = input.nextInt();
        System.out.println("Enter a new username");
        String username = input.next();
        System.out.println("Enter a new password");
        String password = input.next();
        User user = new User(username, password);

        // Login to the created account
        System.out.println("Enter your newly made account details to login to your account");
        System.out.println(" ");
        System.out.println("Username :");
        String loguser = input.next();
        System.out.println("Password :");
        String logpass = input.next();

        // If credentials are ok, continue to the system else it will show an error message
        if (loguser.equals(user.userName) && logpass.equals(user.password)) {
            System.out.println("Hello " + user.userName);
            System.out.println("Welcome to the flight management system");
            System.out.println(" ");

            int choice;
            do {
                mainMenu();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        case1();
                        break;
                    case 2:
                        case2(flyobj, bookings);
                        break;
                    case 3:
                        case3(bookings);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0); // recursion until the user enter 4(exit)
        } else {
            System.out.println("Your credentials are wrong");
            mainLoop();
        }
    }

    public void case1() {
        FlightManagement flyobj = new FlightManagement();
        System.out.println("Select an air line");
        flyobj.displayAirlines();
        int airinput = input.nextInt();
        if (airinput == 1) {
            flyobj.displaysrilankan();
        } else if (airinput == 2) {
            flyobj.displayEmirates();
        } else if (airinput == 3) {
            flyobj.displayGulf();
        } else if (airinput == 4) {
            flyobj.displayArab();
        } else {
            System.out.println("Wrong input. Try again!");
        }

    }

    public void case2(FlightManagement flyobj, ReservationList bookings) {
        System.out.println("Select an airline");
        flyobj.displayAirlines();
        int airLine = input.nextInt();
        System.out.println("Enter a date in this format: yyyy/mm/dd");
        String date = input.next();
        System.out.println("Enter number of seats");
        int seats = input.nextInt();
        bookings.addBooking(airLine, date, seats);
        System.out.println("Reservation created successfully!");
    }

    public void case3(ReservationList bookings) {
        System.out.println("Displaying your reservations:");
        bookings.displayReservations();
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.mainLoop();     }
}
