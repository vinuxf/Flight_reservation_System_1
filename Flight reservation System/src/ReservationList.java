import java.util.ArrayList;

public class ReservationList {

    public final ArrayList<ReservationsAttri> reservations;

    public ReservationList() {
        this.reservations = new ArrayList<>();
    }

        //adding bookings to the ArrayList
       public void addBooking(int airLine, String date, int seat){
        ReservationsAttri obj = new ReservationsAttri(airLine,date,seat);
        reservations.add(obj);
        System.out.println("Your reservation successfully added");
        System.out.println(" ");
        System.out.println(" ");
    }

        //Display ArrayList
    public void displayReservations(){

        System.out.println("Airline(num)\t\tDate\t\tSeats");
        System.out.println("-----------------------------------------");
        for(ReservationsAttri i : reservations){
            System.out.println(i.airLine+"\t\t\t"+i.date+"\t\t\t"+i.seats);
        }
        System.out.println("-----------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
    }


}

