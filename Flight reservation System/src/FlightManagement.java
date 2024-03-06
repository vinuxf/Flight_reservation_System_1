public class FlightManagement {

    public String []airlines = {"1.Sri lankan","2.Emirates","3.Gulf air","4.Air arabia"};

    public String[]srilankan = {"1.Flight AA123 - New York to Los Angeles", "2.Flight BA456 - London to Paris", "3..Flight CX789 - Hong Kong to Tokyo"};

    public String[]Emirates = {"1.Flight AA123 - New York to Los Angeles", "2.Flight BA456 - London to Paris", "3.Flight CX789 - Hong Kong to Tokyo", "4.Flight DL321 - Atlanta to Miami"};

    public String[]Gulf = {"1.Flight AA123 - New York to Los Angeles", "2.Flight BA456 - London to Paris", "3.Flight CX789 - Hong Kong to Tokyo", "4.Flight DL321 - Atlanta to Miami"};

    public String[]Arab = {"1.Flight AA123 - New York to Los Angeles", "2.Flight BA456 - London to Paris", "3.Flight CX789 - Hong Kong to Tokyo", "4.Flight DL321 - Atlanta to Miami"};

    public void displayAirlines(){
        for (int i=0;i<airlines.length;i++){
            System.out.println(airlines[i]);
        }
    }

    public void displaysrilankan(){
        for (int i=0;i<srilankan.length;i++){
            System.out.println(srilankan[i]);
        }
    }

    public void displayEmirates(){
        for (int i=0;i<Emirates.length;i++){
            System.out.println(Emirates[i]);
        }
    }

    public void displayGulf(){
        for (int i=0;i<Gulf.length;i++){
            System.out.println(Gulf[i]);
        }
    }

    public void displayArab(){
        for (int i=0;i<Arab.length;i++){
            System.out.println(Arab[i]);
        }
    }
}
